// Generated from XQuery.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code xq_concatenate}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_concatenate(@NotNull XQueryParser.Xq_concatenateContext ctx);

	/**
	 * Visit a parse tree produced by the {@code abs_slash}
	 * labeled alternative in {@link XQueryParser#abs_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs_slash(@NotNull XQueryParser.Abs_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate(@NotNull XQueryParser.ConcatenateContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_eq(@NotNull XQueryParser.Cond_eqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link XQueryParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull XQueryParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_is(@NotNull XQueryParser.Cond_isContext ctx);

	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(@NotNull XQueryParser.DotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_eq(@NotNull XQueryParser.Value_eqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_var(@NotNull XQueryParser.Xq_varContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_expr(@NotNull XQueryParser.Re_exprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_filter(@NotNull XQueryParser.Re_filterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_flwr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_flwr(@NotNull XQueryParser.Xq_flwrContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_or(@NotNull XQueryParser.Cond_orContext ctx);

	/**
	 * Visit a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(@NotNull XQueryParser.WildcardContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_slash(@NotNull XQueryParser.Re_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_expr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_expr(@NotNull XQueryParser.Xq_exprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_empty(@NotNull XQueryParser.Cond_emptyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XQueryParser#abs_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs_db_slash(@NotNull XQueryParser.Abs_db_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link XQueryParser#let_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(@NotNull XQueryParser.LetContext ctx);

	/**
	 * Visit a parse tree produced by the {@code where}
	 * labeled alternative in {@link XQueryParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(@NotNull XQueryParser.WhereContext ctx);

	/**
	 * Visit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull XQueryParser.TagContext ctx);

	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull XQueryParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_and(@NotNull XQueryParser.Filter_andContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_eq(@NotNull XQueryParser.Filter_eqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_eq(@NotNull XQueryParser.Id_eqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_slash(@NotNull XQueryParser.Xq_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_expr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expr(@NotNull XQueryParser.Cond_exprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_string}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_string(@NotNull XQueryParser.Xq_stringContext ctx);

	/**
	 * Visit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtt_name(@NotNull XQueryParser.Att_nameContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_some}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_some(@NotNull XQueryParser.Cond_someContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_re(@NotNull XQueryParser.Filter_reContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_and(@NotNull XQueryParser.Cond_andContext ctx);

	/**
	 * Visit a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_dot(@NotNull XQueryParser.Double_dotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_db_slash(@NotNull XQueryParser.Re_db_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_abs_path}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_abs_path(@NotNull XQueryParser.Xq_abs_pathContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_db_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_db_slash(@NotNull XQueryParser.Xq_db_slashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_not(@NotNull XQueryParser.Cond_notContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_or(@NotNull XQueryParser.Filter_orContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_tag(@NotNull XQueryParser.Xq_tagContext ctx);

	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link XQueryParser#return_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull XQueryParser.ReturnContext ctx);

	/**
	 * Visit a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_let(@NotNull XQueryParser.Xq_letContext ctx);

	/**
	 * Visit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_not(@NotNull XQueryParser.Filter_notContext ctx);
}