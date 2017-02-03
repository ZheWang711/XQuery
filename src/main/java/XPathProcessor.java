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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zhewang711 on 1/31/17.
 */
public class XPathProcessor {


    public static void main(String[] args) {

        try {
            ANTLRInputStream input = new ANTLRInputStream(System.in);
            XPathLexer lexer = new XPathLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            XPathParser parser = new XPathParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.abs_path();
            EvalVisitor evalVisitor = new EvalVisitor();

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

            File file = new File("result.xml");
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

