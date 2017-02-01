import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.util.ArrayList;


/**
 * Created by zhewang711 on 1/31/17.
 */

public class EvalVisitor extends XPathBaseVisitor<ArrayList<Object>> {

    private Node n = null; // parameter node

    /* Java XML Reference: http://tutorials.jenkov.com/java-xml/dom.html */
    // shift tab -- adjust space
    // control alt o -- optimizing import
    // control + delete -- delete a line
    private Node load_doc(String fileName) throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document document;

        builder = builderFactory.newDocumentBuilder();
        document = builder.parse(new FileInputStream(fileName));
        return document.getDocumentElement();
    }

    @Override
    public ArrayList<Object> visitAbs_slash(XPathParser.Abs_slashContext ctx) {
        ArrayList<Object> res = null;
        try{
            n = load_doc(ctx.FILENAME().getText());
            res = visit(ctx.re_path());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        n = null;
        return res;
    }

    @Override
    public ArrayList<Object> visitText(XPathParser.TextContext ctx){
        System.out.println("text visited!");
        return null;
    }







}
