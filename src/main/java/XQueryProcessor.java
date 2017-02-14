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

            String input_xq = "for $s in doc(\"j_caesar.xml\")/PLAY/FM/P,\n" +
                    "$t in doc(\"j_caesar.xml\")/PLAY/TITLE\n" +
                    "return <title>{$s/text(), <lalala>{$t/text()}</lalala>}\n" +
                    "      </title>";
            ANTLRInputStream input = new ANTLRInputStream(input_xq);
            XQueryLexer lexer = new XQueryLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            XQueryParser parser = new XQueryParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.xq();
            XQueryEvalVisitor evalVisitor = new XQueryEvalVisitor();

            // Print out Parse Tree
//            JFrame frame = new JFrame("Antlr AST");
//            JPanel panel = new JPanel();
//            TreeViewer viewr = new TreeViewer(Arrays.asList(
//                    parser.getRuleNames()),tree);
//            viewr.setScale(1.5);//scale a little
//            panel.add(viewr);
//            frame.add(panel);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(200,200);
//            frame.setVisible(true);

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

