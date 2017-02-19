// Generated from XQuery.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code xq_concatenate}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_concatenate(@NotNull XQueryParser.Xq_concatenateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_concatenate}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_concatenate(@NotNull XQueryParser.Xq_concatenateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code abs_slash}
	 * labeled alternative in {@link XQueryParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void enterAbs_slash(@NotNull XQueryParser.Abs_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs_slash}
	 * labeled alternative in {@link XQueryParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void exitAbs_slash(@NotNull XQueryParser.Abs_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate(@NotNull XQueryParser.ConcatenateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenate}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate(@NotNull XQueryParser.ConcatenateContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_eq(@NotNull XQueryParser.Cond_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_eq(@NotNull XQueryParser.Cond_eqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link XQueryParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull XQueryParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link XQueryParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull XQueryParser.ForContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_is(@NotNull XQueryParser.Cond_isContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_is(@NotNull XQueryParser.Cond_isContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterDot(@NotNull XQueryParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitDot(@NotNull XQueryParser.DotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterValue_eq(@NotNull XQueryParser.Value_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitValue_eq(@NotNull XQueryParser.Value_eqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_var(@NotNull XQueryParser.Xq_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_var(@NotNull XQueryParser.Xq_varContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_expr(@NotNull XQueryParser.Re_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_expr}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_expr(@NotNull XQueryParser.Re_exprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_filter(@NotNull XQueryParser.Re_filterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_filter}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_filter(@NotNull XQueryParser.Re_filterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_flwr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_flwr(@NotNull XQueryParser.Xq_flwrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_flwr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_flwr(@NotNull XQueryParser.Xq_flwrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_or(@NotNull XQueryParser.Cond_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_or}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_or(@NotNull XQueryParser.Cond_orContext ctx);

	/**
	 * Enter a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(@NotNull XQueryParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildcard}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(@NotNull XQueryParser.WildcardContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_slash(@NotNull XQueryParser.Re_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_slash}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_slash(@NotNull XQueryParser.Re_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_expr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_expr(@NotNull XQueryParser.Xq_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_expr}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_expr(@NotNull XQueryParser.Xq_exprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_empty(@NotNull XQueryParser.Cond_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_empty(@NotNull XQueryParser.Cond_emptyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XQueryParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void enterAbs_db_slash(@NotNull XQueryParser.Abs_db_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs_db_slash}
	 * labeled alternative in {@link XQueryParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void exitAbs_db_slash(@NotNull XQueryParser.Abs_db_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link XQueryParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet(@NotNull XQueryParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link XQueryParser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet(@NotNull XQueryParser.LetContext ctx);

	/**
	 * Enter a parse tree produced by the {@code where}
	 * labeled alternative in {@link XQueryParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere(@NotNull XQueryParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code where}
	 * labeled alternative in {@link XQueryParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere(@NotNull XQueryParser.WhereContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull XQueryParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tag}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull XQueryParser.TagContext ctx);

	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull XQueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull XQueryParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_and(@NotNull XQueryParser.Filter_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_and}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_and(@NotNull XQueryParser.Filter_andContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_eq(@NotNull XQueryParser.Filter_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_eq(@NotNull XQueryParser.Filter_eqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterId_eq(@NotNull XQueryParser.Id_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_eq}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitId_eq(@NotNull XQueryParser.Id_eqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_slash(@NotNull XQueryParser.Xq_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_slash(@NotNull XQueryParser.Xq_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_expr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_expr(@NotNull XQueryParser.Cond_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_expr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_expr(@NotNull XQueryParser.Cond_exprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_string}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_string(@NotNull XQueryParser.Xq_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_string}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_string(@NotNull XQueryParser.Xq_stringContext ctx);

	/**
	 * Enter a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterAtt_name(@NotNull XQueryParser.Att_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code att_name}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitAtt_name(@NotNull XQueryParser.Att_nameContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_some}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_some(@NotNull XQueryParser.Cond_someContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_some}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_some(@NotNull XQueryParser.Cond_someContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_re(@NotNull XQueryParser.Filter_reContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_re}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_re(@NotNull XQueryParser.Filter_reContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_and(@NotNull XQueryParser.Cond_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_and}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_and(@NotNull XQueryParser.Cond_andContext ctx);

	/**
	 * Enter a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterDouble_dot(@NotNull XQueryParser.Double_dotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_dot}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitDouble_dot(@NotNull XQueryParser.Double_dotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void enterRe_db_slash(@NotNull XQueryParser.Re_db_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re_db_slash}
	 * labeled alternative in {@link XQueryParser#re_path}.
	 * @param ctx the parse tree
	 */
	void exitRe_db_slash(@NotNull XQueryParser.Re_db_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_abs_path}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_abs_path(@NotNull XQueryParser.Xq_abs_pathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_abs_path}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_abs_path(@NotNull XQueryParser.Xq_abs_pathContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_db_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_db_slash(@NotNull XQueryParser.Xq_db_slashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_db_slash}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_db_slash(@NotNull XQueryParser.Xq_db_slashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_not(@NotNull XQueryParser.Cond_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_not}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_not(@NotNull XQueryParser.Cond_notContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_or(@NotNull XQueryParser.Filter_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_or}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_or(@NotNull XQueryParser.Filter_orContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_tag(@NotNull XQueryParser.Xq_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_tag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_tag(@NotNull XQueryParser.Xq_tagContext ctx);

	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link XQueryParser#return_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn(@NotNull XQueryParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link XQueryParser#return_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn(@NotNull XQueryParser.ReturnContext ctx);

	/**
	 * Enter a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_let(@NotNull XQueryParser.Xq_letContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_let(@NotNull XQueryParser.Xq_letContext ctx);

	/**
	 * Enter a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter_not(@NotNull XQueryParser.Filter_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter_not}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter_not(@NotNull XQueryParser.Filter_notContext ctx);
}