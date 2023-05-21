// Generated from c:\Users\Cliente\Desktop\UFJF\Compiladores\syntax-analyser\src\main\antlr4\lang.g4 by ANTLR 4.9.2
 package com.compiler.grammar; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, ID=7, TYPE=8, INTEGER=9, 
		FLOAT=10, BOOL=11, IF=12, THEN=13, ELSE=14, ITERATE=15, READ=16, PRINT=17, 
		RETURN=18, DATA=19, OPEN_BRACKETS=20, CLOSE_BRACKETS=21, OPEN_ANGLEBRACKETS=22, 
		CLOSE_ANGLEBRACKETS=23, SEMI=24, CHAR=25, NEWLINE=26, LINE_COMMENT=27, 
		COMMENT=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "Uppercase", "Lowercase", 
			"BaseTypes", "ID", "TYPE", "INTEGER", "FLOAT", "BOOL", "IF", "THEN", 
			"ELSE", "ITERATE", "READ", "PRINT", "RETURN", "DATA", "OPEN_BRACKETS", 
			"CLOSE_BRACKETS", "OPEN_ANGLEBRACKETS", "CLOSE_ANGLEBRACKETS", "SEMI", 
			"CHAR", "NEWLINE", "LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "'('", "')'", "':'", "','", null, null, null, null, null, 
			null, "'if'", "'then'", "'else'", "'iterate'", "'read'", "'print'", "'return'", 
			"'data'", "'{'", "'}'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "ID", "TYPE", "INTEGER", "FLOAT", 
			"BOOL", "IF", "THEN", "ELSE", "ITERATE", "READ", "PRINT", "RETURN", "DATA", 
			"OPEN_BRACKETS", "CLOSE_BRACKETS", "OPEN_ANGLEBRACKETS", "CLOSE_ANGLEBRACKETS", 
			"SEMI", "CHAR", "NEWLINE", "LINE_COMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public langLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00f1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7N\n\7\r\7\16\7O\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nh\n\n\3\13\6\13k\n\13\r\13\16\13l\3\13\7\13p\n\13"+
		"\f\13\16\13s\13\13\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\r\6\r}\n\r\r\r\16"+
		"\r~\3\16\7\16\u0082\n\16\f\16\16\16\u0085\13\16\3\16\3\16\6\16\u0089\n"+
		"\16\r\16\16\16\u008a\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0096\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\5\36\u00d1\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\7\37\u00db\n\37\f\37\16\37\u00de\13\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \7 \u00e8\n \f \16 \u00eb\13 \3 \3 \3 \3 \3 \3\u00e9\2!\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\2\21\2\23\2\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21"+
		"\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36\3\2\n\5"+
		"\2\13\f\17\17\"\"\3\2C\\\3\2c|\3\2C|\4\2C\\c|\3\2\62;\3\2\2\u0081\4\2"+
		"\f\f\17\17\2\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\3A\3\2\2\2\5D\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13J\3\2\2\2\rM\3\2\2"+
		"\2\17S\3\2\2\2\21U\3\2\2\2\23g\3\2\2\2\25j\3\2\2\2\27t\3\2\2\2\31|\3\2"+
		"\2\2\33\u0083\3\2\2\2\35\u0095\3\2\2\2\37\u0097\3\2\2\2!\u009a\3\2\2\2"+
		"#\u009f\3\2\2\2%\u00a4\3\2\2\2\'\u00ac\3\2\2\2)\u00b1\3\2\2\2+\u00b7\3"+
		"\2\2\2-\u00be\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2\2"+
		"\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00cd\3\2\2\2;\u00d0\3\2\2\2=\u00d6"+
		"\3\2\2\2?\u00e3\3\2\2\2AB\7<\2\2BC\7<\2\2C\4\3\2\2\2DE\7*\2\2E\6\3\2\2"+
		"\2FG\7+\2\2G\b\3\2\2\2HI\7<\2\2I\n\3\2\2\2JK\7.\2\2K\f\3\2\2\2LN\t\2\2"+
		"\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\7\2\2R\16\3\2"+
		"\2\2ST\t\3\2\2T\20\3\2\2\2UV\t\4\2\2V\22\3\2\2\2WX\7K\2\2XY\7p\2\2Yh\7"+
		"v\2\2Z[\7H\2\2[\\\7n\2\2\\]\7q\2\2]^\7c\2\2^h\7v\2\2_`\7D\2\2`a\7q\2\2"+
		"ab\7q\2\2bh\7n\2\2cd\7E\2\2de\7j\2\2ef\7c\2\2fh\7t\2\2gW\3\2\2\2gZ\3\2"+
		"\2\2g_\3\2\2\2gc\3\2\2\2h\24\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mq\3\2\2\2np\t\5\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3"+
		"\2\2\2r\26\3\2\2\2sq\3\2\2\2tx\t\3\2\2uw\t\6\2\2vu\3\2\2\2wz\3\2\2\2x"+
		"v\3\2\2\2xy\3\2\2\2y\30\3\2\2\2zx\3\2\2\2{}\t\7\2\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\32\3\2\2\2\u0080\u0082\t\7\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\60\2\2\u0087\u0089\t"+
		"\7\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\34\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7t\2\2"+
		"\u008e\u008f\7w\2\2\u008f\u0096\7g\2\2\u0090\u0091\7h\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0096\7g\2\2\u0095"+
		"\u008c\3\2\2\2\u0095\u0090\3\2\2\2\u0096\36\3\2\2\2\u0097\u0098\7k\2\2"+
		"\u0098\u0099\7h\2\2\u0099 \3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c\7j\2"+
		"\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\"\3\2\2\2\u009f\u00a0\7"+
		"g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3$"+
		"\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab&\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7c\2"+
		"\2\u00af\u00b0\7f\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7"+
		"t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6*"+
		"\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7w\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7p\2\2\u00bd,\3\2\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2.\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7\177"+
		"\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7]\2\2\u00c8\64\3\2\2\2\u00c9\u00ca"+
		"\7_\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc8\3\2\2\2\u00cd\u00ce"+
		"\t\b\2\2\u00ce:\3\2\2\2\u00cf\u00d1\7\17\2\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\b\36\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8"+
		"\7/\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\n\t\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5;\36\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\b\37\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7}\2\2\u00e4\u00e5\7,\2\2\u00e5"+
		"\u00e9\3\2\2\2\u00e6\u00e8\13\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7\177\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f0\b \2\2\u00f0@\3\2\2\2\17\2Oglqx~\u0083\u008a\u0095"+
		"\u00d0\u00dc\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}