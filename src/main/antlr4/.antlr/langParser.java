// Generated from c:\Users\Cliente\Desktop\UFJF\Compiladores\syntax-analyser\src\main\antlr4\lang.g4 by ANTLR 4.9.2
 
	package com.compiler.grammar;
	import com.compiler.ast.*;

 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class langParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, ID=7, TYPE=8, INTEGER=9, 
		FLOAT=10, BOOL=11, IF=12, THEN=13, ELSE=14, ITERATE=15, READ=16, PRINT=17, 
		RETURN=18, DATA=19, OPEN_BRACKETS=20, CLOSE_BRACKETS=21, OPEN_ANGLEBRACKETS=22, 
		CLOSE_ANGLEBRACKETS=23, SEMI=24, CHAR=25, NEWLINE=26, LINE_COMMENT=27, 
		COMMENT=28, BaseTypes=29;
	public static final int
		RULE_prog = 0, RULE_data = 1, RULE_typeDeclaration = 2, RULE_function = 3, 
		RULE_params = 4, RULE_type = 5, RULE_basicType = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "data", "typeDeclaration", "function", "params", "type", "basicType"
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
			"SEMI", "CHAR", "NEWLINE", "LINE_COMMENT", "COMMENT", "BaseTypes"
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

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				data();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATA );
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(langParser.DATA, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode OPEN_BRACKETS() { return getToken(langParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(langParser.CLOSE_BRACKETS, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(DATA);
			setState(20);
			match(ID);
			setState(21);
			match(OPEN_BRACKETS);
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				typeDeclaration();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(27);
			match(CLOSE_BRACKETS);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(langParser.TYPE, 0); }
		public TerminalNode SEMI() { return getToken(langParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(ID);
			setState(30);
			match(T__0);
			setState(31);
			match(TYPE);
			setState(32);
			match(SEMI);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode OPEN_BRACKETS() { return getToken(langParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(langParser.CLOSE_BRACKETS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(langParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(langParser.TYPE, i);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(T__1);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(36);
				params();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(T__2);
			{
			setState(43);
			match(T__3);
			setState(44);
			match(TYPE);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(45);
				match(T__4);
				setState(46);
				match(TYPE);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(52);
			match(OPEN_BRACKETS);
			setState(53);
			match(CLOSE_BRACKETS);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(langParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(langParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(langParser.TYPE, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			setState(56);
			match(T__0);
			setState(57);
			match(TYPE);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(58);
				match(T__4);
				setState(59);
				match(ID);
				setState(60);
				match(T__0);
				setState(61);
				match(TYPE);
				}
				}
				setState(66);
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

	public static class TypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_ANGLEBRACKETS() { return getToken(langParser.OPEN_ANGLEBRACKETS, 0); }
		public TerminalNode CLOSE_ANGLEBRACKETS() { return getToken(langParser.CLOSE_ANGLEBRACKETS, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			basicType();
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(70);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(71);
					match(OPEN_ANGLEBRACKETS);
					setState(72);
					match(CLOSE_ANGLEBRACKETS);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode BaseTypes() { return getToken(langParser.BaseTypes, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(BaseTypes);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\5\3\5\3\5\3\5\3\5\7\5\62\n\5\f\5"+
		"\16\5\65\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6A\n\6\f\6\16"+
		"\6D\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b\2"+
		"\3\f\t\2\4\6\b\n\f\16\2\2\2Q\2\21\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b"+
		"$\3\2\2\2\n9\3\2\2\2\fE\3\2\2\2\16P\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2"+
		"\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\7\25\2"+
		"\2\26\27\7\t\2\2\27\31\7\26\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\33\3\2"+
		"\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\27\2\2\36\5\3\2"+
		"\2\2\37 \7\t\2\2 !\7\3\2\2!\"\7\n\2\2\"#\7\32\2\2#\7\3\2\2\2$%\7\t\2\2"+
		"%)\7\4\2\2&(\5\n\6\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2"+
		"\2+)\3\2\2\2,-\7\5\2\2-.\7\6\2\2.\63\7\n\2\2/\60\7\7\2\2\60\62\7\n\2\2"+
		"\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65"+
		"\63\3\2\2\2\66\67\7\26\2\2\678\7\27\2\28\t\3\2\2\29:\7\t\2\2:;\7\3\2\2"+
		";B\7\n\2\2<=\7\7\2\2=>\7\t\2\2>?\7\3\2\2?A\7\n\2\2@<\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3\2\2\2EF\b\7\1\2FG\5\16\b\2GM\3\2"+
		"\2\2HI\f\4\2\2IJ\7\30\2\2JL\7\31\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2N\r\3\2\2\2OM\3\2\2\2PQ\7\37\2\2Q\17\3\2\2\2\b\23\33)\63BM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}