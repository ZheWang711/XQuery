import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Yuning Hui on 2017/2/10.
 * Custom Visitor for XQuery Queries.
 */

public class XQueryEvalVisitor extends XQueryBaseVisitor<ArrayList<Object>> {
    private Node n = null; // parameter node
    private Document tmp_doc = null;

    private HashMap<String, ArrayList<Object> > context = new HashMap<>(); // simulate the context on the top of stack

    public ArrayList<Object> visitXq_var(XQueryParser.Xq_varContext ctx) {
        ArrayList<Object> ret = context.get(ctx.VAR().getText());
        if(ret == null) return new ArrayList<Object>();
        return context.get(ctx.VAR().getText());
    }

    // param@ level: [0, n-1], call nested_loop(0) outside
    // return: a list of possible contexts (variable value mapping) [{v->Node}]
    private ArrayList<HashMap<String, Node>> nested_loop(int level, XQueryParser.ForContext ctx){

        if (level == ctx.VAR().size() - 1) { // base case, last layer
            ArrayList<HashMap<String, Node>> res = new ArrayList<>();
            String curr_var = ctx.VAR(level).getText(); // current variable
            ArrayList<Object> curr_vals = visit(ctx.xq(level));

            for (Object curr_val : curr_vals){
                HashMap<String, Node> tmp = new HashMap<>();
                tmp.put(curr_var, (Node) curr_val);
                res.add(tmp);
            }

            return res;
        }

        HashMap<String, ArrayList<Object> >  tmp = new HashMap<>(context); // store the current context into temporary memory

        ArrayList<HashMap<String, Node>> res = new ArrayList<>();
        String curr_var = ctx.VAR(level).getText(); // current variable
        ArrayList<Object> curr_vals = visit(ctx.xq(level));

        for (Object curr_val : curr_vals){
            ArrayList<Object> curr_cal_arr = new ArrayList<>();
            curr_cal_arr.add(curr_val);
            context.put(curr_var, curr_cal_arr); // set the state

            ArrayList<HashMap<String, Node>> rem_ctxs = nested_loop(level + 1, ctx);

            for (HashMap<String, Node> rem_ctx : rem_ctxs){
                HashMap<String, Node> tmp_ctx = new HashMap<>(rem_ctx);
                tmp_ctx.put(curr_var, (Node) curr_val);
                res.add(tmp_ctx);

            }
            context = tmp; // recover the context
        }

        return res;
    }

    //[{v->[Node len=1]}]
    @Override
    public ArrayList<Object> visitFor(XQueryParser.ForContext ctx){
        ArrayList<Object> res = new ArrayList<>();
        ArrayList<HashMap<String, Node>> loop_contexts = nested_loop(0, ctx);

        for (HashMap<String, Node> loop_context : loop_contexts){
            HashMap<String, ArrayList<Object>> tmp = new HashMap<>();
            for (String var : loop_context.keySet()){
                ArrayList<Object> val = new ArrayList<>(); // value, a list with only 1 object
                val.add(loop_context.get(var));
                tmp.put(var, val);
            }
            res.add(tmp);
        }
        return res;
    }

    @Override
    public ArrayList<Object> visitXq_flwr(XQueryParser.Xq_flwrContext ctx){
        ArrayList<Object> res = new ArrayList<>();
        ArrayList<Object> loop_ctxts = visit(ctx.for_clause());  // [var->[Node len=1]]
        HashMap<String, ArrayList<Object>> tmp = new HashMap<>(context); //

        for (Object loop_ctx : loop_ctxts){
            context.putAll((HashMap<String, ArrayList<Object>>) loop_ctx); // set context to Cn

            if (ctx.let_clause() != null){
                visit(ctx.let_clause()); // set context to Cn+k
            }

            if (ctx.where_clause() != null){
                if (visit(ctx.where_clause()).isEmpty()){
                    res.addAll(visit(ctx.return_clause()));
                }
            }
            else{
                res.addAll(visit(ctx.return_clause()));
            }
        }
        context = tmp; // restore context
        return res;
    }

    @Override
    public ArrayList<Object> visitWhere(XQueryParser.WhereContext ctx) {
        return visit(ctx.cond());
    }

    @Override
    public ArrayList<Object> visitReturn(XQueryParser.ReturnContext ctx) {
        return visit(ctx.xq());
    }

    @Override
    public ArrayList<Object> visitXq_expr(XQueryParser.Xq_exprContext ctx) {
        return visit(ctx.xq());
    }

    @Override
    public ArrayList<Object> visitXq_abs_path(XQueryParser.Xq_abs_pathContext ctx) {
        return visit(ctx.abs_path());
    }

