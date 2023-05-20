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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		NEWLINE=10, WS=11, LINE_COMMENT=12, COMMENT=13, INTEGER=14, FLOAT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
			"NEWLINE", "WS", "LINE_COMMENT", "COMMENT", "INTEGER", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'?'", "'['", "']'", "':'", "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "NEWLINE", 
			"WS", "LINE_COMMENT", "COMMENT", "INTEGER", "FLOAT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\63\n\n\r\n\16\n\64"+
		"\3\n\7\n8\n\n\f\n\16\n;\13\n\3\13\5\13>\n\13\3\13\3\13\3\13\3\13\3\f\6"+
		"\fE\n\f\r\f\16\fF\3\f\3\f\3\r\3\r\3\r\3\r\7\rO\n\r\f\r\16\rR\13\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\\\n\16\f\16\16\16_\13\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\6\17g\n\17\r\17\16\17h\3\20\7\20l\n\20\f\20\16"+
		"\20o\13\20\3\20\3\20\6\20s\n\20\r\20\16\20t\3]\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\7\3\2c|\3"+
		"\2C|\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;\2~\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2"+
		"\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\62\3\2\2\2\25=\3"+
		"\2\2\2\27D\3\2\2\2\31J\3\2\2\2\33W\3\2\2\2\35f\3\2\2\2\37m\3\2\2\2!\""+
		"\7=\2\2\"\4\3\2\2\2#$\7?\2\2$\6\3\2\2\2%&\7A\2\2&\b\3\2\2\2\'(\7]\2\2"+
		"(\n\3\2\2\2)*\7_\2\2*\f\3\2\2\2+,\7<\2\2,\16\3\2\2\2-.\7-\2\2.\20\3\2"+
		"\2\2/\60\7,\2\2\60\22\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\668\t\3\2\2\67\66\3\2\2\28"+
		";\3\2\2\29\67\3\2\2\29:\3\2\2\2:\24\3\2\2\2;9\3\2\2\2<>\7\17\2\2=<\3\2"+
		"\2\2=>\3\2\2\2>?\3\2\2\2?@\7\f\2\2@A\3\2\2\2AB\b\13\2\2B\26\3\2\2\2CE"+
		"\t\4\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\f\2\2I"+
		"\30\3\2\2\2JK\7\61\2\2KL\7\61\2\2LP\3\2\2\2MO\n\5\2\2NM\3\2\2\2OR\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\25\13\2TU\3\2\2\2UV\b"+
		"\r\2\2V\32\3\2\2\2WX\7\61\2\2XY\7,\2\2Y]\3\2\2\2Z\\\13\2\2\2[Z\3\2\2\2"+
		"\\_\3\2\2\2]^\3\2\2\2][\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7,\2\2ab\7\61\2"+
		"\2bc\3\2\2\2cd\b\16\2\2d\34\3\2\2\2eg\t\6\2\2fe\3\2\2\2gh\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2i\36\3\2\2\2jl\t\6\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2m"+
		"n\3\2\2\2np\3\2\2\2om\3\2\2\2pr\7\60\2\2qs\t\6\2\2rq\3\2\2\2st\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2u \3\2\2\2\f\2\649=FP]hmt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}