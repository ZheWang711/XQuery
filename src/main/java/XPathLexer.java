// Generated from XPath.g4 by ANTLR 4.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, SLASH=20, DOUBLESLASH=21, TAGNAME=22, ATTNAME=23, 
		FILENAME=24, WHITESPACE=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "SLASH", "DOUBLESLASH", "TAGNAME", "ATTNAME", "FILENAME", 
		"NAME", "NAMSSTART", "NAMEMIDDLE", "WHITESPACE"
	};


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u0086\n\32\f\32\16\32\u0089\13\32"+
		"\3\33\3\33\3\34\3\34\3\35\6\35\u0090\n\35\r\35\16\35\u0091\3\35\3\35\2"+
		"\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\33\3"+
		"\2\5\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\u0093\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\29\3\2\2\2\3;\3\2\2\2\5A\3\2\2\2\7H\3\2\2\2\tJ\3\2\2\2\13M\3\2\2\2"+
		"\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27\\\3\2\2"+
		"\2\31_\3\2\2\2\33a\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!j\3\2\2\2#l\3\2\2\2"+
		"%p\3\2\2\2\'r\3\2\2\2)t\3\2\2\2+v\3\2\2\2-y\3\2\2\2/{\3\2\2\2\61}\3\2"+
		"\2\2\63\u0083\3\2\2\2\65\u008a\3\2\2\2\67\u008c\3\2\2\29\u008f\3\2\2\2"+
		";<\7f\2\2<=\7q\2\2=>\7e\2\2>?\7*\2\2?@\7$\2\2@\4\3\2\2\2AB\7v\2\2BC\7"+
		"g\2\2CD\7z\2\2DE\7v\2\2EF\7*\2\2FG\7+\2\2G\6\3\2\2\2HI\7]\2\2I\b\3\2\2"+
		"\2JK\7?\2\2KL\7?\2\2L\n\3\2\2\2MN\7\60\2\2NO\7\60\2\2O\f\3\2\2\2PQ\7?"+
		"\2\2Q\16\3\2\2\2RS\7_\2\2S\20\3\2\2\2TU\7q\2\2UV\7t\2\2V\22\3\2\2\2WX"+
		"\7B\2\2X\24\3\2\2\2YZ\7$\2\2Z[\7+\2\2[\26\3\2\2\2\\]\7g\2\2]^\7s\2\2^"+
		"\30\3\2\2\2_`\7*\2\2`\32\3\2\2\2ab\7k\2\2bc\7u\2\2c\34\3\2\2\2de\7+\2"+
		"\2e\36\3\2\2\2fg\7c\2\2gh\7p\2\2hi\7f\2\2i \3\2\2\2jk\7,\2\2k\"\3\2\2"+
		"\2lm\7p\2\2mn\7q\2\2no\7v\2\2o$\3\2\2\2pq\7.\2\2q&\3\2\2\2rs\7\60\2\2"+
		"s(\3\2\2\2tu\7\61\2\2u*\3\2\2\2vw\7\61\2\2wx\7\61\2\2x,\3\2\2\2yz\5\63"+
		"\32\2z.\3\2\2\2{|\5\63\32\2|\60\3\2\2\2}~\5\63\32\2~\177\7\60\2\2\177"+
		"\u0080\7z\2\2\u0080\u0081\7o\2\2\u0081\u0082\7n\2\2\u0082\62\3\2\2\2\u0083"+
		"\u0087\5\65\33\2\u0084\u0086\5\67\34\2\u0085\u0084\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\64\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\t\2\2\2\u008b\66\3\2\2\2\u008c\u008d\t\3\2"+
		"\2\u008d8\3\2\2\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\b\35\2\2\u0094:\3\2\2\2\5\2\u0087\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}