    @Override
    public ArrayList<Object> visitXq_concatenate(XQueryParser.Xq_concatenateContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        Node tmp = n;

        ret.addAll(visit(ctx.xq().get(0)));
        n = tmp;
        ret.addAll(visit(ctx.xq().get(1)));

        return ret;
    }

    @Override
    public ArrayList<Object> visitXq_slash(XQueryParser.Xq_slashContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> tmp = visit(ctx.xq());

        for (Object x : tmp) {
            n = (Node) x;
            ret.addAll(visit(ctx.re_path()));
        }
        return unique(ret);
    }

    @Override
    public ArrayList<Object> visitXq_db_slash(XQueryParser.Xq_db_slashContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> children = visit(ctx.xq());

        for (Object child : children){
            for (Node node : all_children((Node) child)){
                n = node.getParentNode();
                ret.addAll(visit(ctx.re_path()));
            }
        }
        return unique(ret);
    }

    @Override
    public ArrayList<Object> visitXq_string(XQueryParser.Xq_stringContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        if(tmp_doc == null) createTempDocument();

        String text = ctx.STRING_CONST().getText();
        int textLen = text.length();

        Node tmp = tmp_doc.createTextNode(text.substring(1, textLen-1));
        ret.add(tmp);
        return ret;
    }

    @Override
    public ArrayList<Object> visitXq_tag(XQueryParser.Xq_tagContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> tmp = visit(ctx.xq());

        // check the tag name
        String tagName = ctx.TAGNAME().get(0).getText();
        String tagNameEnd = ctx.TAGNAME().get(1).getText();
        if(!tagName.equals(tagNameEnd)) System.out.format("Tag name mismatch: start with %s, end with %s.", tagName, tagNameEnd);

        if(tmp_doc == null) createTempDocument();
        Node tmpNode = tmp_doc.createElement(tagName);
        for(Object x : tmp) {
            Node tmpX = (Node) x;
            tmpX = tmp_doc.importNode(tmpX,true);
            tmpNode.appendChild(tmpX);
        }
        ret.add(tmpNode);

        return ret;
    }

