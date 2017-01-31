// Generated from XPath.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
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
	void enterAbs_slash(@NotNull XPathParser.Abs_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void exitAbs_slash(@NotNull XPathParser.Abs_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(@NotNull XPathParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(@NotNull XPathParser.Filter_andContext ctx);

	/**
	 * Enter a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate(@NotNull XPathParser.ConcatenateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate(@NotNull XPathParser.ConcatenateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(@NotNull XPathParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(@NotNull XPathParser.Filter_eqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterId_eq(@NotNull XPathParser.Id_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitId_eq(@NotNull XPathParser.Id_eqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterDot(@NotNull XPathParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitDot(@NotNull XPathParser.DotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterValue_eq(@NotNull XPathParser.Value_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitValue_eq(@NotNull XPathParser.Value_eqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_expr(@NotNull XPathParser.Re_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_expr(@NotNull XPathParser.Re_exprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterAtt_name(@NotNull XPathParser.Att_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitAtt_name(@NotNull XPathParser.Att_nameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_filter(@NotNull XPathParser.Re_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_filter(@NotNull XPathParser.Re_filterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_re(@NotNull XPathParser.Filter_reContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_re(@NotNull XPathParser.Filter_reContext ctx);

	/**
	 * Enter a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(@NotNull XPathParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(@NotNull XPathParser.WildcardContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_slash(@NotNull XPathParser.Re_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_slash(@NotNull XPathParser.Re_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void enterAbs_db_slash(@NotNull XPathParser.Abs_db_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void exitAbs_db_slash(@NotNull XPathParser.Abs_db_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterDouble_dot(@NotNull XPathParser.Double_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitDouble_dot(@NotNull XPathParser.Double_dotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_db_slash(@NotNull XPathParser.Re_db_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_db_slash(@NotNull XPathParser.Re_db_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull XPathParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull XPathParser.TagContext ctx);

	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull XPathParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull XPathParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(@NotNull XPathParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(@NotNull XPathParser.Filter_orContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(@NotNull XPathParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(@NotNull XPathParser.Filter_notContext ctx);
}