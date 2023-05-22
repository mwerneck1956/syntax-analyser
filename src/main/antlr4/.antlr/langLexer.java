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
		DATA=1, NEW=2, INT=3, FLOAT=4, BOOL=5, CHAR=6, PRINT=7, RETURN=8, READ=9, 
		ITERATE=10, IF=11, ELSE=12, ID=13, TYPE=14, LITERAL_INT=15, LITERAL_FLOAT=16, 
		LITERAL_CHAR=17, LITERAL_TRUE=18, LITERAL_FALSE=19, LITERAL_NULL=20, NEWLINE=21, 
		WHITESPACE=22, LINE_COMMENT=23, COMMENT=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, 
		OPEN_PARENTHESIS=27, CLOSE_PARENTHESIS=28, OPEN_SQUAREBRACKET=29, CLOSE_SQUAREBRACKET=30, 
		SEMI=31, DOT=32, COMMA=33, EQ=34, RELACIONAL=35, GREATER_THAN=36, EQEQ=37, 
		DIFF=38, PLUS=39, MINUS=40, TIMES=41, DIV=42, MOD=43, LOGICALNEGATION=44, 
		AND=45, COLON=46, DOUBLECOLON=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DATA", "NEW", "INT", "FLOAT", "BOOL", "CHAR", "PRINT", "RETURN", "READ", 
			"ITERATE", "IF", "ELSE", "ID", "TYPE", "LITERAL_INT", "LITERAL_FLOAT", 
			"LITERAL_CHAR", "LITERAL_TRUE", "LITERAL_FALSE", "LITERAL_NULL", "NEWLINE", 
			"WHITESPACE", "LINE_COMMENT", "COMMENT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_SQUAREBRACKET", "CLOSE_SQUAREBRACKET", 
			"SEMI", "DOT", "COMMA", "EQ", "RELACIONAL", "GREATER_THAN", "EQEQ", "DIFF", 
			"PLUS", "MINUS", "TIMES", "DIV", "MOD", "LOGICALNEGATION", "AND", "COLON", 
			"DOUBLECOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'data'", "'new'", "'Int'", "'Float'", "'Bool'", "'Char'", "'print'", 
			"'return'", "'read'", "'iterate'", "'if'", "'else'", null, null, null, 
			null, null, "'true'", "'false'", "'null'", null, null, null, null, "'{'", 
			"'}'", "'('", "')'", "'['", "']'", "';'", "'.'", "','", "'='", "'<'", 
			"'>'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'&&'", 
			"':'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATA", "NEW", "INT", "FLOAT", "BOOL", "CHAR", "PRINT", "RETURN", 
			"READ", "ITERATE", "IF", "ELSE", "ID", "TYPE", "LITERAL_INT", "LITERAL_FLOAT", 
			"LITERAL_CHAR", "LITERAL_TRUE", "LITERAL_FALSE", "LITERAL_NULL", "NEWLINE", 
			"WHITESPACE", "LINE_COMMENT", "COMMENT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_SQUAREBRACKET", "CLOSE_SQUAREBRACKET", 
			"SEMI", "DOT", "COMMA", "EQ", "RELACIONAL", "GREATER_THAN", "EQEQ", "DIFF", 
			"PLUS", "MINUS", "TIMES", "DIV", "MOD", "LOGICALNEGATION", "AND", "COLON", 
			"DOUBLECOLON"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0136\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\6\16\u00a2\n\16\r\16\16\16\u00a3\3\16\7\16\u00a7"+
		"\n\16\f\16\16\16\u00aa\13\16\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1"+
		"\13\17\3\20\6\20\u00b4\n\20\r\20\16\20\u00b5\3\21\7\21\u00b9\n\21\f\21"+
		"\16\21\u00bc\13\21\3\21\3\21\6\21\u00c0\n\21\r\21\16\21\u00c1\3\22\3\22"+
		"\3\22\3\22\5\22\u00c8\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u00dd\n\26\3\26"+
		"\3\26\3\26\3\26\3\27\6\27\u00e4\n\27\r\27\16\27\u00e5\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\7\30\u00ee\n\30\f\30\16\30\u00f1\13\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\7\31\u00fb\n\31\f\31\16\31\u00fe\13\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\u00fc"+
		"\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\13\3\2c|\3\2C|\3\2"+
		"C\\\4\2C\\c|\3\2\62;\t\2$$))^^ddppttvv\6\2\f\f\17\17$$^^\4\2\13\13\"\""+
		"\4\2\f\f\17\17\2\u0140\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5f\3\2\2\2\7j\3\2\2\2\tn\3\2\2\2\13t\3\2"+
		"\2\2\ry\3\2\2\2\17~\3\2\2\2\21\u0084\3\2\2\2\23\u008b\3\2\2\2\25\u0090"+
		"\3\2\2\2\27\u0098\3\2\2\2\31\u009b\3\2\2\2\33\u00a1\3\2\2\2\35\u00ab\3"+
		"\2\2\2\37\u00b3\3\2\2\2!\u00ba\3\2\2\2#\u00c3\3\2\2\2%\u00cb\3\2\2\2\'"+
		"\u00d0\3\2\2\2)\u00d6\3\2\2\2+\u00dc\3\2\2\2-\u00e3\3\2\2\2/\u00e9\3\2"+
		"\2\2\61\u00f6\3\2\2\2\63\u0104\3\2\2\2\65\u0106\3\2\2\2\67\u0108\3\2\2"+
		"\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u010e\3\2\2\2?\u0110\3\2\2\2A\u0112"+
		"\3\2\2\2C\u0114\3\2\2\2E\u0116\3\2\2\2G\u0118\3\2\2\2I\u011a\3\2\2\2K"+
		"\u011c\3\2\2\2M\u011f\3\2\2\2O\u0122\3\2\2\2Q\u0124\3\2\2\2S\u0126\3\2"+
		"\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012c\3\2\2\2[\u012e\3\2\2\2]\u0131"+
		"\3\2\2\2_\u0133\3\2\2\2ab\7f\2\2bc\7c\2\2cd\7v\2\2de\7c\2\2e\4\3\2\2\2"+
		"fg\7p\2\2gh\7g\2\2hi\7y\2\2i\6\3\2\2\2jk\7K\2\2kl\7p\2\2lm\7v\2\2m\b\3"+
		"\2\2\2no\7H\2\2op\7n\2\2pq\7q\2\2qr\7c\2\2rs\7v\2\2s\n\3\2\2\2tu\7D\2"+
		"\2uv\7q\2\2vw\7q\2\2wx\7n\2\2x\f\3\2\2\2yz\7E\2\2z{\7j\2\2{|\7c\2\2|}"+
		"\7t\2\2}\16\3\2\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\20\3\2\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2"+
		"\u0089\u008a\7p\2\2\u008a\22\3\2\2\2\u008b\u008c\7t\2\2\u008c\u008d\7"+
		"g\2\2\u008d\u008e\7c\2\2\u008e\u008f\7f\2\2\u008f\24\3\2\2\2\u0090\u0091"+
		"\7k\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7c\2\2\u0095\u0096\7v\2\2\u0096\u0097\7g\2\2\u0097\26\3\2\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\30\3\2\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f\32\3\2\2\2\u00a0"+
		"\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\34\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00af\t\4\2\2\u00ac\u00ae"+
		"\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\36\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\t\6\2"+
		"\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6 \3\2\2\2\u00b7\u00b9\t\6\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\60\2\2\u00be\u00c0\t\6\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\"\3\2\2\2\u00c3\u00c7\7)\2\2\u00c4\u00c5\7^\2\2\u00c5\u00c8"+
		"\t\7\2\2\u00c6\u00c8\n\b\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\7)\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2\u00cf&\3\2\2\2\u00d0"+
		"\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7w\2"+
		"\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7n\2\2\u00da*\3\2\2\2\u00db\u00dd\7"+
		"\17\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\7\f\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\26\2\2\u00e1,\3\2\2\2"+
		"\u00e2\u00e4\t\t\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\27\2\2"+
		"\u00e8.\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\7/\2\2\u00eb\u00ef\3\2"+
		"\2\2\u00ec\u00ee\n\n\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f3\5+\26\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\30\2\2\u00f5"+
		"\60\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7\u00f8\7/\2\2\u00f8\u00fc\3\2\2\2"+
		"\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\7,\2\2\u0100\u0101\7\177\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b"+
		"\31\2\2\u0103\62\3\2\2\2\u0104\u0105\7}\2\2\u0105\64\3\2\2\2\u0106\u0107"+
		"\7\177\2\2\u0107\66\3\2\2\2\u0108\u0109\7*\2\2\u01098\3\2\2\2\u010a\u010b"+
		"\7+\2\2\u010b:\3\2\2\2\u010c\u010d\7]\2\2\u010d<\3\2\2\2\u010e\u010f\7"+
		"_\2\2\u010f>\3\2\2\2\u0110\u0111\7=\2\2\u0111@\3\2\2\2\u0112\u0113\7\60"+
		"\2\2\u0113B\3\2\2\2\u0114\u0115\7.\2\2\u0115D\3\2\2\2\u0116\u0117\7?\2"+
		"\2\u0117F\3\2\2\2\u0118\u0119\7>\2\2\u0119H\3\2\2\2\u011a\u011b\7@\2\2"+
		"\u011bJ\3\2\2\2\u011c\u011d\7?\2\2\u011d\u011e\7?\2\2\u011eL\3\2\2\2\u011f"+
		"\u0120\7#\2\2\u0120\u0121\7?\2\2\u0121N\3\2\2\2\u0122\u0123\7-\2\2\u0123"+
		"P\3\2\2\2\u0124\u0125\7/\2\2\u0125R\3\2\2\2\u0126\u0127\7,\2\2\u0127T"+
		"\3\2\2\2\u0128\u0129\7\61\2\2\u0129V\3\2\2\2\u012a\u012b\7\'\2\2\u012b"+
		"X\3\2\2\2\u012c\u012d\7#\2\2\u012dZ\3\2\2\2\u012e\u012f\7(\2\2\u012f\u0130"+
		"\7(\2\2\u0130\\\3\2\2\2\u0131\u0132\7<\2\2\u0132^\3\2\2\2\u0133\u0134"+
		"\7<\2\2\u0134\u0135\7<\2\2\u0135`\3\2\2\2\16\2\u00a3\u00a8\u00af\u00b5"+
		"\u00ba\u00c1\u00c7\u00dc\u00e5\u00ef\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}