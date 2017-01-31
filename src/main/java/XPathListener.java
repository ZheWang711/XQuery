// Generated from XPath.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code abs_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void enterAbs_slash(XPathParser.Abs_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void exitAbs_slash(XPathParser.Abs_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void enterAbs_db_slash(XPathParser.Abs_db_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void exitAbs_db_slash(XPathParser.Abs_db_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate(XPathParser.ConcatenateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate(XPathParser.ConcatenateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterDouble_dot(XPathParser.Double_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitDouble_dot(XPathParser.Double_dotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterDot(XPathParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitDot(XPathParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_db_slash(XPathParser.Re_db_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_db_slash(XPathParser.Re_db_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterTag(XPathParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitTag(XPathParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterText(XPathParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitText(XPathParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_expr(XPathParser.Re_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_expr(XPathParser.Re_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterAtt_name(XPathParser.Att_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitAtt_name(XPathParser.Att_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_filter(XPathParser.Re_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_filter(XPathParser.Re_filterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(XPathParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(XPathParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_slash(XPathParser.Re_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_slash(XPathParser.Re_slashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(XPathParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(XPathParser.Filter_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(XPathParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(XPathParser.Filter_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterId_eq(XPathParser.Id_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitId_eq(XPathParser.Id_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterValue_eq(XPathParser.Value_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitValue_eq(XPathParser.Value_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_re(XPathParser.Filter_reContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_re(XPathParser.Filter_reContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(XPathParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(XPathParser.Filter_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(XPathParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(XPathParser.Filter_notContext ctx);
}