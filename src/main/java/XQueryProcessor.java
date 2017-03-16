import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.w3c.dom.Node;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Created by Yuning Hui on 2/13/17.
 * Main program for XQuery query evaluation
 */
public class XQueryProcessor {


    public static void main(String[] args) {

        try {

            String query = "for $s in doc(\"j_caesar.xml\")//SPEAKER, $a in doc(\"j_caesar.xml\")//ACT,\n" +
                    "    $sp in $a//SPEAKER, $stxt in $s/text()\n" +
                    "where $sp eq $s and $stxt = \"CAESAR\"\n" +
                    "return <act> { $a/TITLE/text()} </act>";

            ANTLRInputStream input = new ANTLRInputStream(query);
            XQueryLexer lexer = new XQueryLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            XQueryParser parser = new XQueryParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.xq();
            String rewritten = joinRewrite(tree);
            System.out.println(rewritten);
            XQueryEvalVisitor evalVisitor = new XQueryEvalVisitor();

            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");

            File file = new File("XQuery_result.xml");
            if(!file.exists()) file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            StreamResult fsr = new StreamResult(fos);
            StreamResult ssr = new StreamResult(System.out);

            ArrayList<Object> res = evalVisitor.visit(tree);
            for (Object o : res){
                Node tmp = (Node) o;
                t.transform(new DOMSource(tmp), fsr);
                t.transform(new DOMSource(tmp), ssr);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static ArrayList<ArrayList<String>> performGetCondList(ParseTree cond) {
        String cur = cond.getChild(1).getText();
        if(cur.equals("eq") || cur.equals("=")) {
            ArrayList<String> tmpRet= new ArrayList<>();
            tmpRet.add(cond.getChild(0).getText());
            tmpRet.add(cond.getChild(2).getText());

            ArrayList<ArrayList<String>> ret = new ArrayList<>();
            ret.add(tmpRet);
            return ret;
        }
        else {
            ArrayList<ArrayList<String>> ret = new ArrayList<>();
            ret.addAll(performGetCondList(cond.getChild(0)));
            ret.addAll(performGetCondList(cond.getChild(2)));
            return ret;
        }
    }

    private static String generateTupleName(int num) {
        if(num == 0) return "$tuple";
        return "$tuple" + String.valueOf(num - 1);
    }

    private static String constructReturn(ParseTree curNode, HashMap<String, String> invPartition, HashMap<String, String> tupleNameMap) {
        if(curNode instanceof TerminalNode) {
            String curText = curNode.getText();
            if(curText.charAt(0) == '$') {
                String parentVar = invPartition.get(curText);
                String tupleName = tupleNameMap.get(parentVar);
                String varName = curText.substring(1,curText.length());

                return tupleName + '/' + varName + "/*";
            }
            else return curText;
        }
        else {
            String ret = "";
            for(int i = 0; i < curNode.getChildCount(); i++) {
                ret += constructReturn(curNode.getChild(i), invPartition, tupleNameMap);
            }
            return ret;
        }
    }

    private static String joinRewrite(ParseTree xq) {
        if(!xq.getChild(0).getText().contains("for"))
            return "";

        ParseTree forClause = xq.getChild(0);
        ParseTree whereClause = xq.getChild(1);
        ParseTree returnClause = xq.getChild(2);

        HashMap<String, String> varXq = new HashMap<>();
        LinkedHashMap<String, ArrayList<String>> partition = new LinkedHashMap<>();
        HashMap<String, String> invPartition = new HashMap<>();

        for(int i = 1; i < forClause.getChildCount(); i = i + 4) {
            String varName = forClause.getChild(i).getText();
            String varXqVal = forClause.getChild(i + 2).getText();
            varXq.put(varName, varXqVal);
            if(varXqVal.substring(0,4).equals("doc(")) {
                partition.put(varName, new ArrayList<>());
                invPartition.put(varName, varName);
            }
            else {
                int parVarNameEnd = varXqVal.indexOf('/');
                String parVarName = invPartition.get(varXqVal.substring(0,parVarNameEnd));
                invPartition.put(varName, parVarName);
                if(partition.containsKey(parVarName)) {
                    ArrayList<String> partitionVal = partition.get(parVarName);
                    partitionVal.add(varName);
                    partition.put(parVarName, partitionVal);
                }
            }
        }

        ParseTree cond = whereClause.getChild(1);
        ArrayList<ArrayList<String>> condList = performGetCondList(cond);

        HashMap<String, String> parWhere = new HashMap<>();

        for(ArrayList<String> condVar : condList) {
            String var1 = condVar.get(0);
            String var2 = condVar.get(1);

            String var1Parent = invPartition.get(var1);
            String var2Parent = invPartition.get(var2);

            if(var2.charAt(0) == '\"' || var1Parent.equals(var2Parent)) {           // var eq constant, or var eq var, same partition
                if(!parWhere.containsKey(var1Parent)) {
                    String initWhere = "where " + var1 + " " + "eq " + var2 + '\n';
                    parWhere.put(var1Parent, initWhere);
                }
                else {
                    String whereVal = parWhere.get(var1Parent);
                    whereVal += "  and " + var1 + " " + "eq " + var2 + '\n';
                    parWhere.put(var1Parent, whereVal);
                }
            }
        }

        Boolean newMerged = true;
        LinkedHashMap<String, String> joinClause = new LinkedHashMap<>();

        while(newMerged) {
            String var1 = null, var2 = null;
            String var1Parent = null, var2Parent = null;
            newMerged = false;

            for(ArrayList<String> condVar : condList) {                     // find a join
                var1 = condVar.get(0);
                var2 = condVar.get(1);

                if(var1.charAt(0) == '\"' || var2.charAt(0) == '\"') continue;

                var1Parent = invPartition.get(var1);
                var2Parent = invPartition.get(var2);

                if (!var1Parent.equals(var2Parent)) {      // var eq var, different partition, can be merged
                    newMerged = true;
                    break;
                }
            }

            if(!newMerged) break;

            // construct 1st parameter of join
            String var1Join;

            if(joinClause.containsKey(var1Parent)) {                        // already merged at least once, copy directly
                var1Join = joinClause.get(var1Parent);
            }
            else {                                                          // not merged, start from for...where...return
                var1Join = "for ";
                var1Join += var1Parent + " in " + varXq.get(var1Parent);
                ArrayList<String> varList = partition.get(var1Parent);
                for(String var : varList) {
                    var1Join += ",\n    " + var + " in " + varXq.get(var);
                }
                var1Join += '\n';

                String var1ParentName = var1Parent.substring(1, var1Parent.length());  // construct where and return
                if(parWhere.containsKey(var1Parent))
                    var1Join += parWhere.get(var1Parent);
                var1Join += "return <tuple>\n";
                var1Join += "          " + '<' + var1ParentName + "> {" + var1Parent + "} </" + var1ParentName + ">\n";
                for(String var : varList) {
                    String varName = var.substring(1, var.length());
                    var1Join += "          " + '<' + varName + "> {" + var + "} </" + varName + ">\n";
                }
                var1Join += "       </tuple>";
            }

            // construct 2nd parameter of join
            String var2Join;
            if(joinClause.containsKey(var2Parent)) {                        // already merged at least once, copy directly
                var2Join = joinClause.get(var2Parent);
            }
            else {                                                          // not merged, start from for...where...return
                var2Join = "for ";
                var2Join += var2Parent + " in " + varXq.get(var2Parent);
                ArrayList<String> varList = partition.get(var2Parent);
                for(String var : varList) {
                    var2Join += ",\n    " + var + " in " + varXq.get(var);
                }
                var2Join += '\n';

                String var2ParentName = var2Parent.substring(1, var2Parent.length());  // construct where and return
                if(parWhere.containsKey(var2Parent))
                    var2Join += parWhere.get(var2Parent);
                var2Join += "return <tuple>\n";
                var2Join += "          " + '<' + var2ParentName + "> {" + var1Parent + "} </" + var2ParentName + ">\n";
                for(String var : varList) {
                    String varName = var.substring(1, var.length());
                    var2Join += "          " + '<' + varName + "> {" + var + "} </" + varName + ">\n";
                }
                var2Join += "       </tuple>";
            }

            // construct 3rd and 4th parameter of join
            String var3Join = "[", var4Join = "[";

            for(ArrayList<String> condVar : condList) {                 // find all conditions that can be adapted into join
                String tmpVar1 = condVar.get(0);
                String tmpVar2 = condVar.get(1);

                if(tmpVar1.charAt(0) == '\"' || tmpVar2.charAt(0) == '\"') continue;

                String tmpVar1Parent = invPartition.get(tmpVar1);
                String tmpVar2Parent = invPartition.get(tmpVar2);

                if(tmpVar1Parent.equals(var1Parent) && tmpVar2Parent.equals(var2Parent)) {  // par1 eq par2
                    String var1Name = tmpVar1.substring(1, tmpVar1.length());
                    String var2Name = tmpVar2.substring(1, tmpVar2.length());
                    if(var3Join.equals("[")) {
                        var3Join += var1Name;
                    }
                    else {
                        var3Join += ", " + var1Name;
                    }
                    if(var4Join.equals("[")) {
                        var4Join += var2Name;
                    }
                    else {
                        var4Join += ", " + var2Name;
                    }
                }

                if(tmpVar2Parent.equals(var1Parent) && tmpVar1Parent.equals(var2Parent)) {  // par2 eq par1
                    String var1Name = tmpVar1.substring(1, tmpVar1.length());
                    String var2Name = tmpVar2.substring(1, tmpVar2.length());
                    if(var3Join.equals("[")) {
                        var3Join += var2Name;
                    }
                    else {
                        var3Join += ", " + var2Name;
                    }
                    if(var4Join.equals("[")) {
                        var4Join += var1Name;
                    }
                    else {
                        var4Join += ", " + var1Name;
                    }
                }
            }

            var3Join += "]";
            var4Join += "]";

            // construct join clause, always assume the 2nd partition was merged into the 1st partition
            String joinString = "join (\n" + var1Join + ",\n\n" + var2Join + ",\n\n" + var3Join + ",\n" + var4Join + " )\n";
            joinClause.put(var1Parent, joinString);

            // set 2nd partition all to 1st partition
            invPartition.put(var2Parent, var1Parent);
            ArrayList<String> varList = partition.get(var2Parent);
            for(String var : varList)
                invPartition.put(var, var1Parent);

            //System.out.println(joinString);
        }

        // construct final query

        int joinNum = 0;
        HashMap<String, String> tupleNameMap = new HashMap<>();

        for(Map.Entry<String, String> entry : joinClause.entrySet()) {
            String key = entry.getKey();
            String tupleName = generateTupleName(joinNum);
            tupleNameMap.put(key, tupleName);
            joinNum++;
        }

        String returnPart = constructReturn(returnClause, invPartition, tupleNameMap);

        String ret = "for ";
        joinNum = 0;

        for(Map.Entry<String, String> entry : joinClause.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String tupleName = tupleNameMap.get(key);
            if(joinNum > 0) ret += ",\n";
            ret += tupleName + " in " + value;
            joinNum++;
        }

        ret += "\n" + returnPart;

        System.out.println(ret);
        return "";
    }
}

