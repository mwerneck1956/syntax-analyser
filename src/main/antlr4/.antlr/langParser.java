// Generated from c:\Users\Cliente\Desktop\UFJF\Compiladores\syntax-analyser\src\main\antlr4\lang.g4 by ANTLR 4.9.2
 
	package com.compiler.grammar;
	import com.compiler.ast.*;
	import java.util.HashMap;
 
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
		DATA=1, NEW=2, INT=3, FLOAT=4, BOOL=5, CHAR=6, PRINT=7, RETURN=8, READ=9, 
		ITERATE=10, IF=11, ELSE=12, ID=13, TYPE=14, LITERAL_INT=15, LITERAL_FLOAT=16, 
		LITERAL_CHAR=17, LITERAL_TRUE=18, LITERAL_FALSE=19, LITERAL_NULL=20, NEWLINE=21, 
		WHITESPACE=22, LINE_COMMENT=23, COMMENT=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, 
		OPEN_PARENTHESIS=27, CLOSE_PARENTHESIS=28, OPEN_SQUAREBRACKET=29, CLOSE_SQUAREBRACKET=30, 
		SEMI=31, DOT=32, COMMA=33, EQ=34, RELACIONAL=35, GREATER_THAN=36, EQEQ=37, 
		DIFF=38, PLUS=39, MINUS=40, TIMES=41, DIV=42, MOD=43, LOGICALNEGATION=44, 
		AND=45, COLON=46, DOUBLECOLON=47;
	public static final int
		RULE_prog = 0, RULE_dataList = 1, RULE_data = 2, RULE_declList = 3, RULE_decl = 4, 
		RULE_func = 5, RULE_params = 6, RULE_type = 7, RULE_btype = 8, RULE_cmd = 9, 
		RULE_exp = 10, RULE_rexp = 11, RULE_aexp = 12, RULE_mexp = 13, RULE_sexp = 14, 
		RULE_pexp = 15, RULE_lvalue = 16, RULE_exps = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dataList", "data", "declList", "decl", "func", "params", "type", 
			"btype", "cmd", "exp", "rexp", "aexp", "mexp", "sexp", "pexp", "lvalue", 
			"exps"
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
		public Prog ast;
		public DataListContext d;
		public DataListContext dataList() {
			return getRuleContext(DataListContext.class,0);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
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
			setState(36);
			((ProgContext)_localctx).d = dataList();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(37);
				func();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
					((ProgContext)_localctx).ast =  new Prog(((ProgContext)_localctx).d.dataListInstance);
				
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

	public static class DataListContext extends ParserRuleContext {
		public HashMap<String,Data> dataListInstance;
		public DataContext d;
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public DataListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataList; }
	}

	public final DataListContext dataList() throws RecognitionException {
		DataListContext _localctx = new DataListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					((DataListContext)_localctx).dataListInstance =  new HashMap<String,Data>();
			 	
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA) {
				{
				{
				setState(46);
				((DataListContext)_localctx).d = data();
				 
						_localctx.dataListInstance.put(((DataListContext)_localctx).d.dataObj.getIdName() , ((DataListContext)_localctx).d.dataObj);
						
				}
				}
				setState(53);
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

	public static class DataContext extends ParserRuleContext {
		public Data dataObj;
		public Token ID;
		public DeclListContext d;
		public TerminalNode DATA() { return getToken(langParser.DATA, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(langParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(langParser.CLOSE_BRACKET, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(DATA);
			setState(55);
			((DataContext)_localctx).ID = match(ID);
			setState(56);
			match(OPEN_BRACKET);
			setState(57);
			((DataContext)_localctx).d = declList();
			setState(58);
			match(CLOSE_BRACKET);

				 	ID id = new ID((((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getLine():0), (((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getCharPositionInLine():0),  (((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getText():null));

					((DataContext)_localctx).dataObj =  new Data(id, ((DataContext)_localctx).d.declarationList);
				
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

	public static class DeclListContext extends ParserRuleContext {
		public ArrayList<Declaration> declarationList;
		public DeclContext decl;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclListContext)_localctx).declarationList =  new ArrayList<Declaration>();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(62);
				((DeclListContext)_localctx).decl = decl();
				_localctx.declarationList.add(((DeclListContext)_localctx).decl.declaration);
				}
				}
				setState(69);
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

	public static class DeclContext extends ParserRuleContext {
		public Declaration declaration;
		public Token ID;
		public TypeContext t;
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode DOUBLECOLON() { return getToken(langParser.DOUBLECOLON, 0); }
		public TerminalNode SEMI() { return getToken(langParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((DeclContext)_localctx).ID = match(ID);
			setState(71);
			match(DOUBLECOLON);
			setState(72);
			((DeclContext)_localctx).t = type(0);
			setState(73);
			match(SEMI);

					{ 
						ID id = new ID((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getLine():0), (((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getCharPositionInLine():0),  (((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null));
						((DeclContext)_localctx).declaration =  new Declaration(id, ((DeclContext)_localctx).t.basicType);	 
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(langParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(langParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(langParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(langParser.CLOSE_BRACKET, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(langParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(langParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(langParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(OPEN_PARENTHESIS);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(78);
				params();
				}
			}

			setState(81);
			match(CLOSE_PARENTHESIS);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(82);
				match(COLON);
				setState(83);
				type(0);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					type(0);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
			match(OPEN_BRACKET);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << READ) | (1L << ITERATE) | (1L << IF) | (1L << ID) | (1L << OPEN_BRACKET))) != 0)) {
				{
				{
				setState(94);
				cmd();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(CLOSE_BRACKET);
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
		public Param param;
		public Token ID;
		public TypeContext t;
		public List<TerminalNode> ID() { return getTokens(langParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(langParser.ID, i);
		}
		public List<TerminalNode> DOUBLECOLON() { return getTokens(langParser.DOUBLECOLON); }
		public TerminalNode DOUBLECOLON(int i) {
			return getToken(langParser.DOUBLECOLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(langParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(langParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((ParamsContext)_localctx).ID = match(ID);
			setState(103);
			match(DOUBLECOLON);
			setState(104);
			((ParamsContext)_localctx).t = type(0);
			 

				ID id = new ID((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getLine():0), (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getCharPositionInLine():0),  (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null));
				((ParamsContext)_localctx).param =  new Param(id , ((ParamsContext)_localctx).t.basicType);

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				((ParamsContext)_localctx).ID = match(ID);
				setState(108);
				match(DOUBLECOLON);
				setState(109);
				type(0);
				}
				}
				setState(114);
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
		public BasicType basicType;
		public BtypeContext btype;
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(langParser.OPEN_SQUAREBRACKET, 0); }
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(langParser.CLOSE_SQUAREBRACKET, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			((TypeContext)_localctx).btype = btype();
			 
					((TypeContext)_localctx).basicType =  ((TypeContext)_localctx).btype.basicType;
				
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(119);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(120);
					match(OPEN_SQUAREBRACKET);
					setState(121);
					match(CLOSE_SQUAREBRACKET);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class BtypeContext extends ParserRuleContext {
		public BasicType basicType;
		public Token INT;
		public Token CHAR;
		public Token BOOL;
		public Token FLOAT;
		public Token TYPE;
		public TerminalNode INT() { return getToken(langParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(langParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(langParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(langParser.FLOAT, 0); }
		public TerminalNode TYPE() { return getToken(langParser.TYPE, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_btype);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((BtypeContext)_localctx).INT = match(INT);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getLine():0), (((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getCharPositionInLine():0), "Int");
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				((BtypeContext)_localctx).CHAR = match(CHAR);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getLine():0), (((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getCharPositionInLine():0), "CHAR"); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((BtypeContext)_localctx).BOOL = match(BOOL);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getLine():0), (((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getCharPositionInLine():0), "CHAR"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				((BtypeContext)_localctx).FLOAT = match(FLOAT);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getLine():0), (((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getCharPositionInLine():0), "Float"); 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				((BtypeContext)_localctx).TYPE = match(TYPE);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).TYPE!=null?((BtypeContext)_localctx).TYPE.getLine():0), (((BtypeContext)_localctx).TYPE!=null?((BtypeContext)_localctx).TYPE.getCharPositionInLine():0), (((BtypeContext)_localctx).TYPE!=null?((BtypeContext)_localctx).TYPE.getText():null)); 
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

	public static class CmdContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(langParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(langParser.CLOSE_BRACKET, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode IF() { return getToken(langParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(langParser.OPEN_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(langParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode ELSE() { return getToken(langParser.ELSE, 0); }
		public TerminalNode ITERATE() { return getToken(langParser.ITERATE, 0); }
		public TerminalNode READ() { return getToken(langParser.READ, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(langParser.SEMI, 0); }
		public TerminalNode PRINT() { return getToken(langParser.PRINT, 0); }
		public TerminalNode RETURN() { return getToken(langParser.RETURN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(langParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(langParser.COMMA, i);
		}
		public TerminalNode EQ() { return getToken(langParser.EQ, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode RELACIONAL() { return getToken(langParser.RELACIONAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(langParser.GREATER_THAN, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmd);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(OPEN_BRACKET);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << READ) | (1L << ITERATE) | (1L << IF) | (1L << ID) | (1L << OPEN_BRACKET))) != 0)) {
					{
					{
					setState(140);
					cmd();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(IF);
				setState(148);
				match(OPEN_PARENTHESIS);
				setState(149);
				exp(0);
				setState(150);
				match(CLOSE_PARENTHESIS);
				setState(151);
				cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(IF);
				setState(154);
				match(OPEN_PARENTHESIS);
				setState(155);
				exp(0);
				setState(156);
				match(CLOSE_PARENTHESIS);
				setState(157);
				cmd();
				setState(158);
				match(ELSE);
				setState(159);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(ITERATE);
				setState(162);
				match(OPEN_PARENTHESIS);
				setState(163);
				exp(0);
				setState(164);
				match(CLOSE_PARENTHESIS);
				setState(165);
				cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(READ);
				setState(168);
				lvalue(0);
				setState(169);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(PRINT);
				setState(172);
				exp(0);
				setState(173);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(RETURN);
				setState(176);
				exp(0);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(177);
					match(COMMA);
					setState(178);
					exp(0);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				lvalue(0);
				setState(187);
				match(EQ);
				setState(188);
				exp(0);
				setState(189);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				match(ID);
				setState(192);
				match(OPEN_PARENTHESIS);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << OPEN_PARENTHESIS) | (1L << MINUS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(193);
					exps();
					}
				}

				setState(196);
				match(CLOSE_PARENTHESIS);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELACIONAL) {
					{
					setState(197);
					match(RELACIONAL);
					setState(198);
					lvalue(0);
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(199);
						match(COMMA);
						setState(200);
						lvalue(0);
						}
						}
						setState(205);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(206);
					match(GREATER_THAN);
					}
				}

				setState(210);
				match(SEMI);
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

	public static class ExpContext extends ParserRuleContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(langParser.AND, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(216);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(217);
					match(AND);
					setState(218);
					exp(3);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class RexpContext extends ParserRuleContext {
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public TerminalNode RELACIONAL() { return getToken(langParser.RELACIONAL, 0); }
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public TerminalNode EQEQ() { return getToken(langParser.EQEQ, 0); }
		public TerminalNode DIFF() { return getToken(langParser.DIFF, 0); }
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
	}

	public final RexpContext rexp() throws RecognitionException {
		return rexp(0);
	}

	private RexpContext rexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RexpContext _localctx = new RexpContext(_ctx, _parentState);
		RexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_rexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(225);
				aexp(0);
				setState(226);
				match(RELACIONAL);
				setState(227);
				aexp(0);
				}
				break;
			case 2:
				{
				setState(229);
				aexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(232);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(233);
						match(EQEQ);
						setState(234);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(235);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(236);
						match(DIFF);
						setState(237);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class AexpContext extends ParserRuleContext {
		public Expr binOp;
		public AexpContext a;
		public MexpContext m;
		public Token PLUS;
		public Token MINUS;
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(langParser.PLUS, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(langParser.MINUS, 0); }
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	}

	public final AexpContext aexp() throws RecognitionException {
		return aexp(0);
	}

	private AexpContext aexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpContext _localctx = new AexpContext(_ctx, _parentState);
		AexpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(244);
			((AexpContext)_localctx).m = mexp(0);
			 ((AexpContext)_localctx).binOp =  ((AexpContext)_localctx).m.mexpExpr; 
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						((AexpContext)_localctx).PLUS = match(PLUS);
						setState(249);
						((AexpContext)_localctx).m = mexp(0);
						 ((AexpContext)_localctx).binOp =  new Add((((AexpContext)_localctx).PLUS!=null?((AexpContext)_localctx).PLUS.getLine():0), (((AexpContext)_localctx).PLUS!=null?((AexpContext)_localctx).PLUS.getCharPositionInLine():0), ((AexpContext)_localctx).a.binOp, ((AexpContext)_localctx).m.mexpExpr); 
						}
						break;
					case 2:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(252);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(253);
						((AexpContext)_localctx).MINUS = match(MINUS);
						setState(254);
						((AexpContext)_localctx).m = mexp(0);
						 ((AexpContext)_localctx).binOp =  new Minus((((AexpContext)_localctx).MINUS!=null?((AexpContext)_localctx).MINUS.getLine():0), (((AexpContext)_localctx).MINUS!=null?((AexpContext)_localctx).MINUS.getCharPositionInLine():0), ((AexpContext)_localctx).a.binOp, ((AexpContext)_localctx).m.mexpExpr); 
						          		
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class MexpContext extends ParserRuleContext {
		public Expr mexpExpr;
		public MexpContext m;
		public SexpContext s;
		public Token TIMES;
		public Token DIV;
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(langParser.TIMES, 0); }
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode DIV() { return getToken(langParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(langParser.MOD, 0); }
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
	}

	public final MexpContext mexp() throws RecognitionException {
		return mexp(0);
	}

	private MexpContext mexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MexpContext _localctx = new MexpContext(_ctx, _parentState);
		MexpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(263);
			((MexpContext)_localctx).s = sexp();
			  ((MexpContext)_localctx).mexpExpr =  ((MexpContext)_localctx).s.sexpValue; 
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						_localctx.m = _prevctx;
						_localctx.m = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(266);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(267);
						((MexpContext)_localctx).TIMES = match(TIMES);
						setState(268);
						((MexpContext)_localctx).s = sexp();

						          		((MexpContext)_localctx).mexpExpr =  new Mult((((MexpContext)_localctx).TIMES!=null?((MexpContext)_localctx).TIMES.getLine():0), (((MexpContext)_localctx).TIMES!=null?((MexpContext)_localctx).TIMES.getCharPositionInLine():0), ((MexpContext)_localctx).m.mexpExpr , ((MexpContext)_localctx).s.sexpValue);
						          	
						}
						break;
					case 2:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						_localctx.m = _prevctx;
						_localctx.m = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(271);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(272);
						((MexpContext)_localctx).DIV = match(DIV);
						setState(273);
						((MexpContext)_localctx).s = sexp();
						 
						          		((MexpContext)_localctx).mexpExpr =  new Div((((MexpContext)_localctx).DIV!=null?((MexpContext)_localctx).DIV.getLine():0), (((MexpContext)_localctx).DIV!=null?((MexpContext)_localctx).DIV.getCharPositionInLine():0), ((MexpContext)_localctx).m.mexpExpr , ((MexpContext)_localctx).s.sexpValue);
						          	
						}
						break;
					case 3:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(276);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(277);
						match(MOD);
						setState(278);
						sexp();
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class SexpContext extends ParserRuleContext {
		public Expr sexpValue;
		public Token LITERAL_TRUE;
		public Token LITERAL_FALSE;
		public Token LITERAL_NULL;
		public Token LITERAL_INT;
		public Token LITERAL_FLOAT;
		public Token LITERAL_CHAR;
		public TerminalNode LOGICALNEGATION() { return getToken(langParser.LOGICALNEGATION, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(langParser.MINUS, 0); }
		public TerminalNode LITERAL_TRUE() { return getToken(langParser.LITERAL_TRUE, 0); }
		public TerminalNode LITERAL_FALSE() { return getToken(langParser.LITERAL_FALSE, 0); }
		public TerminalNode LITERAL_NULL() { return getToken(langParser.LITERAL_NULL, 0); }
		public TerminalNode LITERAL_INT() { return getToken(langParser.LITERAL_INT, 0); }
		public TerminalNode LITERAL_FLOAT() { return getToken(langParser.LITERAL_FLOAT, 0); }
		public TerminalNode LITERAL_CHAR() { return getToken(langParser.LITERAL_CHAR, 0); }
		public PexpContext pexp() {
			return getRuleContext(PexpContext.class,0);
		}
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sexp);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICALNEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(LOGICALNEGATION);
				setState(285);
				sexp();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(MINUS);
				setState(287);
				sexp();
				}
				break;
			case LITERAL_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				((SexpContext)_localctx).LITERAL_TRUE = match(LITERAL_TRUE);
				((SexpContext)_localctx).sexpValue =  new LiteralTrue((((SexpContext)_localctx).LITERAL_TRUE!=null?((SexpContext)_localctx).LITERAL_TRUE.getLine():0),(((SexpContext)_localctx).LITERAL_TRUE!=null?((SexpContext)_localctx).LITERAL_TRUE.getCharPositionInLine():0));
				}
				break;
			case LITERAL_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				((SexpContext)_localctx).LITERAL_FALSE = match(LITERAL_FALSE);
				((SexpContext)_localctx).sexpValue =  new LiteralFalse((((SexpContext)_localctx).LITERAL_FALSE!=null?((SexpContext)_localctx).LITERAL_FALSE.getLine():0),(((SexpContext)_localctx).LITERAL_FALSE!=null?((SexpContext)_localctx).LITERAL_FALSE.getCharPositionInLine():0));
				}
				break;
			case LITERAL_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				((SexpContext)_localctx).LITERAL_NULL = match(LITERAL_NULL);
				((SexpContext)_localctx).sexpValue =  new LiteralNull((((SexpContext)_localctx).LITERAL_NULL!=null?((SexpContext)_localctx).LITERAL_NULL.getLine():0),(((SexpContext)_localctx).LITERAL_NULL!=null?((SexpContext)_localctx).LITERAL_NULL.getCharPositionInLine():0));
				}
				break;
			case LITERAL_INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				((SexpContext)_localctx).LITERAL_INT = match(LITERAL_INT);

						((SexpContext)_localctx).sexpValue =  new LiteralInt((((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getLine():0),(((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getCharPositionInLine():0),Integer.parseInt((((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getText():null)) );
						
				}
				break;
			case LITERAL_FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				((SexpContext)_localctx).LITERAL_FLOAT = match(LITERAL_FLOAT);

						((SexpContext)_localctx).sexpValue =  new LiteralFloat((((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getLine():0),(((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getCharPositionInLine():0),Float.parseFloat((((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getText():null)) );
						
				}
				break;
			case LITERAL_CHAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
				((SexpContext)_localctx).LITERAL_CHAR = match(LITERAL_CHAR);
				 
						((SexpContext)_localctx).sexpValue =  new LiteralChar((((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getLine():0),(((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getCharPositionInLine():0),(((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getText():null) );
					
				}
				break;
			case NEW:
			case ID:
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 9);
				{
				setState(300);
				pexp();
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

	public static class PexpContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(langParser.OPEN_PARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(langParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode NEW() { return getToken(langParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(langParser.OPEN_SQUAREBRACKET, 0); }
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(langParser.CLOSE_SQUAREBRACKET, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public PexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pexp; }
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pexp);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				lvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(OPEN_PARENTHESIS);
				setState(305);
				exp(0);
				setState(306);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(NEW);
				setState(309);
				type(0);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(310);
					match(OPEN_SQUAREBRACKET);
					setState(311);
					exp(0);
					setState(312);
					match(CLOSE_SQUAREBRACKET);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(ID);
				setState(317);
				match(OPEN_PARENTHESIS);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << OPEN_PARENTHESIS) | (1L << MINUS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(318);
					exps();
					}
				}

				setState(321);
				match(CLOSE_PARENTHESIS);
				setState(322);
				match(OPEN_SQUAREBRACKET);
				setState(323);
				exp(0);
				setState(324);
				match(CLOSE_SQUAREBRACKET);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(langParser.OPEN_SQUAREBRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(langParser.CLOSE_SQUAREBRACKET, 0); }
		public TerminalNode DOT() { return getToken(langParser.DOT, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(329);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(331);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(332);
						match(OPEN_SQUAREBRACKET);
						setState(333);
						exp(0);
						setState(334);
						match(CLOSE_SQUAREBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(336);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(337);
						match(DOT);
						setState(338);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(langParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(langParser.COMMA, i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			exp(0);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				exp(0);
				}
				}
				setState(351);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 11:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 12:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 13:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 16:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
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
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rexp_sempred(RexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0163\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5D\n\5\f\5\16\5G\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7R\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\5\7^\n\7\3\7\3\7\7\7b\n\7"+
		"\f\7\16\7e\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16"+
		"\bt\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\7\13\u0090"+
		"\n\13\f\13\16\13\u0093\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b6\n\13"+
		"\f\13\16\13\u00b9\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00c5\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cc\n\13\f\13\16\13"+
		"\u00cf\13\13\3\13\3\13\5\13\u00d3\n\13\3\13\5\13\u00d6\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00e9\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f1\n\r\f\r\16\r\u00f4"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u0104\n\16\f\16\16\16\u0107\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u011a"+
		"\n\17\f\17\16\17\u011d\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0130\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013d\n\21\3\21\3\21"+
		"\3\21\5\21\u0142\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0149\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0156\n\22\f\22"+
		"\16\22\u0159\13\22\3\23\3\23\3\23\7\23\u015e\n\23\f\23\16\23\u0161\13"+
		"\23\3\23\2\b\20\26\30\32\34\"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\2\2\u0183\2&\3\2\2\2\4/\3\2\2\2\68\3\2\2\2\b?\3\2\2\2\nH\3\2\2"+
		"\2\fN\3\2\2\2\16h\3\2\2\2\20u\3\2\2\2\22\u008b\3\2\2\2\24\u00d5\3\2\2"+
		"\2\26\u00d7\3\2\2\2\30\u00e8\3\2\2\2\32\u00f5\3\2\2\2\34\u0108\3\2\2\2"+
		"\36\u012f\3\2\2\2 \u0148\3\2\2\2\"\u014a\3\2\2\2$\u015a\3\2\2\2&*\5\4"+
		"\3\2\')\5\f\7\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3"+
		"\2\2\2-.\b\2\1\2.\3\3\2\2\2/\65\b\3\1\2\60\61\5\6\4\2\61\62\b\3\1\2\62"+
		"\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\5\3\2\2\2\67\65\3\2\2\289\7\3\2\29:\7\17\2\2:;\7\33\2\2;<\5\b\5\2<=\7"+
		"\34\2\2=>\b\4\1\2>\7\3\2\2\2?E\b\5\1\2@A\5\n\6\2AB\b\5\1\2BD\3\2\2\2C"+
		"@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GE\3\2\2\2HI\7\17\2"+
		"\2IJ\7\61\2\2JK\5\20\t\2KL\7!\2\2LM\b\6\1\2M\13\3\2\2\2NO\7\17\2\2OQ\7"+
		"\35\2\2PR\5\16\b\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2S]\7\36\2\2TU\7\60\2\2"+
		"UZ\5\20\t\2VW\7#\2\2WY\5\20\t\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2]T\3\2\2\2]^\3\2\2\2^_\3\2\2\2_c\7\33\2\2`b\5\24"+
		"\13\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7"+
		"\34\2\2g\r\3\2\2\2hi\7\17\2\2ij\7\61\2\2jk\5\20\t\2kr\b\b\1\2lm\7#\2\2"+
		"mn\7\17\2\2no\7\61\2\2oq\5\20\t\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2s\17\3\2\2\2tr\3\2\2\2uv\b\t\1\2vw\5\22\n\2wx\b\t\1\2x~\3\2\2\2yz"+
		"\f\4\2\2z{\7\37\2\2{}\7 \2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\21\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u008c\b"+
		"\n\1\2\u0083\u0084\7\b\2\2\u0084\u008c\b\n\1\2\u0085\u0086\7\7\2\2\u0086"+
		"\u008c\b\n\1\2\u0087\u0088\7\6\2\2\u0088\u008c\b\n\1\2\u0089\u008a\7\20"+
		"\2\2\u008a\u008c\b\n\1\2\u008b\u0081\3\2\2\2\u008b\u0083\3\2\2\2\u008b"+
		"\u0085\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c\23\3\2\2"+
		"\2\u008d\u0091\7\33\2\2\u008e\u0090\5\24\13\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u00d6\7\34\2\2\u0095\u0096\7\r\2\2\u0096"+
		"\u0097\7\35\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7\36\2\2\u0099\u009a"+
		"\5\24\13\2\u009a\u00d6\3\2\2\2\u009b\u009c\7\r\2\2\u009c\u009d\7\35\2"+
		"\2\u009d\u009e\5\26\f\2\u009e\u009f\7\36\2\2\u009f\u00a0\5\24\13\2\u00a0"+
		"\u00a1\7\16\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00d6\3\2\2\2\u00a3\u00a4"+
		"\7\f\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\7\36\2"+
		"\2\u00a7\u00a8\5\24\13\2\u00a8\u00d6\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa"+
		"\u00ab\5\"\22\2\u00ab\u00ac\7!\2\2\u00ac\u00d6\3\2\2\2\u00ad\u00ae\7\t"+
		"\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\7!\2\2\u00b0\u00d6\3\2\2\2\u00b1"+
		"\u00b2\7\n\2\2\u00b2\u00b7\5\26\f\2\u00b3\u00b4\7#\2\2\u00b4\u00b6\5\26"+
		"\f\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7!"+
		"\2\2\u00bb\u00d6\3\2\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7$\2\2\u00be"+
		"\u00bf\5\26\f\2\u00bf\u00c0\7!\2\2\u00c0\u00d6\3\2\2\2\u00c1\u00c2\7\17"+
		"\2\2\u00c2\u00c4\7\35\2\2\u00c3\u00c5\5$\23\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00d2\7\36\2\2\u00c7\u00c8\7"+
		"%\2\2\u00c8\u00cd\5\"\22\2\u00c9\u00ca\7#\2\2\u00ca\u00cc\5\"\22\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7&\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\7!\2\2\u00d5\u008d\3\2\2\2\u00d5\u0095\3\2\2\2\u00d5"+
		"\u009b\3\2\2\2\u00d5\u00a3\3\2\2\2\u00d5\u00a9\3\2\2\2\u00d5\u00ad\3\2"+
		"\2\2\u00d5\u00b1\3\2\2\2\u00d5\u00bc\3\2\2\2\u00d5\u00c1\3\2\2\2\u00d6"+
		"\25\3\2\2\2\u00d7\u00d8\b\f\1\2\u00d8\u00d9\5\30\r\2\u00d9\u00df\3\2\2"+
		"\2\u00da\u00db\f\4\2\2\u00db\u00dc\7/\2\2\u00dc\u00de\5\26\f\5\u00dd\u00da"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\b\r\1\2\u00e3\u00e4\5\32\16"+
		"\2\u00e4\u00e5\7%\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e9\5\32\16\2\u00e8\u00e2\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00f2\3"+
		"\2\2\2\u00ea\u00eb\f\5\2\2\u00eb\u00ec\7\'\2\2\u00ec\u00f1\5\32\16\2\u00ed"+
		"\u00ee\f\4\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f1\5\32\16\2\u00f0\u00ea\3"+
		"\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\b\16\1"+
		"\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8\b\16\1\2\u00f8\u0105\3\2\2\2\u00f9"+
		"\u00fa\f\5\2\2\u00fa\u00fb\7)\2\2\u00fb\u00fc\5\34\17\2\u00fc\u00fd\b"+
		"\16\1\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\f\4\2\2\u00ff\u0100\7*\2\2\u0100"+
		"\u0101\5\34\17\2\u0101\u0102\b\16\1\2\u0102\u0104\3\2\2\2\u0103\u00f9"+
		"\3\2\2\2\u0103\u00fe\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\33\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\b\17\1"+
		"\2\u0109\u010a\5\36\20\2\u010a\u010b\b\17\1\2\u010b\u011b\3\2\2\2\u010c"+
		"\u010d\f\6\2\2\u010d\u010e\7+\2\2\u010e\u010f\5\36\20\2\u010f\u0110\b"+
		"\17\1\2\u0110\u011a\3\2\2\2\u0111\u0112\f\5\2\2\u0112\u0113\7,\2\2\u0113"+
		"\u0114\5\36\20\2\u0114\u0115\b\17\1\2\u0115\u011a\3\2\2\2\u0116\u0117"+
		"\f\4\2\2\u0117\u0118\7-\2\2\u0118\u011a\5\36\20\2\u0119\u010c\3\2\2\2"+
		"\u0119\u0111\3\2\2\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\35\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\7.\2\2\u011f\u0130\5\36\20\2\u0120\u0121\7*\2\2\u0121\u0130\5\36"+
		"\20\2\u0122\u0123\7\24\2\2\u0123\u0130\b\20\1\2\u0124\u0125\7\25\2\2\u0125"+
		"\u0130\b\20\1\2\u0126\u0127\7\26\2\2\u0127\u0130\b\20\1\2\u0128\u0129"+
		"\7\21\2\2\u0129\u0130\b\20\1\2\u012a\u012b\7\22\2\2\u012b\u0130\b\20\1"+
		"\2\u012c\u012d\7\23\2\2\u012d\u0130\b\20\1\2\u012e\u0130\5 \21\2\u012f"+
		"\u011e\3\2\2\2\u012f\u0120\3\2\2\2\u012f\u0122\3\2\2\2\u012f\u0124\3\2"+
		"\2\2\u012f\u0126\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u012a\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u012f\u012e\3\2\2\2\u0130\37\3\2\2\2\u0131\u0149\5\"\22"+
		"\2\u0132\u0133\7\35\2\2\u0133\u0134\5\26\f\2\u0134\u0135\7\36\2\2\u0135"+
		"\u0149\3\2\2\2\u0136\u0137\7\4\2\2\u0137\u013c\5\20\t\2\u0138\u0139\7"+
		"\37\2\2\u0139\u013a\5\26\f\2\u013a\u013b\7 \2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0149\3\2\2\2\u013e\u013f\7\17"+
		"\2\2\u013f\u0141\7\35\2\2\u0140\u0142\5$\23\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\36\2\2\u0144\u0145\7"+
		"\37\2\2\u0145\u0146\5\26\f\2\u0146\u0147\7 \2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0131\3\2\2\2\u0148\u0132\3\2\2\2\u0148\u0136\3\2\2\2\u0148\u013e\3\2"+
		"\2\2\u0149!\3\2\2\2\u014a\u014b\b\22\1\2\u014b\u014c\7\17\2\2\u014c\u0157"+
		"\3\2\2\2\u014d\u014e\f\4\2\2\u014e\u014f\7\37\2\2\u014f\u0150\5\26\f\2"+
		"\u0150\u0151\7 \2\2\u0151\u0156\3\2\2\2\u0152\u0153\f\3\2\2\u0153\u0154"+
		"\7\"\2\2\u0154\u0156\7\17\2\2\u0155\u014d\3\2\2\2\u0155\u0152\3\2\2\2"+
		"\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158#\3"+
		"\2\2\2\u0159\u0157\3\2\2\2\u015a\u015f\5\26\f\2\u015b\u015c\7#\2\2\u015c"+
		"\u015e\5\26\f\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160%\3\2\2\2\u0161\u015f\3\2\2\2!*\65EQZ"+
		"]cr~\u008b\u0091\u00b7\u00c4\u00cd\u00d2\u00d5\u00df\u00e8\u00f0\u00f2"+
		"\u0103\u0105\u0119\u011b\u012f\u013c\u0141\u0148\u0155\u0157\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}