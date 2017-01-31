import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by zhewang711 on 1/31/17.
 */
public class XPathProcessor {


    public static void main(String[] args) {

        try {
            ANTLRInputStream input = new ANTLRInputStream("doc(\"x.xml\")/a/text()");
            XPathLexer lexer = new XPathLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            XPathParser parser = new XPathParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.abs_path();
            EvalVisitor evalVisitor = new EvalVisitor();
            evalVisitor.visit(tree);

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }

}

