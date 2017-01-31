// Generated from XPath.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, SLASH=20, DOUBLESLASH=21, TAGNAME=22, ATTNAME=23, 
		FILENAME=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'doc(\"'", "'text()'", "'['", "'..'", "'doc('", "'='", "']'", 
		"'or'", "'@'", "'\")'", "'eq'", "'('", "'is'", "')'", "'and'", "'*'", 
		"'not'", "','", "'.'", "'/'", "'//'", "TAGNAME", "ATTNAME", "FILENAME"
	};
	public static final int
		RULE_abs_path = 0, RULE_re_path = 1, RULE_filter = 2;
	public static final String[] ruleNames = {
		"abs_path", "re_path", "filter"
	};

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public TerminalNode FILENAME() { return getToken(XPathParser.FILENAME, 0); }
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Abs_slashContext(Abs_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbs_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbs_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAbs_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Abs_db_slashContext extends Abs_pathContext {
		public TerminalNode DOUBLESLASH() { return getToken(XPathParser.DOUBLESLASH, 0); }
		public TerminalNode FILENAME() { return getToken(XPathParser.FILENAME, 0); }
		public Re_pathContext re_path() {
			return getRuleContext(Re_pathContext.class,0);
		}
		public Abs_db_slashContext(Abs_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAbs_db_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAbs_db_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAbs_db_slash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abs_pathContext abs_path() throws RecognitionException {
		Abs_pathContext _localctx = new Abs_pathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abs_path);
		try {
			setState(16);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new Abs_slashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6); match(T__18);
				setState(7); match(FILENAME);
				setState(8); match(T__9);
				setState(9); match(SLASH);
				setState(10); re_path(0);
				}
				break;
			case T__14:
				_localctx = new Abs_db_slashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11); match(T__14);
				setState(12); match(FILENAME);
				setState(13); match(T__5);
				setState(14); match(DOUBLESLASH);
				setState(15); re_path(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterConcatenate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitConcatenate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitConcatenate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_dotContext extends Re_pathContext {
		public Double_dotContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterDouble_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitDouble_dot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitDouble_dot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotContext extends Re_pathContext {
		public DotContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_db_slashContext extends Re_pathContext {
		public TerminalNode DOUBLESLASH() { return getToken(XPathParser.DOUBLESLASH, 0); }
		public Re_pathContext re_path(int i) {
			return getRuleContext(Re_pathContext.class,i);
		}
		public List<Re_pathContext> re_path() {
			return getRuleContexts(Re_pathContext.class);
		}
		public Re_db_slashContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRe_db_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRe_db_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitRe_db_slash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagContext extends Re_pathContext {
		public TerminalNode TAGNAME() { return getToken(XPathParser.TAGNAME, 0); }
		public TagContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends Re_pathContext {
		public TextContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitText(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRe_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRe_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitRe_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Att_nameContext extends Re_pathContext {
		public TerminalNode ATTNAME() { return getToken(XPathParser.ATTNAME, 0); }
		public Att_nameContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAtt_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAtt_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAtt_name(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRe_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRe_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitRe_filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WildcardContext extends Re_pathContext {
		public WildcardContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Re_slashContext extends Re_pathContext {
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public Re_pathContext re_path(int i) {
			return getRuleContext(Re_pathContext.class,i);
		}
		public List<Re_pathContext> re_path() {
			return getRuleContexts(Re_pathContext.class);
		}
		public Re_slashContext(Re_pathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRe_slash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRe_slash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitRe_slash(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_re_path, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				_localctx = new TagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19); match(TAGNAME);
				}
				break;
			case T__3:
				{
				_localctx = new WildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20); match(T__3);
				}
				break;
			case T__0:
				{
				_localctx = new DotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21); match(T__0);
				}
				break;
			case T__15:
				{
				_localctx = new Double_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22); match(T__15);
				}
				break;
			case T__17:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23); match(T__17);
				}
				break;
			case T__10:
				{
				_localctx = new Att_nameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24); match(T__10);
				setState(25); match(ATTNAME);
				}
				break;
			case T__7:
				{
				_localctx = new Re_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26); match(T__7);
				setState(27); re_path(0);
				setState(28); match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Re_slashContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(32);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(33); match(SLASH);
						setState(34); re_path(5);
						}
						break;

					case 2:
						{
						_localctx = new Re_db_slashContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36); match(DOUBLESLASH);
						setState(37); re_path(4);
						}
						break;

					case 3:
						{
						_localctx = new ConcatenateContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(38);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(39); match(T__1);
						setState(40); re_path(2);
						}
						break;

					case 4:
						{
						_localctx = new Re_filterContext(new Re_pathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_re_path);
						setState(41);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(42); match(T__16);
						setState(43); filter(0);
						setState(44); match(T__12);
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilter_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilter_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitFilter_and(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilter_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilter_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitFilter_eq(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterId_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitId_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitId_eq(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterValue_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitValue_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitValue_eq(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilter_re(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilter_re(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitFilter_re(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilter_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilter_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitFilter_or(this);
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
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterFilter_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitFilter_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitFilter_not(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new Filter_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52); match(T__2);
				setState(53); filter(1);
				}
				break;

			case 2:
				{
				_localctx = new Filter_reContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54); re_path(0);
				}
				break;

			case 3:
				{
				_localctx = new Value_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); re_path(0);
				setState(56); match(T__13);
				setState(57); re_path(0);
				}
				break;

			case 4:
				{
				_localctx = new Value_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); re_path(0);
				setState(60); match(T__8);
				setState(61); re_path(0);
				}
				break;

			case 5:
				{
				_localctx = new Id_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); re_path(0);
				setState(64); match(T__6);
				setState(65); re_path(0);
				}
				break;

			case 6:
				{
				_localctx = new Filter_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); match(T__7);
				setState(68); filter(0);
				setState(69); match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Filter_andContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(73);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(74); match(T__4);
						setState(75); filter(4);
						}
						break;

					case 2:
						{
						_localctx = new Filter_orContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(76);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(77); match(T__11);
						setState(78); filter(3);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 1: return re_path_sempred((Re_pathContext)_localctx, predIndex);

		case 2: return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 3);

		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean re_path_sempred(Re_pathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 1);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4R\n\4\f\4\16\4U\13\4\3\4\2\4"+
		"\4\6\5\2\4\6\2\2e\2\22\3\2\2\2\4 \3\2\2\2\6I\3\2\2\2\b\t\7\3\2\2\t\n\7"+
		"\32\2\2\n\13\7\f\2\2\13\f\7\26\2\2\f\23\5\4\3\2\r\16\7\7\2\2\16\17\7\32"+
		"\2\2\17\20\7\20\2\2\20\21\7\27\2\2\21\23\5\4\3\2\22\b\3\2\2\2\22\r\3\2"+
		"\2\2\23\3\3\2\2\2\24\25\b\3\1\2\25!\7\30\2\2\26!\7\22\2\2\27!\7\25\2\2"+
		"\30!\7\6\2\2\31!\7\4\2\2\32\33\7\13\2\2\33!\7\31\2\2\34\35\7\16\2\2\35"+
		"\36\5\4\3\2\36\37\7\20\2\2\37!\3\2\2\2 \24\3\2\2\2 \26\3\2\2\2 \27\3\2"+
		"\2\2 \30\3\2\2\2 \31\3\2\2\2 \32\3\2\2\2 \34\3\2\2\2!\62\3\2\2\2\"#\f"+
		"\6\2\2#$\7\26\2\2$\61\5\4\3\7%&\f\5\2\2&\'\7\27\2\2\'\61\5\4\3\6()\f\3"+
		"\2\2)*\7\24\2\2*\61\5\4\3\4+,\f\4\2\2,-\7\5\2\2-.\5\6\4\2./\7\t\2\2/\61"+
		"\3\2\2\2\60\"\3\2\2\2\60%\3\2\2\2\60(\3\2\2\2\60+\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\b\4\1"+
		"\2\66\67\7\23\2\2\67J\5\6\4\38J\5\4\3\29:\5\4\3\2:;\7\b\2\2;<\5\4\3\2"+
		"<J\3\2\2\2=>\5\4\3\2>?\7\r\2\2?@\5\4\3\2@J\3\2\2\2AB\5\4\3\2BC\7\17\2"+
		"\2CD\5\4\3\2DJ\3\2\2\2EF\7\16\2\2FG\5\6\4\2GH\7\20\2\2HJ\3\2\2\2I\65\3"+
		"\2\2\2I8\3\2\2\2I9\3\2\2\2I=\3\2\2\2IA\3\2\2\2IE\3\2\2\2JS\3\2\2\2KL\f"+
		"\5\2\2LM\7\21\2\2MR\5\6\4\6NO\f\4\2\2OP\7\n\2\2PR\5\6\4\5QK\3\2\2\2QN"+
		"\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2US\3\2\2\2\t\22 \60\62"+
		"IQS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}