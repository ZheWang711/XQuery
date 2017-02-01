import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;

//ParseTreeProperty

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
//        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder;
//        Document document;
//
//        builder = builderFactory.newDocumentBuilder();
//        document = builder.parse(new FileInputStream(fileName));
//        Node doc_elem = document.getDocumentElement();
//        doc_elem.normalize();
//        return doc_elem;

        File fXmlFile = new File(fileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.normalize();
        //doc.getDocumentElement().normalize();
        return (Node) doc;

    }

    @Override
    public ArrayList<Object> visitAbs_slash(XPathParser.Abs_slashContext ctx) {
        ArrayList<Object> res = null;
        try {
            n = load_doc(ctx.FILENAME().getText());
            res = visit(ctx.re_path());
        } catch (Exception e) {
            e.printStackTrace();
        }
        n = null;
        return res;
    }

    @Override
    public ArrayList<Object> visitText(XPathParser.TextContext ctx) {
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
    public ArrayList<Object> visitDot(XPathParser.DotContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ret.add(n);
        return ret;
    }

    @Override
    public ArrayList<Object> visitRe_slash(XPathParser.Re_slashContext ctx) {
        ArrayList<Object> res = new ArrayList<>();
        ArrayList<Object> X = visit(ctx.re_path().get(0));
        HashSet<Object> hs = new HashSet<>();
        for (Object x : X) {
            Node tmp = n;
            n = (Node) x;
            res.add(visit(ctx.re_path().get(1)));
            n = tmp; // back track, illuminate side effect
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
    public ArrayList<Object> visitRe_db_slash(XPathParser.Re_db_slashContext ctx){
        Node tmp = n;
        ArrayList<Object> res = new ArrayList<>();

        if (!n.hasChildNodes()){
            return res;
        }

        ArrayList<Object> children = visit(ctx.re_path().get(0));

        for (Object child : children){
            n = (Node) child;
            res.addAll(visit(ctx.re_path().get(1)));
        }
        n = tmp;
        return res;
    }


    @Override
    public ArrayList<Object> visitDouble_dot(XPathParser.Double_dotContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        Node parent = n.getParentNode();

        if (parent != null) ret.add(parent);

        return ret;
    }

    @Override
    public ArrayList<Object> visitWildcard(XPathParser.WildcardContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        NodeList nodeList = n.getChildNodes();

        for (int i = 0, len = nodeList.getLength(); i < len; i++)
            ret.add(nodeList.item(i));

        return ret;
    }

    @Override
    public ArrayList<Object> visitAtt_name(XPathParser.Att_nameContext ctx) {
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
    public ArrayList<Object> visitTag(XPathParser.TagContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        String tagName = ctx.TAGNAME().getText();

        NodeList nodeList = n.getChildNodes();

        for (int i = 0, len = nodeList.getLength(); i < len; i++) {
            Node cur = nodeList.item(i);
            if (cur.getNodeName().equals(tagName)) ret.add(cur);
        }

        return ret;
    }
}
