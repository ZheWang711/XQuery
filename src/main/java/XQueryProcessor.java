import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;


/**
 * Created by Yuning Hui on 2/13/17.
 * Main program for XQuery query evaluation
 */
public class XQueryProcessor {


    public static void main(String[] args) {

        try {

            String query = "for $tuple in join (for $b in doc(\"test.xml\")//book,\n" +
                    "                        $tb in $b/title\n" +
                    "                    return <tuple>{ <b> {$b} </b>, <tb> {$tb} </tb> }</tuple>,\n" +
                    "\n" +
                    "                    for $a in doc(\"test_review.xml\")//entry,\n" +
                    "                        $ta in $a/title\n" +
                    "                    return <tuple>{ <a> {$a} </a>, <ta> {$ta} </ta> }</tuple>,\n" +
                    "\n" +
                    "                    [tb], [ta] )\n" +
                    "return\n" +
                    "    <book-with-prices>\n" +
                    "        { $tuple/tb/*,\n" +
                    "        <price-review>{ $tuple/a/*/price }</price-review>,\n" +
                    "        <price>{ $tuple/b/*/price }</price> }\n" +
                    "    </book-with-prices>";

            ANTLRInputStream input = new ANTLRInputStream(query);
            XQueryLexer lexer = new XQueryLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            XQueryParser parser = new XQueryParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.xq();
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
}

