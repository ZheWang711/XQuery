// Generated from XQuery.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, VAR=34, STRING_CONST=35, SLASH=36, DOUBLESLASH=37, TAGNAME=38, 
		ATTNAME=39, FILENAME=40, WHITESPACE=41, NAME=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'some'", "'text()'", "'return'", "'{'", "'..'", "'='", "'}'", 
		"'for'", "':='", "'\")'", "'satisfies'", "'eq'", "'('", "'is'", "'*'", 
		"','", "'.'", "'join'", "'doc(\"'", "'['", "'=='", "'<'", "']'", "'>'", 
		"'@'", "'or'", "'where'", "'let'", "'in'", "')'", "'and'", "'not'", "'empty'", 
		"VAR", "STRING_CONST", "'/'", "'//'", "TAGNAME", "ATTNAME", "FILENAME", 
		"WHITESPACE", "NAME"
	};
	public static final int
		RULE_xq = 0, RULE_for_clause = 1, RULE_let_clause = 2, RULE_where_clause = 3, 
		RULE_return_clause = 4, RULE_cond = 5, RULE_join_clause = 6, RULE_attr = 7, 
		RULE_abs_path = 8, RULE_re_path = 9, RULE_filter = 10;
	public static final String[] ruleNames = {
		"xq", "for_clause", "let_clause", "where_clause", "return_clause", "cond", 
		"join_clause", "attr", "abs_path", "re_path", "filter"
	};

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Xq_concatenateContext extends XqContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public Xq_concatenateContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_concatenate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_concatenate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_concatenate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_exprContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_exprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_slashContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Xq_slashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_stringContext extends XqContext {
		public TerminalNode STRING_CONST() { return getToken(XQueryParser.STRING_CONST, 0); }
		public Xq_stringContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_string(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_varContext extends XqContext {
		public TerminalNode VAR() { return getToken(XQueryParser.VAR, 0); }
		public Xq_varContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_joinContext extends XqContext {
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Xq_joinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_join(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_abs_pathContext extends XqContext {
		public Abs_pathContext abs_path() {
			return getRuleContext(Abs_pathContext.class,0);
		}
		public Xq_abs_pathContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_abs_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_abs_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_abs_path(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_flwrContext extends XqContext {
		public Return_clauseContext return_clause() {
			return getRuleContext(Return_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Xq_flwrContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_flwr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_flwr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_flwr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_db_slashContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Xq_db_slashContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_db_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_db_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_db_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_tagContext extends XqContext {
		public List<TerminalNode> TAGNAME() { return getTokens(XQueryParser.TAGNAME); }
		public TerminalNode TAGNAME(int i) {
			return getToken(XQueryParser.TAGNAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_tagContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_tag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_letContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Xq_letContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq_let(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq_let(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			switch (_input.LA(1)) {
			case T__5:
				{
				_localctx = new Xq_letContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23); let_clause();
				setState(24); xq(2);
				}
				break;
			case VAR:
				{
				_localctx = new Xq_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26); match(VAR);
				}
				break;
			case STRING_CONST:
				{
				_localctx = new Xq_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27); match(STRING_CONST);
				}
				break;
			case T__14:
				{
				_localctx = new Xq_abs_pathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28); abs_path();
				}
				break;
			case T__20:
				{
				_localctx = new Xq_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); match(T__20);
				setState(30); xq(0);
				setState(31); match(T__3);
				}
				break;
			case T__11:
				{
				_localctx = new Xq_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); match(T__11);
				setState(34); match(TAGNAME);
				setState(35); match(T__9);
				setState(36); match(T__29);
				setState(37); xq(0);
				setState(38); match(T__26);
				setState(39); match(T__11);
				setState(40); match(SLASH);
				setState(41); match(TAGNAME);
				setState(42); match(T__9);
				}
				break;
			case T__25:
				{
				_localctx = new Xq_flwrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44); for_clause();
				setState(46);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(45); let_clause();
					}
				}

				setState(49);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(48); where_clause();
					}
				}

				setState(51); return_clause();
				}
				break;
			case T__15:
				{
				_localctx = new Xq_joinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53); join_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_concatenateContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(56);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(57); match(T__17);
						setState(58); xq(8);
						}
						break;

					case 2:
						{
						_localctx = new Xq_slashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(59);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(60); match(SLASH);
						setState(61); re_path(0);
						}
						break;

					case 3:
						{
						_localctx = new Xq_db_slashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63); match(DOUBLESLASH);
						setState(64); re_path(0);
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class For_clauseContext extends ParserRuleContext {
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
	 
		public For_clauseContext() { }
		public void copyFrom(For_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends For_clauseContext {
		public List<TerminalNode> VAR() { return getTokens(XQueryParser.VAR); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public ForContext(For_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_for_clause);
		int _la;
		try {
			_localctx = new ForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(T__25);
			setState(71); match(VAR);
			setState(72); match(T__4);
			setState(73); xq(0);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(74); match(T__17);
				setState(75); match(VAR);
				setState(76); match(T__4);
				setState(77); xq(0);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_clauseContext extends ParserRuleContext {
		public Let_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_clause; }
	 
		public Let_clauseContext() { }
		public void copyFrom(Let_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetContext extends Let_clauseContext {
		public List<TerminalNode> VAR() { return getTokens(XQueryParser.VAR); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public LetContext(Let_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_clauseContext let_clause() throws RecognitionException {
		Let_clauseContext _localctx = new Let_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_let_clause);
		int _la;
		try {
			_localctx = new LetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(T__5);
			setState(84); match(VAR);
			setState(85); match(T__24);
			setState(86); xq(0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(87); match(T__17);
				setState(88); match(VAR);
				setState(89); match(T__24);
				setState(90); xq(0);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	 
		public Where_clauseContext() { }
		public void copyFrom(Where_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereContext extends Where_clauseContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereContext(Where_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where_clause);
		try {
			_localctx = new WhereContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(T__6);
			setState(97); cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_clauseContext extends ParserRuleContext {
		public Return_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_clause; }
	 
		public Return_clauseContext() { }
		public void copyFrom(Return_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnContext extends Return_clauseContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnContext(Return_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_clauseContext return_clause() throws RecognitionException {
		Return_clauseContext _localctx = new Return_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_clause);
		try {
			_localctx = new ReturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(T__30);
			setState(100); xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_andContext extends CondContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public Cond_andContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_emptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Cond_emptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_eqContext extends CondContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public Cond_eqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_exprContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_exprContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_isContext extends CondContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public Cond_isContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_is(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_is(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_someContext extends CondContext {
		public List<TerminalNode> VAR() { return getTokens(XQueryParser.VAR); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_someContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_some(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_some(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_some(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_notContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_notContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_orContext extends CondContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public Cond_orContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_someContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103); match(T__32);
				setState(104); match(VAR);
				setState(105); match(T__4);
				setState(106); xq(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(107); match(T__17);
					setState(108); match(VAR);
					setState(109); match(T__4);
					setState(110); xq(0);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116); match(T__22);
				setState(117); cond(5);
				}
				break;

			case 2:
				{
				_localctx = new Cond_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119); match(T__1);
				setState(120); cond(1);
				}
				break;

			case 3:
				{
				_localctx = new Cond_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121); xq(0);
				setState(122); match(T__27);
				setState(123); xq(0);
				}
				break;

			case 4:
				{
				_localctx = new Cond_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125); xq(0);
				setState(126); match(T__21);
				setState(127); xq(0);
				}
				break;

			case 5:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129); xq(0);
				setState(130); match(T__12);
				setState(131); xq(0);
				}
				break;

			case 6:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); xq(0);
				setState(134); match(T__19);
				setState(135); xq(0);
				}
				break;

			case 7:
				{
				_localctx = new Cond_emptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137); match(T__0);
				setState(138); match(T__20);
				setState(139); xq(0);
				setState(140); match(T__3);
				}
				break;

			case 8:
				{
				_localctx = new Cond_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142); match(T__20);
				setState(143); cond(0);
				setState(144); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_andContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149); match(T__2);
						setState(150); cond(4);
						}
						break;

					case 2:
						{
						_localctx = new Cond_orContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(151);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(152); match(T__7);
						setState(153); cond(3);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_join_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(T__15);
			setState(160); match(T__20);
			setState(161); xq(0);
			setState(162); match(T__17);
			setState(163); xq(0);
			setState(164); match(T__17);
			setState(165); attr();
			setState(166); match(T__17);
			setState(167); attr();
			setState(168); match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(T__13);
			setState(171); match(NAME);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(172); match(T__17);
				setState(173); match(NAME);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abs_pathContext extends ParserRuleContext {
		public Abs_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs_path; }
	 
		public Abs_pathContext() { }
		public void copyFrom(Abs_pathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Abs_slashContext extends Abs_pathContext {
		public TerminalNode FILENAME() { return getToken(XQueryParser.FILENAME, 0); }
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Abs_slashContext(Abs_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAbs_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAbs_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAbs_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Abs_db_slashContext extends Abs_pathContext {
		public TerminalNode DOUBLESLASH() { return getToken(XQueryParser.DOUBLESLASH, 0); }
		public TerminalNode FILENAME() { return getToken(XQueryParser.FILENAME, 0); }
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Abs_db_slashContext(Abs_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAbs_db_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAbs_db_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAbs_db_slash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abs_pathContext abs_path() throws RecognitionException {
		Abs_pathContext _localctx = new Abs_pathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_abs_path);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Abs_slashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(T__14);
				setState(182); match(FILENAME);
				setState(183); match(T__23);
				setState(184); match(SLASH);
				setState(185); re_path(0);
				}
				break;

			case 2:
				_localctx = new Abs_db_slashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186); match(T__14);
				setState(187); match(FILENAME);
				setState(188); match(T__23);
				setState(189); match(DOUBLESLASH);
				setState(190); re_path(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Re_pathContext extends ParserRuleContext {
		public Re_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_re_path; }
	 
		public Re_pathContext() { }
		public void copyFrom(Re_pathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatenateContext extends Re_pathContext {
		public Re_pathContext re_path(int i) {
			return getRuleContext(Re_pathContext.class,i);
		}
		public List<Re_pathContext> re_path() {
			return getRuleContexts(Re_pathContext.class);
		}
		public ConcatenateContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterConcatenate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitConcatenate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitConcatenate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_dotContext extends Re_pathContext {
		public Double_dotContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDouble_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDouble_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDouble_dot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotContext extends Re_pathContext {
		public DotContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_db_slashContext extends Re_pathContext {
		public TerminalNode DOUBLESLASH() { return getToken(XQueryParser.DOUBLESLASH, 0); }
		public Re_pathContext re_path(int i) {
			return getRuleContext(Re_pathContext.class,i);
		}
		public List<Re_pathContext> re_path() {
			return getRuleContexts(Re_pathContext.class);
		}
		public Re_db_slashContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRe_db_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRe_db_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRe_db_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagContext extends Re_pathContext {
		public TerminalNode TAGNAME() { return getToken(XQueryParser.TAGNAME, 0); }
		public TagContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends Re_pathContext {
		public TextContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_exprContext extends Re_pathContext {
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Re_exprContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRe_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRe_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRe_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Att_nameContext extends Re_pathContext {
		public TerminalNode ATTNAME() { return getToken(XQueryParser.ATTNAME, 0); }
		public Att_nameContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAtt_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAtt_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAtt_name(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_filterContext extends Re_pathContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Re_filterContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRe_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRe_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRe_filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WildcardContext extends Re_pathContext {
		public WildcardContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_slashContext extends Re_pathContext {
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public Re_pathContext re_path(int i) {
			return getRuleContext(Re_pathContext.class,i);
		}
		public List<Re_pathContext> re_path() {
			return getRuleContexts(Re_pathContext.class);
		}
		public Re_slashContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRe_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRe_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRe_slash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Re_pathContext re_path() throws RecognitionException {
		return re_path(0);
	}

	private Re_pathContext re_path(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Re_pathContext _localctx = new Re_pathContext(_ctx, _parentState);
		Re_pathContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_re_path, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				_localctx = new TagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194); match(TAGNAME);
				}
				break;
			case T__18:
				{
				_localctx = new WildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); match(T__18);
				}
				break;
			case T__16:
				{
				_localctx = new DotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); match(T__16);
				}
				break;
			case T__28:
				{
				_localctx = new Double_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(T__28);
				}
				break;
			case T__31:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); match(T__31);
				}
				break;
			case T__8:
				{
				_localctx = new Att_nameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); match(T__8);
				setState(200); match(ATTNAME);
				}
				break;
			case T__20:
				{
				_localctx = new Re_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); match(T__20);
				setState(202); re_path(0);
				setState(203); match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Re_slashContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(208); match(SLASH);
						setState(209); re_path(5);
						}
						break;

					case 2:
						{
						_localctx = new Re_db_slashContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211); match(DOUBLESLASH);
						setState(212); re_path(4);
						}
						break;

					case 3:
						{
						_localctx = new ConcatenateContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(213);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(214); match(T__17);
						setState(215); re_path(2);
						}
						break;

					case 4:
						{
						_localctx = new Re_filterContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(216);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(217); match(T__13);
						setState(218); filter(0);
						setState(219); match(T__10);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filter_andContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Filter_andContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_eqContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_eqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Id_eqContext extends FilterContext {
		public Re_pathContext re_path(int i) {
			return getRuleContext(Re_pathContext.class,i);
		}
		public List<Re_pathContext> re_path() {
			return getRuleContexts(Re_pathContext.class);
		}
		public Id_eqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterId_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitId_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitId_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_eqContext extends FilterContext {
		public Re_pathContext re_path(int i) {
			return getRuleContext(Re_pathContext.class,i);
		}
		public List<Re_pathContext> re_path() {
			return getRuleContexts(Re_pathContext.class);
		}
		public Value_eqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterValue_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitValue_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitValue_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_reContext extends FilterContext {
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Filter_reContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_re(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_re(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_re(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_orContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Filter_orContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_notContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Filter_notContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilter_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(227); match(T__1);
				setState(228); filter(1);
				}
				break;

			case 2:
				{
				_localctx = new Filter_reContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); re_path(0);
				}
				break;

			case 3:
				{
				_localctx = new Value_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230); re_path(0);
				setState(231); match(T__27);
				setState(232); re_path(0);
				}
				break;

			case 4:
				{
				_localctx = new Value_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234); re_path(0);
				setState(235); match(T__21);
				setState(236); re_path(0);
				}
				break;

			case 5:
				{
				_localctx = new Id_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238); re_path(0);
				setState(239); match(T__19);
				setState(240); re_path(0);
				}
				break;

			case 6:
				{
				_localctx = new Id_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242); re_path(0);
				setState(243); match(T__12);
				setState(244); re_path(0);
				}
				break;

			case 7:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246); match(T__20);
				setState(247); filter(0);
				setState(248); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253); match(T__2);
						setState(254); filter(4);
						}
						break;

					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256); match(T__7);
						setState(257); filter(3);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return xq_sempred((XqContext)_localctx, predIndex);

		case 5: return cond_sempred((CondContext)_localctx, predIndex);

		case 9: return re_path_sempred((Re_pathContext)_localctx, predIndex);

		case 10: return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return precpred(_ctx, 3);

		case 10: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);

		case 1: return precpred(_ctx, 6);

		case 2: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 3);

		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean re_path_sempred(Re_pathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 4);

		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 1);

		case 8: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u010a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\2\5\2\64\n\2\3\2\3"+
		"\2\3\2\5\29\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2D\n\2\f\2\16\2"+
		"G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Q\n\3\f\3\16\3T\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7r\n\7\f\7\16\7u\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00e0\n\13\f\13\16\13\u00e3\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fd"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0105\n\f\f\f\16\f\u0108\13\f\3\f\2\6"+
		"\2\f\24\26\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u012a\28\3\2\2\2\4H\3\2\2"+
		"\2\6U\3\2\2\2\bb\3\2\2\2\ne\3\2\2\2\f\u0094\3\2\2\2\16\u00a1\3\2\2\2\20"+
		"\u00ac\3\2\2\2\22\u00c1\3\2\2\2\24\u00cf\3\2\2\2\26\u00fc\3\2\2\2\30\31"+
		"\b\2\1\2\31\32\5\6\4\2\32\33\5\2\2\4\339\3\2\2\2\349\7$\2\2\359\7%\2\2"+
		"\369\5\22\n\2\37 \7\17\2\2 !\5\2\2\2!\"\7 \2\2\"9\3\2\2\2#$\7\30\2\2$"+
		"%\7(\2\2%&\7\32\2\2&\'\7\6\2\2\'(\5\2\2\2()\7\t\2\2)*\7\30\2\2*+\7&\2"+
		"\2+,\7(\2\2,-\7\32\2\2-9\3\2\2\2.\60\5\4\3\2/\61\5\6\4\2\60/\3\2\2\2\60"+
		"\61\3\2\2\2\61\63\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\5\n\6\2\669\3\2\2\2\679\5\16\b\28\30\3\2\2\28\34\3\2"+
		"\2\28\35\3\2\2\28\36\3\2\2\28\37\3\2\2\28#\3\2\2\28.\3\2\2\28\67\3\2\2"+
		"\29E\3\2\2\2:;\f\t\2\2;<\7\22\2\2<D\5\2\2\n=>\f\b\2\2>?\7&\2\2?D\5\24"+
		"\13\2@A\f\7\2\2AB\7\'\2\2BD\5\24\13\2C:\3\2\2\2C=\3\2\2\2C@\3\2\2\2DG"+
		"\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HI\7\n\2\2IJ\7$\2\2J"+
		"K\7\37\2\2KR\5\2\2\2LM\7\22\2\2MN\7$\2\2NO\7\37\2\2OQ\5\2\2\2PL\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\5\3\2\2\2TR\3\2\2\2UV\7\36\2\2VW\7$"+
		"\2\2WX\7\13\2\2X_\5\2\2\2YZ\7\22\2\2Z[\7$\2\2[\\\7\13\2\2\\^\5\2\2\2]"+
		"Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\7\3\2\2\2a_\3\2\2\2bc\7\35\2"+
		"\2cd\5\f\7\2d\t\3\2\2\2ef\7\5\2\2fg\5\2\2\2g\13\3\2\2\2hi\b\7\1\2ij\7"+
		"\3\2\2jk\7$\2\2kl\7\37\2\2ls\5\2\2\2mn\7\22\2\2no\7$\2\2op\7\37\2\2pr"+
		"\5\2\2\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v"+
		"w\7\r\2\2wx\5\f\7\7x\u0095\3\2\2\2yz\7\"\2\2z\u0095\5\f\7\3{|\5\2\2\2"+
		"|}\7\b\2\2}~\5\2\2\2~\u0095\3\2\2\2\177\u0080\5\2\2\2\u0080\u0081\7\16"+
		"\2\2\u0081\u0082\5\2\2\2\u0082\u0095\3\2\2\2\u0083\u0084\5\2\2\2\u0084"+
		"\u0085\7\27\2\2\u0085\u0086\5\2\2\2\u0086\u0095\3\2\2\2\u0087\u0088\5"+
		"\2\2\2\u0088\u0089\7\20\2\2\u0089\u008a\5\2\2\2\u008a\u0095\3\2\2\2\u008b"+
		"\u008c\7#\2\2\u008c\u008d\7\17\2\2\u008d\u008e\5\2\2\2\u008e\u008f\7 "+
		"\2\2\u008f\u0095\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0092\5\f\7\2\u0092"+
		"\u0093\7 \2\2\u0093\u0095\3\2\2\2\u0094h\3\2\2\2\u0094y\3\2\2\2\u0094"+
		"{\3\2\2\2\u0094\177\3\2\2\2\u0094\u0083\3\2\2\2\u0094\u0087\3\2\2\2\u0094"+
		"\u008b\3\2\2\2\u0094\u0090\3\2\2\2\u0095\u009e\3\2\2\2\u0096\u0097\f\5"+
		"\2\2\u0097\u0098\7!\2\2\u0098\u009d\5\f\7\6\u0099\u009a\f\4\2\2\u009a"+
		"\u009b\7\34\2\2\u009b\u009d\5\f\7\5\u009c\u0096\3\2\2\2\u009c\u0099\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\r\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\7\17\2"+
		"\2\u00a3\u00a4\5\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\5\2\2\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa"+
		"\5\20\t\2\u00aa\u00ab\7 \2\2\u00ab\17\3\2\2\2\u00ac\u00ad\7\26\2\2\u00ad"+
		"\u00b2\7,\2\2\u00ae\u00af\7\22\2\2\u00af\u00b1\7,\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\31\2\2\u00b6\21\3\2\2"+
		"\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb"+
		"\7&\2\2\u00bb\u00c2\5\24\13\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7*\2\2"+
		"\u00be\u00bf\7\f\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00b7"+
		"\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\b\13\1\2\u00c4"+
		"\u00d0\7(\2\2\u00c5\u00d0\7\21\2\2\u00c6\u00d0\7\23\2\2\u00c7\u00d0\7"+
		"\7\2\2\u00c8\u00d0\7\4\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00d0\7)\2\2\u00cb"+
		"\u00cc\7\17\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce\7 \2\2\u00ce\u00d0\3"+
		"\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf"+
		"\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2"+
		"\2\2\u00d0\u00e1\3\2\2\2\u00d1\u00d2\f\6\2\2\u00d2\u00d3\7&\2\2\u00d3"+
		"\u00e0\5\24\13\7\u00d4\u00d5\f\5\2\2\u00d5\u00d6\7\'\2\2\u00d6\u00e0\5"+
		"\24\13\6\u00d7\u00d8\f\3\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00e0\5\24\13"+
		"\4\u00da\u00db\f\4\2\2\u00db\u00dc\7\26\2\2\u00dc\u00dd\5\26\f\2\u00dd"+
		"\u00de\7\31\2\2\u00de\u00e0\3\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00d4\3"+
		"\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00da\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e1\3\2\2"+
		"\2\u00e4\u00e5\b\f\1\2\u00e5\u00e6\7\"\2\2\u00e6\u00fd\5\26\f\3\u00e7"+
		"\u00fd\5\24\13\2\u00e8\u00e9\5\24\13\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb"+
		"\5\24\13\2\u00eb\u00fd\3\2\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\7\16"+
		"\2\2\u00ee\u00ef\5\24\13\2\u00ef\u00fd\3\2\2\2\u00f0\u00f1\5\24\13\2\u00f1"+
		"\u00f2\7\20\2\2\u00f2\u00f3\5\24\13\2\u00f3\u00fd\3\2\2\2\u00f4\u00f5"+
		"\5\24\13\2\u00f5\u00f6\7\27\2\2\u00f6\u00f7\5\24\13\2\u00f7\u00fd\3\2"+
		"\2\2\u00f8\u00f9\7\17\2\2\u00f9\u00fa\5\26\f\2\u00fa\u00fb\7 \2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00e4\3\2\2\2\u00fc\u00e7\3\2\2\2\u00fc\u00e8\3\2"+
		"\2\2\u00fc\u00ec\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc"+
		"\u00f8\3\2\2\2\u00fd\u0106\3\2\2\2\u00fe\u00ff\f\5\2\2\u00ff\u0100\7!"+
		"\2\2\u0100\u0105\5\26\f\6\u0101\u0102\f\4\2\2\u0102\u0103\7\34\2\2\u0103"+
		"\u0105\5\26\f\5\u0104\u00fe\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\27\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\25\60\638CER_s\u0094\u009c\u009e\u00b2\u00c1\u00cf\u00df"+
		"\u00e1\u00fc\u0104\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}