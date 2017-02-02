// Generated from Binaryexpression.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BinaryexpressionParser}.
 */
public interface BinaryexpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BinaryexpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BinaryexpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryexpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BinaryexpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BinaryexpressionParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(BinaryexpressionParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryexpressionParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(BinaryexpressionParser.ExpContext ctx);
}