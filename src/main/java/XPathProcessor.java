import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zhewang711 on 1/31/17.
 */
public class XPathProcessor {


    public static void main(String[] args) {

        try {

            // ok: "doc(\"j_caesar.xml\")/PLAY//P/text()"
            ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PLAY/*//*//text()");
            XPathLexer lexer = new XPathLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            XPathParser parser = new XPathParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.abs_path();
            EvalVisitor evalVisitor = new EvalVisitor();

            //System.out.println(tree.toStringTree(parser));

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



            ArrayList<Object> res = evalVisitor.visit(tree);
            for (Object o : res){
                System.out.println(o.toString());
            }



        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }

}

