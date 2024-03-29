import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

//ParseTreeProperty

/**
 * Created by Zhe Wang on 1/31/17.
 * Custom Visitor for XPath Queries.
 */

public class EvalVisitor extends XPathBaseVisitor<ArrayList<Object>> {

    private Node n = null; // parameter node

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
        Document doc = dBuilder.parse(fXmlFile);
        doc.normalize();
        return doc;
    }

    @Override
    public ArrayList<Object> visitAbs_slash(XPathParser.Abs_slashContext ctx) {
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
    public ArrayList<Object> visitAbs_db_slash(XPathParser.Abs_db_slashContext ctx){

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
    public ArrayList<Object> visitRe_db_slash(XPathParser.Re_db_slashContext ctx){
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

    @Override
    public ArrayList<Object> visitRe_expr(XPathParser.Re_exprContext ctx) {
        return visit(ctx.re_path());
    }

    @Override
    public ArrayList<Object> visitConcatenate(XPathParser.ConcatenateContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();

        Node tmp = n;
        ret.addAll(visit(ctx.re_path().get(0)));
        n = tmp;
        ret.addAll(visit(ctx.re_path().get(1)));

        return ret;
    }

    @Override
    public ArrayList<Object> visitRe_filter(XPathParser.Re_filterContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList <Object> rp = visit(ctx.re_path());

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
    public ArrayList<Object> visitFilter_re(XPathParser.Filter_reContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList <Object> rp = visit(ctx.re_path());

        if(!rp.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitValue_eq(XPathParser.Value_eqContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList <Object> rp1 = visit(ctx.re_path().get(0));
        ArrayList <Object> rp2 = visit(ctx.re_path().get(1));

        for(Object node1 : rp1)
            for(Object node2 : rp2) {
                Node left = (Node)node1;
                Node right = (Node)node2;
                if(left.isEqualNode(right)) return ret;
            }

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitId_eq(XPathParser.Id_eqContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList <Object> rp1 = visit(ctx.re_path().get(0));
        ArrayList <Object> rp2 = visit(ctx.re_path().get(1));

        for(Object node1 : rp1)
            for(Object node2 : rp2) {
                Node left = (Node)node1;
                Node right = (Node)node2;
                if(left == right) return ret;
            }

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitFilter_eq(XPathParser.Filter_eqContext ctx) {
        return visit(ctx.filter());
    }

    @Override
    public ArrayList<Object> visitFilter_and(XPathParser.Filter_andContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList <Object> rp1 = visit(ctx.filter().get(0));
        ArrayList <Object> rp2 = visit(ctx.filter().get(1));

        if(rp1.isEmpty() && rp2.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitFilter_or(XPathParser.Filter_orContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList <Object> rp1 = visit(ctx.filter().get(0));
        ArrayList <Object> rp2 = visit(ctx.filter().get(1));

        if(rp1.isEmpty() || rp2.isEmpty()) return ret;

        return returnFalse();
    }

    @Override
    public ArrayList<Object> visitFilter_not(XPathParser.Filter_notContext ctx) {
        ArrayList<Object> ret = new ArrayList<>();
        ArrayList <Object> rp = visit(ctx.filter());

        if(!rp.isEmpty()) return ret;

        return returnFalse();
    }
}
