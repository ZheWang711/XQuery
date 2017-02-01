import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
    public ArrayList<Object> visitText(XPathParser.TextContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        NodeList nodeList = n.getChildNodes();

        for(int i = 0, len = nodeList.getLength(); i < len ; i++) {
            Node cur = nodeList.item(i);
            if(cur.getNodeType() == Node.TEXT_NODE)
                ret.add(cur);
        }

        return ret;
    }

    @Override
    public ArrayList<Object> visitDot(XPathParser.DotContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ret.add(n);
        return ret;
    }

    @Override
    public ArrayList<Object> visitDouble_dot(XPathParser.Double_dotContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        Node parent = n.getParentNode();

        if(parent != null) ret.add(parent);

        return ret;
    }

    @Override
    public ArrayList<Object> visitWildcard(XPathParser.WildcardContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        NodeList nodeList = n.getChildNodes();

        for(int i = 0, len = nodeList.getLength(); i < len ; i++)
            ret.add(nodeList.item(i));

        return ret;
    }
}