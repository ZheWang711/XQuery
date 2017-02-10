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
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		VAR=33, STRING_CONST=34, SLASH=35, DOUBLESLASH=36, TAGNAME=37, ATTNAME=38, 
		FILENAME=39, WHITESPACE=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'some'", "'text()'", "'return'", "'{'", "'..'", "'='", "'}'", 
		"'for'", "':='", "'\")'", "'satisfies'", "'eq'", "'('", "'is'", "'*'", 
		"','", "'.'", "'doc(\"'", "'['", "'=='", "'<'", "']'", "'>'", "'@'", "'or'", 
		"'where'", "'let'", "'in'", "')'", "'and'", "'not'", "'empty'", "VAR", 
		"STRING_CONST", "'/'", "'//'", "TAGNAME", "ATTNAME", "FILENAME", "WHITESPACE"
	};
	public static final int
		RULE_xq = 0, RULE_for_clause = 1, RULE_let_clause = 2, RULE_where_clause = 3, 
		RULE_return_clause = 4, RULE_cond = 5, RULE_abs_path = 6, RULE_re_path = 7, 
		RULE_filter = 8;
	public static final String[] ruleNames = {
		"xq", "for_clause", "let_clause", "where_clause", "return_clause", "cond", 
		"abs_path", "re_path", "filter"
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
			setState(49);
			switch (_input.LA(1)) {
			case T__5:
				{
				_localctx = new Xq_letContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19); let_clause();
				setState(20); xq(1);
				}
				break;
			case VAR:
				{
				_localctx = new Xq_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22); match(VAR);
				}
				break;
			case STRING_CONST:
				{
				_localctx = new Xq_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23); match(STRING_CONST);
				}
				break;
			case T__14:
				{
				_localctx = new Xq_abs_pathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24); abs_path();
				}
				break;
			case T__19:
				{
				_localctx = new Xq_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25); match(T__19);
				setState(26); xq(0);
				setState(27); match(T__3);
				}
				break;
			case T__11:
				{
				_localctx = new Xq_tagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); match(T__11);
				setState(30); match(TAGNAME);
				setState(31); match(T__9);
				setState(32); match(T__28);
				setState(33); xq(0);
				setState(34); match(T__25);
				setState(35); match(T__11);
				setState(36); match(SLASH);
				setState(37); match(TAGNAME);
				setState(38); match(T__9);
				}
				break;
			case T__24:
				{
				_localctx = new Xq_flwrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40); for_clause();
				setState(42);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(41); let_clause();
					}
				}

				setState(45);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(44); where_clause();
					}
				}

				setState(47); return_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_concatenateContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(51);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(52); match(T__16);
						setState(53); xq(7);
						}
						break;

					case 2:
						{
						_localctx = new Xq_slashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(54);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(55); match(SLASH);
						setState(56); re_path(0);
						}
						break;

					case 3:
						{
						_localctx = new Xq_db_slashContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(57);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(58); match(DOUBLESLASH);
						setState(59); re_path(0);
						}
						break;
					}
					} 
				}
				setState(64);
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
			setState(65); match(T__24);
			setState(66); match(VAR);
			setState(67); match(T__4);
			setState(68); xq(0);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(69); match(T__16);
				setState(70); match(VAR);
				setState(71); match(T__4);
				setState(72); xq(0);
				}
				}
				setState(77);
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
			setState(78); match(T__5);
			setState(79); match(VAR);
			setState(80); match(T__23);
			setState(81); xq(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(82); match(T__16);
				setState(83); match(VAR);
				setState(84); match(T__23);
				setState(85); xq(0);
				}
				}
				setState(90);
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
			setState(91); match(T__6);
			setState(92); cond(0);
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
			setState(94); match(T__29);
			setState(95); xq(0);
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
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_someContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98); match(T__31);
				setState(99); match(VAR);
				setState(100); match(T__4);
				setState(101); xq(0);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(102); match(T__16);
					setState(103); match(VAR);
					setState(104); match(T__4);
					setState(105); xq(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111); match(T__21);
				setState(112); cond(5);
				}
				break;

			case 2:
				{
				_localctx = new Cond_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114); match(T__1);
				setState(115); cond(1);
				}
				break;

			case 3:
				{
				_localctx = new Cond_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116); xq(0);
				setState(117); match(T__26);
				setState(118); xq(0);
				}
				break;

			case 4:
				{
				_localctx = new Cond_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120); xq(0);
				setState(121); match(T__20);
				setState(122); xq(0);
				}
				break;

			case 5:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124); xq(0);
				setState(125); match(T__12);
				setState(126); xq(0);
				}
				break;

			case 6:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); xq(0);
				setState(129); match(T__18);
				setState(130); xq(0);
				}
				break;

			case 7:
				{
				_localctx = new Cond_emptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132); match(T__0);
				setState(133); match(T__19);
				setState(134); xq(0);
				setState(135); match(T__3);
				}
				break;

			case 8:
				{
				_localctx = new Cond_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137); match(T__19);
				setState(138); cond(0);
				setState(139); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_andContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144); match(T__2);
						setState(145); cond(4);
						}
						break;

					case 2:
						{
						_localctx = new Cond_orContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147); match(T__7);
						setState(148); cond(3);
						}
						break;
					}
					} 
				}
				setState(153);
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
		enterRule(_localctx, 12, RULE_abs_path);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Abs_slashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154); match(T__14);
				setState(155); match(FILENAME);
				setState(156); match(T__22);
				setState(157); match(SLASH);
				setState(158); re_path(0);
				}
				break;

			case 2:
				_localctx = new Abs_db_slashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159); match(T__14);
				setState(160); match(FILENAME);
				setState(161); match(T__22);
				setState(162); match(DOUBLESLASH);
				setState(163); re_path(0);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_re_path, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				_localctx = new TagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167); match(TAGNAME);
				}
				break;
			case T__17:
				{
				_localctx = new WildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); match(T__17);
				}
				break;
			case T__15:
				{
				_localctx = new DotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169); match(T__15);
				}
				break;
			case T__27:
				{
				_localctx = new Double_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(T__27);
				}
				break;
			case T__30:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171); match(T__30);
				}
				break;
			case T__8:
				{
				_localctx = new Att_nameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); match(T__8);
				setState(173); match(ATTNAME);
				}
				break;
			case T__19:
				{
				_localctx = new Re_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); match(T__19);
				setState(175); re_path(0);
				setState(176); match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Re_slashContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181); match(SLASH);
						setState(182); re_path(5);
						}
						break;

					case 2:
						{
						_localctx = new Re_db_slashContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184); match(DOUBLESLASH);
						setState(185); re_path(4);
						}
						break;

					case 3:
						{
						_localctx = new ConcatenateContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(186);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(187); match(T__16);
						setState(188); re_path(2);
						}
						break;

					case 4:
						{
						_localctx = new Re_filterContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(189);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(190); match(T__13);
						setState(191); filter(0);
						setState(192); match(T__10);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200); match(T__1);
				setState(201); filter(1);
				}
				break;

			case 2:
				{
				_localctx = new Filter_reContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202); re_path(0);
				}
				break;

			case 3:
				{
				_localctx = new Value_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203); re_path(0);
				setState(204); match(T__26);
				setState(205); re_path(0);
				}
				break;

			case 4:
				{
				_localctx = new Value_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207); re_path(0);
				setState(208); match(T__20);
				setState(209); re_path(0);
				}
				break;

			case 5:
				{
				_localctx = new Id_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211); re_path(0);
				setState(212); match(T__18);
				setState(213); re_path(0);
				}
				break;

			case 6:
				{
				_localctx = new Id_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); re_path(0);
				setState(216); match(T__12);
				setState(217); re_path(0);
				}
				break;

			case 7:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219); match(T__19);
				setState(220); filter(0);
				setState(221); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226); match(T__2);
						setState(227); filter(4);
						}
						break;

					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229); match(T__7);
						setState(230); filter(3);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

		case 7: return re_path_sempred((Re_pathContext)_localctx, predIndex);

		case 8: return filter_sempred((FilterContext)_localctx, predIndex);
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
		case 0: return precpred(_ctx, 6);

		case 1: return precpred(_ctx, 5);

		case 2: return precpred(_ctx, 4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\2\5\2\60\n\2\3\2\3\2\5\2\64\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2?\n\2\f\2\16\2B\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0098\n"+
		"\7\f\7\16\7\u009b\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a7"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c5\n\t\f\t"+
		"\16\t\u00c8\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e2\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\3\n\2\6\2\f\20\22\13\2\4"+
		"\6\b\n\f\16\20\22\2\2\u010f\2\63\3\2\2\2\4C\3\2\2\2\6P\3\2\2\2\b]\3\2"+
		"\2\2\n`\3\2\2\2\f\u008f\3\2\2\2\16\u00a6\3\2\2\2\20\u00b4\3\2\2\2\22\u00e1"+
		"\3\2\2\2\24\25\b\2\1\2\25\26\5\6\4\2\26\27\5\2\2\3\27\64\3\2\2\2\30\64"+
		"\7#\2\2\31\64\7$\2\2\32\64\5\16\b\2\33\34\7\17\2\2\34\35\5\2\2\2\35\36"+
		"\7\37\2\2\36\64\3\2\2\2\37 \7\27\2\2 !\7\'\2\2!\"\7\31\2\2\"#\7\6\2\2"+
		"#$\5\2\2\2$%\7\t\2\2%&\7\27\2\2&\'\7%\2\2\'(\7\'\2\2()\7\31\2\2)\64\3"+
		"\2\2\2*,\5\4\3\2+-\5\6\4\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\b\5\2/"+
		".\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\5\n\6\2\62\64\3\2\2\2\63\24"+
		"\3\2\2\2\63\30\3\2\2\2\63\31\3\2\2\2\63\32\3\2\2\2\63\33\3\2\2\2\63\37"+
		"\3\2\2\2\63*\3\2\2\2\64@\3\2\2\2\65\66\f\b\2\2\66\67\7\22\2\2\67?\5\2"+
		"\2\t89\f\7\2\29:\7%\2\2:?\5\20\t\2;<\f\6\2\2<=\7&\2\2=?\5\20\t\2>\65\3"+
		"\2\2\2>8\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2B@"+
		"\3\2\2\2CD\7\n\2\2DE\7#\2\2EF\7\36\2\2FM\5\2\2\2GH\7\22\2\2HI\7#\2\2I"+
		"J\7\36\2\2JL\5\2\2\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2"+
		"\2OM\3\2\2\2PQ\7\35\2\2QR\7#\2\2RS\7\13\2\2SZ\5\2\2\2TU\7\22\2\2UV\7#"+
		"\2\2VW\7\13\2\2WY\5\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7"+
		"\3\2\2\2\\Z\3\2\2\2]^\7\34\2\2^_\5\f\7\2_\t\3\2\2\2`a\7\5\2\2ab\5\2\2"+
		"\2b\13\3\2\2\2cd\b\7\1\2de\7\3\2\2ef\7#\2\2fg\7\36\2\2gn\5\2\2\2hi\7\22"+
		"\2\2ij\7#\2\2jk\7\36\2\2km\5\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2oq\3\2\2\2pn\3\2\2\2qr\7\r\2\2rs\5\f\7\7s\u0090\3\2\2\2tu\7!\2\2u"+
		"\u0090\5\f\7\3vw\5\2\2\2wx\7\b\2\2xy\5\2\2\2y\u0090\3\2\2\2z{\5\2\2\2"+
		"{|\7\16\2\2|}\5\2\2\2}\u0090\3\2\2\2~\177\5\2\2\2\177\u0080\7\26\2\2\u0080"+
		"\u0081\5\2\2\2\u0081\u0090\3\2\2\2\u0082\u0083\5\2\2\2\u0083\u0084\7\20"+
		"\2\2\u0084\u0085\5\2\2\2\u0085\u0090\3\2\2\2\u0086\u0087\7\"\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\5\2\2\2\u0089\u008a\7\37\2\2\u008a\u0090\3"+
		"\2\2\2\u008b\u008c\7\17\2\2\u008c\u008d\5\f\7\2\u008d\u008e\7\37\2\2\u008e"+
		"\u0090\3\2\2\2\u008fc\3\2\2\2\u008ft\3\2\2\2\u008fv\3\2\2\2\u008fz\3\2"+
		"\2\2\u008f~\3\2\2\2\u008f\u0082\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u008b"+
		"\3\2\2\2\u0090\u0099\3\2\2\2\u0091\u0092\f\5\2\2\u0092\u0093\7 \2\2\u0093"+
		"\u0098\5\f\7\6\u0094\u0095\f\4\2\2\u0095\u0096\7\33\2\2\u0096\u0098\5"+
		"\f\7\5\u0097\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\r\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u009d\7\24\2\2\u009d\u009e\7)\2\2\u009e\u009f\7\f\2\2\u009f\u00a0"+
		"\7%\2\2\u00a0\u00a7\5\20\t\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\7)\2\2\u00a3"+
		"\u00a4\7\f\2\2\u00a4\u00a5\7&\2\2\u00a5\u00a7\5\20\t\2\u00a6\u009c\3\2"+
		"\2\2\u00a6\u00a1\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\b\t\1\2\u00a9\u00b5"+
		"\7\'\2\2\u00aa\u00b5\7\21\2\2\u00ab\u00b5\7\23\2\2\u00ac\u00b5\7\7\2\2"+
		"\u00ad\u00b5\7\4\2\2\u00ae\u00af\7\32\2\2\u00af\u00b5\7(\2\2\u00b0\u00b1"+
		"\7\17\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b3\7\37\2\2\u00b3\u00b5\3\2\2"+
		"\2\u00b4\u00a8\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00ac"+
		"\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\u00c6\3\2\2\2\u00b6\u00b7\f\6\2\2\u00b7\u00b8\7%\2\2\u00b8\u00c5\5\20"+
		"\t\7\u00b9\u00ba\f\5\2\2\u00ba\u00bb\7&\2\2\u00bb\u00c5\5\20\t\6\u00bc"+
		"\u00bd\f\3\2\2\u00bd\u00be\7\22\2\2\u00be\u00c5\5\20\t\4\u00bf\u00c0\f"+
		"\4\2\2\u00c0\u00c1\7\25\2\2\u00c1\u00c2\5\22\n\2\u00c2\u00c3\7\30\2\2"+
		"\u00c3\u00c5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c4\u00bc"+
		"\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\21\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\b\n\1"+
		"\2\u00ca\u00cb\7!\2\2\u00cb\u00e2\5\22\n\3\u00cc\u00e2\5\20\t\2\u00cd"+
		"\u00ce\5\20\t\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5\20\t\2\u00d0\u00e2\3"+
		"\2\2\2\u00d1\u00d2\5\20\t\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\5\20\t\2"+
		"\u00d4\u00e2\3\2\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7\20\2\2\u00d7\u00d8"+
		"\5\20\t\2\u00d8\u00e2\3\2\2\2\u00d9\u00da\5\20\t\2\u00da\u00db\7\26\2"+
		"\2\u00db\u00dc\5\20\t\2\u00dc\u00e2\3\2\2\2\u00dd\u00de\7\17\2\2\u00de"+
		"\u00df\5\22\n\2\u00df\u00e0\7\37\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00c9\3"+
		"\2\2\2\u00e1\u00cc\3\2\2\2\u00e1\u00cd\3\2\2\2\u00e1\u00d1\3\2\2\2\u00e1"+
		"\u00d5\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00eb\3\2"+
		"\2\2\u00e3\u00e4\f\5\2\2\u00e4\u00e5\7 \2\2\u00e5\u00ea\5\22\n\6\u00e6"+
		"\u00e7\f\4\2\2\u00e7\u00e8\7\33\2\2\u00e8\u00ea\5\22\n\5\u00e9\u00e3\3"+
		"\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\23\3\2\2\2\u00ed\u00eb\3\2\2\2\24,/\63>@MZn\u008f"+
		"\u0097\u0099\u00a6\u00b4\u00c4\u00c6\u00e1\u00e9\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}