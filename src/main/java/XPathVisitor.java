// Generated from XPath.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code abs_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs_slash(@NotNull XPathParser.Abs_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_and(@NotNull XPathParser.Filter_andContext ctx);

	/**
	 * Visit a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate(@NotNull XPathParser.ConcatenateContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_eq(@NotNull XPathParser.Filter_eqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_eq(@NotNull XPathParser.Id_eqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(@NotNull XPathParser.DotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_eq(@NotNull XPathParser.Value_eqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_expr(@NotNull XPathParser.Re_exprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtt_name(@NotNull XPathParser.Att_nameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_filter(@NotNull XPathParser.Re_filterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_re(@NotNull XPathParser.Filter_reContext ctx);

	/**
	 * Visit a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(@NotNull XPathParser.WildcardContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_slash(@NotNull XPathParser.Re_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XPathParser#abs_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs_db_slash(@NotNull XPathParser.Abs_db_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_dot(@NotNull XPathParser.Double_dotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_db_slash(@NotNull XPathParser.Re_db_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull XPathParser.TagContext ctx);

	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link XPathParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull XPathParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_or(@NotNull XPathParser.Filter_orContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_not(@NotNull XPathParser.Filter_notContext ctx);
}