    @Override
    public ArrayList<Object> visitLet(XQueryParser.LetContext ctx) {
        int varCount = ctx.VAR().size();

        for(int i = 0; i < varCount; i++) {
            String varName = ctx.VAR(i).getText();
            ArrayList<Object> varVal = visit(ctx.xq(i));
            context.put(varName, varVal);
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Object> visitXq_let(XQueryParser.Xq_letContext ctx) {
        ArrayList<Object> ret;
        HashMap<String, ArrayList<Object> > tmpContext = new HashMap<>(context);

        visit(ctx.let_clause());
        ret = visit(ctx.xq());
        context = tmpContext;

        return ret;
    }

    @Override
    public ArrayList<Object> visitCond_eq(XQueryParser.Cond_eqContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.xq().get(0));
        ArrayList<Object> rp2 = visit(ctx.xq().get(1));

        for(Object node1 : rp1)
            for(Object node2 : rp2) {
                Node left = (Node)node1;
                Node right = (Node)node2;
                if(left.isEqualNode(right))
                    return ret;
            }

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitCond_is(XQueryParser.Cond_isContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.xq().get(0));
        ArrayList<Object> rp2 = visit(ctx.xq().get(1));

        for(Object node1 : rp1)
            for(Object node2 : rp2) {
                Node left = (Node)node1;
                Node right = (Node)node2;
                if(left == right) return ret;
            }

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitCond_empty(XQueryParser.Cond_emptyContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp = visit(ctx.xq());

        if(rp.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitCond_expr(XQueryParser.Cond_exprContext ctx) {
        return visit(ctx.cond());
    }

    @Override
    public ArrayList<Object> visitCond_some(XQueryParser.Cond_someContext ctx) {
        HashMap<String, ArrayList<Object> > tmpContext = new HashMap<>(context);

        int varCount = ctx.VAR().size();
        for(int i = 0; i < varCount; i++) {
            ArrayList<Object> res = visit(ctx.xq().get(i));
            context.put(ctx.VAR().get(i).getText(), res);
        }

        ArrayList<Object> ret = visit(ctx.cond());

        context = tmpContext;
        return ret;
    }

    @Override
    public ArrayList<Object> visitCond_and(XQueryParser.Cond_andContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.cond().get(0));
        ArrayList<Object> rp2 = visit(ctx.cond().get(1));

        if(rp1.isEmpty() && rp2.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitCond_or(XQueryParser.Cond_orContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.cond().get(0));
        ArrayList<Object> rp2 = visit(ctx.cond().get(1));

        if(rp1.isEmpty() || rp2.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitCond_not(XQueryParser.Cond_notContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp = visit(ctx.cond());

        if(!rp.isEmpty()) return ret;

        return returnFalse();
    }

    // Referencing https://examples.javacodegeeks.com/core-java/xml/dom/create-dom-document-from-scratch/
    // About how to create a scratch element or text node in a document.

    private void createTempDocument() {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            tmp_doc = builder.newDocument();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // XPath queries, same as EvalVisitor class

    private ArrayList<Node> all_children(Node root){
        ArrayList<Node> res = new ArrayList<>();
        for (int i = 0; i < root.getChildNodes().getLength(); ++i){
            res.add(root.getChildNodes().item(i));
            res.addAll(all_children(root.getChildNodes().item(i)));
        }
        return res;
    }

    /* Java XML Reference: http://tutorials.jenkov.com/java-xml/dom.html */
    // shift tab -- adjust space
    // control alt o -- optimizing import
    // control + delete -- delete a line
    private Node load_doc(String fileName) throws Exception {
        File fXmlFile = new File(fileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document tmpDoc = dBuilder.parse(fXmlFile);
        tmpDoc.normalize();
        return tmpDoc;
    }

    @Override
    public ArrayList<Object> visitAbs_slash(XQueryParser.Abs_slashContext ctx) {
        ArrayList<Object> res = new ArrayList<>();
        try {
            n = load_doc(ctx.FILENAME().getText());
            res = visit(ctx.re_path());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public ArrayList<Object> visitAbs_db_slash(XQueryParser.Abs_db_slashContext ctx){

        try{
            n = load_doc(ctx.FILENAME().getText());
        } catch (Exception e){
            e.printStackTrace();
        }

        ArrayList<Object> res = new ArrayList<>();
        NodeList children = n.getChildNodes();

        for (int i = 0; i < children.getLength(); ++i){
            for (Node node : all_children(children.item(i))){
                n = node.getParentNode();
                res.addAll(visit(ctx.re_path()));
            }
        }
        return unique(res);
    }

    @Override
    public ArrayList<Object> visitText(XQueryParser.TextContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        NodeList nodeList = n.getChildNodes();

        for (int i = 0, len = nodeList.getLength(); i < len; i++) {
            Node cur = nodeList.item(i);
            if (cur.getNodeType() == Node.TEXT_NODE)
                ret.add(cur);
        }

        return ret;
    }

    @Override
    public ArrayList<Object> visitDot(XQueryParser.DotContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ret.add(n);
        return ret;
    }

    @Override
    public ArrayList<Object> visitRe_slash(XQueryParser.Re_slashContext ctx) {
        ArrayList<Object> res = new ArrayList<>();
        ArrayList<Object> X = visit(ctx.re_path().get(0));

        for (Object x : X) {
            n = (Node) x;
            res.addAll(visit(ctx.re_path().get(1)));
        }
        return unique(res);
    }

    static private ArrayList<Object> unique(ArrayList<Object> arr){  // eliminate duplication
        ArrayList<Object> res = new ArrayList<>();
        HashSet<Object> hs = new HashSet<>();
        hs.addAll(arr);
        res.addAll(hs);
        return res;
    }

    @Override
    public ArrayList<Object> visitRe_db_slash(XQueryParser.Re_db_slashContext ctx){
        ArrayList<Object> res = new ArrayList<>();
        ArrayList<Object> children = visit(ctx.re_path().get(0));

        for (Object child : children){
            for (Node node : all_children((Node) child)){
                n = node.getParentNode();
                res.addAll(visit(ctx.re_path().get(1)));
            }
        }
        return unique(res);
    }


    @Override
    public ArrayList<Object> visitDouble_dot(XQueryParser.Double_dotContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        Node parent = n.getParentNode();

        if (parent != null) ret.add(parent);

        return ret;
    }

    @Override
    public ArrayList<Object> visitWildcard(XQueryParser.WildcardContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        NodeList nodeList = n.getChildNodes();

        for (int i = 0, len = nodeList.getLength(); i < len; i++)
            ret.add(nodeList.item(i));

        return ret;
    }

    @Override
    public ArrayList<Object> visitAtt_name(XQueryParser.Att_nameContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        if (!(n instanceof Element)) return ret;

        String attName = ctx.ATTNAME().getText();
        NodeList nodeList = n.getChildNodes();

        for (int i = 0, len = nodeList.getLength(); i < len; i++) {
            Node cur = nodeList.item(i);
            if (cur.getNodeType() == Node.ATTRIBUTE_NODE && cur.getNodeName().equals(attName)) {
                ret.add(cur);
                break;
            }
        }

        return ret;
    }

    @Override
    public ArrayList<Object> visitTag(XQueryParser.TagContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        String tagName = ctx.TAGNAME().getText();

        NodeList nodeList = n.getChildNodes();

        for (int i = 0, len = nodeList.getLength(); i < len; i++) {
            Node cur = nodeList.item(i);
            if (cur.getNodeName().equals(tagName)) ret.add(cur);
        }

        return ret;
    }

    @Override
    public ArrayList<Object> visitRe_expr(XQueryParser.Re_exprContext ctx) {
        return visit(ctx.re_path());
    }

    @Override
    public ArrayList<Object> visitConcatenate(XQueryParser.ConcatenateContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();

        Node tmp = n;
        ret.addAll(visit(ctx.re_path().get(0)));
        n = tmp;
        ret.addAll(visit(ctx.re_path().get(1)));

        return ret;
    }

    @Override
    public ArrayList<Object> visitRe_filter(XQueryParser.Re_filterContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp = visit(ctx.re_path());

        for(Object node : rp) {
            Node tmp = n;
            n = (Node)node;
            Boolean fResult = visit(ctx.filter()).isEmpty(); // empty means true, not empty means false;
            if(fResult) ret.add(node);
            n = tmp;
        }

        return ret;
    }

    private ArrayList<Object> returnFalse() {
        Boolean tmp = false;
        ArrayList<Object> ret = new ArrayList<>();

        ret.add(tmp);
        return ret;
    }

    @Override
    public ArrayList<Object> visitFilter_re(XQueryParser.Filter_reContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp = visit(ctx.re_path());

        if(!rp.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitValue_eq(XQueryParser.Value_eqContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.re_path().get(0));
        ArrayList<Object> rp2 = visit(ctx.re_path().get(1));

        for(Object node1 : rp1)
            for(Object node2 : rp2) {
                Node left = (Node)node1;
                Node right = (Node)node2;
                if(left.isEqualNode(right)) return ret;
            }

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitId_eq(XQueryParser.Id_eqContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.re_path().get(0));
        ArrayList<Object> rp2 = visit(ctx.re_path().get(1));

        for(Object node1 : rp1)
            for(Object node2 : rp2) {
                Node left = (Node)node1;
                Node right = (Node)node2;
                if(left == right) return ret;
            }

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitFilter_eq(XQueryParser.Filter_eqContext ctx) {
        return visit(ctx.filter());
    }

    @Override
    public ArrayList<Object> visitFilter_and(XQueryParser.Filter_andContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.filter().get(0));
        ArrayList<Object> rp2 = visit(ctx.filter().get(1));

        if(rp1.isEmpty() && rp2.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitFilter_or(XQueryParser.Filter_orContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.filter().get(0));
        ArrayList<Object> rp2 = visit(ctx.filter().get(1));

        if(rp1.isEmpty() || rp2.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitFilter_not(XQueryParser.Filter_notContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp = visit(ctx.filter());

        if(!rp.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitXq_join(XQueryParser.Xq_joinContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList<Object> rp1 = visit(ctx.join_clause().xq().get(0));
        ArrayList<Object> rp2 = visit(ctx.join_clause().xq().get(1));
        HashMap<ArrayList<String>, ArrayList<Object>> resultMap = new HashMap<>();

        int varSize = ctx.join_clause().attr(0).TAGNAME().size();

        for(Object o : rp1) {
            Node node = (Node) o;
            ArrayList<String> valueList = new ArrayList<>();
            for(int i = 0; i < varSize; i++) {
                String varName = ctx.join_clause().attr(0).TAGNAME(i).getText();
                String varValue = ((Element)node).getElementsByTagName(varName).item(0).getTextContent();
                valueList.add(varValue);
            }

            ArrayList<Object> tmpNodeList;
            if(resultMap.containsKey(valueList))
                tmpNodeList = resultMap.get(valueList);
            else
                tmpNodeList = new ArrayList<>();

            tmpNodeList.add(node.cloneNode(true));
            resultMap.put(valueList, tmpNodeList);
        }

        for(Object o : rp2) {
            Node node = (Node) o;
            ArrayList<String> valueList = new ArrayList<>();
            for(int i = 0; i < varSize; i++) {
                String varName = ctx.join_clause().attr(1).TAGNAME(i).getText();
                String varValue = ((Element)node).getElementsByTagName(varName).item(0).getTextContent();
                valueList.add(varValue);
            }
            ArrayList<Object> tmpNodeList = resultMap.get(valueList);
            if(tmpNodeList != null) {
                for(Object oo : tmpNodeList) {
                    Node tmpNode = (Node) oo;
                    Node newNode = tmpNode.cloneNode(true);
                    NodeList nodesAdd = node.getChildNodes();
                    int nodesAddSize = nodesAdd.getLength();
                    for(int i = 0; i < nodesAddSize; i++)
                        newNode.appendChild(nodesAdd.item(i).cloneNode(true));
                    ret.add(newNode);
                }
            }
        }

        return ret;
    }
}
