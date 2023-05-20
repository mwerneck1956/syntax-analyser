// Generated from lang.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, TYPE=13, INTEGER=14, FLOAT=15, BOOL=16, IF=17, 
		THEN=18, ELSE=19, ITERATE=20, READ=21, PRINT=22, RETURN=23, CHAR=24, NEWLINE=25, 
		WS=26, LINE_COMMENT=27, COMMENT=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "Uppercase", "Lowercase", "ID", "TYPE", "INTEGER", "FLOAT", 
			"BOOL", "IF", "THEN", "ELSE", "ITERATE", "READ", "PRINT", "RETURN", "CHAR", 
			"NEWLINE", "WS", "LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'::'", "'='", "'?'", "'['", "']'", "':'", 
			"'+'", "'*'", null, null, null, null, null, "'if'", "'then'", "'else'", 
			"'iterate'", "'read'", "'print'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "TYPE", "INTEGER", "FLOAT", "BOOL", "IF", "THEN", "ELSE", "ITERATE", 
			"READ", "PRINT", "RETURN", "CHAR", "NEWLINE", "WS", "LINE_COMMENT", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00da\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17\\\n\17\r\17\16\17]\3"+
		"\17\7\17a\n\17\f\17\16\17d\13\17\3\20\3\20\7\20h\n\20\f\20\16\20k\13\20"+
		"\3\21\6\21n\n\21\r\21\16\21o\3\22\7\22s\n\22\f\22\16\22v\13\22\3\22\3"+
		"\22\6\22z\n\22\r\22\16\22{\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0087\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\5\34\u00b3\n\34\3\34\3\34\3\34\3\34\3\35\6\35\u00ba\n"+
		"\35\r\35\16\35\u00bb\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00c4\n\36\f\36"+
		"\16\36\u00c7\13\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00d1"+
		"\n\37\f\37\16\37\u00d4\13\37\3\37\3\37\3\37\3\37\3\37\3\u00d2\2 \3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\16\37\17!\20"+
		"#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36\3\2"+
		"\13\3\2C\\\3\2c|\3\2C|\b\2WWcceeggrrtu\n\2NNWWcceeggqrtuyy\3\2\62;\3\2"+
		"\2\u0081\6\2\n\f\17\17\"\"~~\4\2\f\f\17\17\2\u00e2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2"+
		"\2\tE\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2"+
		"\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35[\3\2\2\2\37e\3\2"+
		"\2\2!m\3\2\2\2#t\3\2\2\2%\u0086\3\2\2\2\'\u0088\3\2\2\2)\u008b\3\2\2\2"+
		"+\u0090\3\2\2\2-\u0095\3\2\2\2/\u009d\3\2\2\2\61\u00a2\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00af\3\2\2\2\67\u00b2\3\2\2\29\u00b9\3\2\2\2;\u00bf\3\2\2"+
		"\2=\u00cc\3\2\2\2?@\7=\2\2@\4\3\2\2\2AB\7}\2\2B\6\3\2\2\2CD\7\177\2\2"+
		"D\b\3\2\2\2EF\7<\2\2FG\7<\2\2G\n\3\2\2\2HI\7?\2\2I\f\3\2\2\2JK\7A\2\2"+
		"K\16\3\2\2\2LM\7]\2\2M\20\3\2\2\2NO\7_\2\2O\22\3\2\2\2PQ\7<\2\2Q\24\3"+
		"\2\2\2RS\7-\2\2S\26\3\2\2\2TU\7,\2\2U\30\3\2\2\2VW\t\2\2\2W\32\3\2\2\2"+
		"XY\t\3\2\2Y\34\3\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^b\3\2\2\2_a\t\4\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\36\3"+
		"\2\2\2db\3\2\2\2ei\t\5\2\2fh\t\6\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2j \3\2\2\2ki\3\2\2\2ln\t\7\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2p\"\3\2\2\2qs\t\7\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw"+
		"\3\2\2\2vt\3\2\2\2wy\7\60\2\2xz\t\7\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|$\3\2\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7w\2\2\u0080\u0087"+
		"\7g\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0087\7g\2\2\u0086}\3\2\2\2\u0086\u0081\3\2\2\2\u0087"+
		"&\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a(\3\2\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u008d\7j\2\2\u008d\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7g\2\2\u0094,\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7t\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2"+
		"\u009b\u009c\7g\2\2\u009c.\3\2\2\2\u009d\u009e\7t\2\2\u009e\u009f\7g\2"+
		"\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\64\3\2\2\2\u00af\u00b0\t\b\2\2\u00b0\66\3\2\2\2\u00b1\u00b3\7\17"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7\f\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\34\2\2\u00b78\3\2\2\2"+
		"\u00b8\u00ba\t\t\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\35\2\2"+
		"\u00be:\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c5\3\2"+
		"\2\2\u00c2\u00c4\n\n\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\5\67\34\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\36\2\2\u00cb"+
		"<\3\2\2\2\u00cc\u00cd\7}\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d2\3\2\2\2\u00cf"+
		"\u00d1\13\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d6\u00d7\7\177\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b"+
		"\37\2\2\u00d9>\3\2\2\2\16\2]biot{\u0086\u00b2\u00bb\u00c5\u00d2\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}