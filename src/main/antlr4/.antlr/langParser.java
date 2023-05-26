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
		RULE_prog = 0, RULE_dataList = 1, RULE_functions = 2, RULE_data = 3, RULE_declList = 4, 
		RULE_decl = 5, RULE_func = 6, RULE_params = 7, RULE_type = 8, RULE_btype = 9, 
		RULE_cmdList = 10, RULE_cmd = 11, RULE_exp = 12, RULE_rexp = 13, RULE_aexp = 14, 
		RULE_mexp = 15, RULE_sexp = 16, RULE_pexp = 17, RULE_lvalue = 18, RULE_exps = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dataList", "functions", "data", "declList", "decl", "func", 
			"params", "type", "btype", "cmdList", "cmd", "exp", "rexp", "aexp", "mexp", 
			"sexp", "pexp", "lvalue", "exps"
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
		public DataListContext dataList;
		public FuncContext func;
		public DataListContext dataList() {
			return getRuleContext(DataListContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((ProgContext)_localctx).dataList = dataList();
			setState(41);
			((ProgContext)_localctx).func = func();
			 
					((ProgContext)_localctx).ast =  new Prog(((ProgContext)_localctx).dataList.dataListInstance, ((ProgContext)_localctx).func.functionInstance);		
				
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
			 	
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA) {
				{
				{
				setState(45);
				((DataListContext)_localctx).d = data();
				 
						_localctx.dataListInstance.put(((DataListContext)_localctx).d.dataObj.getIdName() , ((DataListContext)_localctx).d.dataObj);
						
				}
				}
				setState(52);
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

	public static class FunctionsContext extends ParserRuleContext {
		public HashMap<String,Function> functionsMap;
		public FuncContext func;
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					((FunctionsContext)_localctx).functionsMap =  new HashMap<String,Function>();
				
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(54);
				((FunctionsContext)_localctx).func = func();
				 
							System.out.println("New function"  + ((FunctionsContext)_localctx).func.functionInstance);
						
				}
				}
				setState(61);
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
		enterRule(_localctx, 6, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DATA);
			setState(63);
			((DataContext)_localctx).ID = match(ID);
			setState(64);
			match(OPEN_BRACKET);
			setState(65);
			((DataContext)_localctx).d = declList();
			setState(66);
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
		enterRule(_localctx, 8, RULE_declList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclListContext)_localctx).declarationList =  new ArrayList<Declaration>();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(70);
				((DeclListContext)_localctx).decl = decl();
				_localctx.declarationList.add(((DeclListContext)_localctx).decl.declaration);
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
		enterRule(_localctx, 10, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((DeclContext)_localctx).ID = match(ID);
			setState(79);
			match(DOUBLECOLON);
			setState(80);
			((DeclContext)_localctx).t = type(0);
			setState(81);
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
		public Function functionInstance;
		public Token ID;
		public CmdListContext c;
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(langParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(langParser.CLOSE_PARENTHESIS, 0); }
		public CmdListContext cmdList() {
			return getRuleContext(CmdListContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((FuncContext)_localctx).ID = match(ID);
				setState(85);
				match(OPEN_PARENTHESIS);
				setState(86);
				match(CLOSE_PARENTHESIS);
				setState(87);
				((FuncContext)_localctx).c = cmdList();
				 
						ID id = new ID((((FuncContext)_localctx).ID!=null?((FuncContext)_localctx).ID.getLine():0), (((FuncContext)_localctx).ID!=null?((FuncContext)_localctx).ID.getCharPositionInLine():0), (((FuncContext)_localctx).ID!=null?((FuncContext)_localctx).ID.getText():null));
						((FuncContext)_localctx).functionInstance =  new Function(id, ((FuncContext)_localctx).c.commands);

						System.out.println("New function: " + _localctx.functionInstance.getName());
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				setState(91);
				match(OPEN_PARENTHESIS);
				setState(92);
				params();
				setState(93);
				match(CLOSE_PARENTHESIS);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(94);
					match(COLON);
					setState(95);
					type(0);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(96);
						match(COMMA);
						setState(97);
						type(0);
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(105);
				cmdList();
				 
						
					
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

	public static class ParamsContext extends ParserRuleContext {
		public ArrayList<Param> paramsArray;
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
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					_localctx.paramsArray = new ArrayList<Param>
				
			setState(111);
			((ParamsContext)_localctx).ID = match(ID);
			setState(112);
			match(DOUBLECOLON);
			setState(113);
			((ParamsContext)_localctx).t = type(0);
			 
				ID id = new ID((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getLine():0), (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getCharPositionInLine():0),  (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null));
				Param param = new Param(id , ((ParamsContext)_localctx).t.basicType);
				_localctx.paramsArray.add(param);


			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				((ParamsContext)_localctx).ID = match(ID);
				setState(117);
				match(DOUBLECOLON);
				setState(118);
				((ParamsContext)_localctx).t = type(0);
				 
								ID id = new ID((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getLine():0), (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getCharPositionInLine():0),  (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null));
								Param param = new Param(id , ((ParamsContext)_localctx).t.basicType);
								_localctx.paramsArray.add(param);
					
				}
				}
				setState(125);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			((TypeContext)_localctx).btype = btype();
			 
					((TypeContext)_localctx).basicType =  ((TypeContext)_localctx).btype.basicType;
				
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(131);
					match(OPEN_SQUAREBRACKET);
					setState(132);
					match(CLOSE_SQUAREBRACKET);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 18, RULE_btype);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((BtypeContext)_localctx).INT = match(INT);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getLine():0), (((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getCharPositionInLine():0), "Int");
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((BtypeContext)_localctx).CHAR = match(CHAR);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getLine():0), (((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getCharPositionInLine():0), "CHAR"); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				((BtypeContext)_localctx).BOOL = match(BOOL);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getLine():0), (((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getCharPositionInLine():0), "CHAR"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				((BtypeContext)_localctx).FLOAT = match(FLOAT);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getLine():0), (((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getCharPositionInLine():0), "Float"); 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
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

	public static class CmdListContext extends ParserRuleContext {
		public CmdList commands;
		public Token OPEN_BRACKET;
		public CmdContext c;
		public TerminalNode OPEN_BRACKET() { return getToken(langParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(langParser.CLOSE_BRACKET, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdList; }
	}

	public final CmdListContext cmdList() throws RecognitionException {
		CmdListContext _localctx = new CmdListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((CmdListContext)_localctx).OPEN_BRACKET = match(OPEN_BRACKET);
			 
					((CmdListContext)_localctx).commands =  new CmdList((((CmdListContext)_localctx).OPEN_BRACKET!=null?((CmdListContext)_localctx).OPEN_BRACKET.getLine():0),(((CmdListContext)_localctx).OPEN_BRACKET!=null?((CmdListContext)_localctx).OPEN_BRACKET.getCharPositionInLine():0));
				 
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << READ) | (1L << ITERATE) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(152);
				((CmdListContext)_localctx).c = cmd();

						_localctx.commands.addCommand(((CmdListContext)_localctx).c.command);
					
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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

	public static class CmdContext extends ParserRuleContext {
		public Cmd command;
		public Token OPEN_PARENTHESIS;
		public ExpContext exp1;
		public CmdContext rightSide;
		public CmdContext then;
		public CmdContext elseCmd;
		public Token ITERATE;
		public ExpContext e;
		public CmdContext c;
		public Token READ;
		public LvalueContext l;
		public Token PRINT;
		public Token EQ;
		public TerminalNode IF() { return getToken(langParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(langParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(langParser.CLOSE_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(langParser.ELSE, 0); }
		public TerminalNode ITERATE() { return getToken(langParser.ITERATE, 0); }
		public TerminalNode READ() { return getToken(langParser.READ, 0); }
		public TerminalNode SEMI() { return getToken(langParser.SEMI, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
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
		enterRule(_localctx, 22, RULE_cmd);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(IF);
				setState(163);
				((CmdContext)_localctx).OPEN_PARENTHESIS = match(OPEN_PARENTHESIS);
				setState(164);
				((CmdContext)_localctx).exp1 = exp(0);
				setState(165);
				match(CLOSE_PARENTHESIS);
				setState(166);
				((CmdContext)_localctx).rightSide = cmd();
				 
						((CmdContext)_localctx).command =  new If((((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getLine():0), (((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getCharPositionInLine():0), ((CmdContext)_localctx).exp1.expInstance, ((CmdContext)_localctx).rightSide.command);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(IF);
				setState(170);
				((CmdContext)_localctx).OPEN_PARENTHESIS = match(OPEN_PARENTHESIS);
				setState(171);
				((CmdContext)_localctx).exp1 = exp(0);
				setState(172);
				match(CLOSE_PARENTHESIS);
				setState(173);
				((CmdContext)_localctx).then = cmd();
				setState(174);
				match(ELSE);
				setState(175);
				((CmdContext)_localctx).elseCmd = cmd();
				 
						((CmdContext)_localctx).command =  new If((((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getLine():0), (((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getCharPositionInLine():0), ((CmdContext)_localctx).exp1.expInstance, ((CmdContext)_localctx).then.command, ((CmdContext)_localctx).elseCmd.command);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				((CmdContext)_localctx).ITERATE = match(ITERATE);
				setState(179);
				match(OPEN_PARENTHESIS);
				setState(180);
				((CmdContext)_localctx).e = exp(0);
				setState(181);
				match(CLOSE_PARENTHESIS);
				setState(182);
				((CmdContext)_localctx).c = cmd();
				 
						((CmdContext)_localctx).command =  new Iterate((((CmdContext)_localctx).ITERATE!=null?((CmdContext)_localctx).ITERATE.getLine():0), (((CmdContext)_localctx).ITERATE!=null?((CmdContext)_localctx).ITERATE.getCharPositionInLine():0),  ((CmdContext)_localctx).e.expInstance , ((CmdContext)_localctx).c.command);
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				((CmdContext)_localctx).READ = match(READ);
				setState(186);
				((CmdContext)_localctx).l = lvalue(0);
				setState(187);
				match(SEMI);

						((CmdContext)_localctx).command =  new Read((((CmdContext)_localctx).READ!=null?((CmdContext)_localctx).READ.getLine():0),(((CmdContext)_localctx).READ!=null?((CmdContext)_localctx).READ.getCharPositionInLine():0) , ((CmdContext)_localctx).l.value);
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				((CmdContext)_localctx).PRINT = match(PRINT);
				setState(191);
				((CmdContext)_localctx).e = exp(0);
				setState(192);
				match(SEMI);
				 
						((CmdContext)_localctx).command =  new Print((((CmdContext)_localctx).PRINT!=null?((CmdContext)_localctx).PRINT.getLine():0),(((CmdContext)_localctx).PRINT!=null?((CmdContext)_localctx).PRINT.getCharPositionInLine():0), ((CmdContext)_localctx).e.expInstance);
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				match(RETURN);
				setState(196);
				exp(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(197);
					match(COMMA);
					setState(198);
					exp(0);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				((CmdContext)_localctx).l = lvalue(0);
				setState(207);
				((CmdContext)_localctx).EQ = match(EQ);
				setState(208);
				((CmdContext)_localctx).e = exp(0);
				setState(209);
				match(SEMI);

						((CmdContext)_localctx).command =  new Attribution((((CmdContext)_localctx).EQ!=null?((CmdContext)_localctx).EQ.getLine():0), (((CmdContext)_localctx).EQ!=null?((CmdContext)_localctx).EQ.getCharPositionInLine():0), ((CmdContext)_localctx).l.value, ((CmdContext)_localctx).e.expInstance );
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				match(ID);
				setState(213);
				match(OPEN_PARENTHESIS);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << OPEN_PARENTHESIS) | (1L << MINUS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(214);
					exps();
					}
				}

				setState(217);
				match(CLOSE_PARENTHESIS);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELACIONAL) {
					{
					setState(218);
					match(RELACIONAL);
					setState(219);
					lvalue(0);
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(220);
						match(COMMA);
						setState(221);
						lvalue(0);
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(227);
					match(GREATER_THAN);
					}
				}

				setState(231);
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
		public Expr expInstance;
		public ExpContext e1;
		public RexpContext r;
		public RexpContext rexp;
		public Token AND;
		public ExpContext e2;
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public TerminalNode AND() { return getToken(langParser.AND, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			((ExpContext)_localctx).r = ((ExpContext)_localctx).rexp = rexp(0);
			 ((ExpContext)_localctx).expInstance =  ((ExpContext)_localctx).rexp.rexpExpr; 
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(238);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(239);
					((ExpContext)_localctx).AND = match(AND);
					setState(240);
					((ExpContext)_localctx).e2 = exp(3);

					          		((ExpContext)_localctx).expInstance =  new And((((ExpContext)_localctx).AND!=null?((ExpContext)_localctx).AND.getLine():0) , (((ExpContext)_localctx).AND!=null?((ExpContext)_localctx).AND.getCharPositionInLine():0), ((ExpContext)_localctx).e1.expInstance, ((ExpContext)_localctx).e2.expInstance);
					          	
					}
					} 
				}
				setState(247);
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

	public static class RexpContext extends ParserRuleContext {
		public Expr rexpExpr;
		public RexpContext r;
		public AexpContext a;
		public Token EQEQ;
		public Token DIFF;
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_rexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249);
			((RexpContext)_localctx).a = aexp(0);
			 ((RexpContext)_localctx).rexpExpr =  ((RexpContext)_localctx).a.binOp; 
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253);
						match(RELACIONAL);
						setState(254);
						((RexpContext)_localctx).a = aexp(0);
						 ((RexpContext)_localctx).rexpExpr =  new Equal((((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getLine():0), (((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getCharPositionInLine():0),  ((RexpContext)_localctx).r.rexpExpr, ((RexpContext)_localctx).a.binOp);  
						          		
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(257);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(258);
						((RexpContext)_localctx).EQEQ = match(EQEQ);
						setState(259);
						((RexpContext)_localctx).a = aexp(0);
						 ((RexpContext)_localctx).rexpExpr =  new Equal((((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getLine():0), (((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getCharPositionInLine():0), ((RexpContext)_localctx).r.rexpExpr, ((RexpContext)_localctx).a.binOp);  
						          		
						}
						break;
					case 3:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(262);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(263);
						((RexpContext)_localctx).DIFF = match(DIFF);
						setState(264);
						((RexpContext)_localctx).a = aexp(0);
						 ((RexpContext)_localctx).rexpExpr =  new Diff((((RexpContext)_localctx).DIFF!=null?((RexpContext)_localctx).DIFF.getLine():0), (((RexpContext)_localctx).DIFF!=null?((RexpContext)_localctx).DIFF.getCharPositionInLine():0), ((RexpContext)_localctx).r.rexpExpr, ((RexpContext)_localctx).a.binOp);  
						          		
						}
						break;
					}
					} 
				}
				setState(271);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(273);
			((AexpContext)_localctx).m = mexp(0);
			 ((AexpContext)_localctx).binOp =  ((AexpContext)_localctx).m.mexpExpr; 
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277);
						((AexpContext)_localctx).PLUS = match(PLUS);
						setState(278);
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
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						((AexpContext)_localctx).MINUS = match(MINUS);
						setState(283);
						((AexpContext)_localctx).m = mexp(0);
						 ((AexpContext)_localctx).binOp =  new Sub((((AexpContext)_localctx).MINUS!=null?((AexpContext)_localctx).MINUS.getLine():0), (((AexpContext)_localctx).MINUS!=null?((AexpContext)_localctx).MINUS.getCharPositionInLine():0), ((AexpContext)_localctx).a.binOp, ((AexpContext)_localctx).m.mexpExpr); 
						}
						break;
					}
					} 
				}
				setState(290);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(292);
			((MexpContext)_localctx).s = sexp();
			  ((MexpContext)_localctx).mexpExpr =  ((MexpContext)_localctx).s.sexpValue; 
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						_localctx.m = _prevctx;
						_localctx.m = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(295);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(296);
						((MexpContext)_localctx).TIMES = match(TIMES);
						setState(297);
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
						setState(300);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(301);
						((MexpContext)_localctx).DIV = match(DIV);
						setState(302);
						((MexpContext)_localctx).s = sexp();
						 
						          		((MexpContext)_localctx).mexpExpr =  new Div((((MexpContext)_localctx).DIV!=null?((MexpContext)_localctx).DIV.getLine():0), (((MexpContext)_localctx).DIV!=null?((MexpContext)_localctx).DIV.getCharPositionInLine():0), ((MexpContext)_localctx).m.mexpExpr , ((MexpContext)_localctx).s.sexpValue);
						          	
						}
						break;
					case 3:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(305);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(306);
						match(MOD);
						setState(307);
						sexp();
						}
						break;
					}
					} 
				}
				setState(312);
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
		enterRule(_localctx, 32, RULE_sexp);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICALNEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(LOGICALNEGATION);
				setState(314);
				sexp();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(MINUS);
				setState(316);
				sexp();
				}
				break;
			case LITERAL_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				((SexpContext)_localctx).LITERAL_TRUE = match(LITERAL_TRUE);
				((SexpContext)_localctx).sexpValue =  new LiteralTrue((((SexpContext)_localctx).LITERAL_TRUE!=null?((SexpContext)_localctx).LITERAL_TRUE.getLine():0),(((SexpContext)_localctx).LITERAL_TRUE!=null?((SexpContext)_localctx).LITERAL_TRUE.getCharPositionInLine():0));
				}
				break;
			case LITERAL_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				((SexpContext)_localctx).LITERAL_FALSE = match(LITERAL_FALSE);
				((SexpContext)_localctx).sexpValue =  new LiteralFalse((((SexpContext)_localctx).LITERAL_FALSE!=null?((SexpContext)_localctx).LITERAL_FALSE.getLine():0),(((SexpContext)_localctx).LITERAL_FALSE!=null?((SexpContext)_localctx).LITERAL_FALSE.getCharPositionInLine():0));
				}
				break;
			case LITERAL_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				((SexpContext)_localctx).LITERAL_NULL = match(LITERAL_NULL);
				((SexpContext)_localctx).sexpValue =  new LiteralNull((((SexpContext)_localctx).LITERAL_NULL!=null?((SexpContext)_localctx).LITERAL_NULL.getLine():0),(((SexpContext)_localctx).LITERAL_NULL!=null?((SexpContext)_localctx).LITERAL_NULL.getCharPositionInLine():0));
				}
				break;
			case LITERAL_INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				((SexpContext)_localctx).LITERAL_INT = match(LITERAL_INT);

						((SexpContext)_localctx).sexpValue =  new LiteralInt((((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getLine():0),(((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getCharPositionInLine():0),Integer.parseInt((((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getText():null)) );
						
				}
				break;
			case LITERAL_FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				((SexpContext)_localctx).LITERAL_FLOAT = match(LITERAL_FLOAT);

						((SexpContext)_localctx).sexpValue =  new LiteralFloat((((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getLine():0),(((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getCharPositionInLine():0),Float.parseFloat((((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getText():null)) );
						
				}
				break;
			case LITERAL_CHAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(327);
				((SexpContext)_localctx).LITERAL_CHAR = match(LITERAL_CHAR);
				 
						((SexpContext)_localctx).sexpValue =  new LiteralChar((((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getLine():0),(((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getCharPositionInLine():0),(((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getText():null) );
					
				}
				break;
			case NEW:
			case ID:
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 9);
				{
				setState(329);
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
		enterRule(_localctx, 34, RULE_pexp);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				lvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(OPEN_PARENTHESIS);
				setState(334);
				exp(0);
				setState(335);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(NEW);
				setState(338);
				type(0);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(339);
					match(OPEN_SQUAREBRACKET);
					setState(340);
					exp(0);
					setState(341);
					match(CLOSE_SQUAREBRACKET);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(ID);
				setState(346);
				match(OPEN_PARENTHESIS);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << OPEN_PARENTHESIS) | (1L << MINUS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(347);
					exps();
					}
				}

				setState(350);
				match(CLOSE_PARENTHESIS);
				setState(351);
				match(OPEN_SQUAREBRACKET);
				setState(352);
				exp(0);
				setState(353);
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
		public LValue value;
		public Token ID;
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(358);
			((LvalueContext)_localctx).ID = match(ID);
			 ((LvalueContext)_localctx).value =  new ID((((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getLine():0),(((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getCharPositionInLine():0), (((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getText():null)); 
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(361);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(362);
						match(OPEN_SQUAREBRACKET);
						setState(363);
						exp(0);
						setState(364);
						match(CLOSE_SQUAREBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(366);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(367);
						match(DOT);
						setState(368);
						((LvalueContext)_localctx).ID = match(ID);
						}
						break;
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public ArrayList<Expr> expressions;
		public ExpContext e1;
		public ExpContext e2;
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
		enterRule(_localctx, 38, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExpsContext)_localctx).expressions =  new ArrayList<Expr>(); 
			setState(375);
			((ExpsContext)_localctx).e1 = exp(0);

					_localctx.expressions.add(((ExpsContext)_localctx).e1.expInstance);
				
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377);
				match(COMMA);
				setState(378);
				((ExpsContext)_localctx).e2 = exp(0);

						_localctx.expressions.add(((ExpsContext)_localctx).e2.expInstance)
					
				}
				}
				setState(385);
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
		case 8:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 13:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 14:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 15:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 18:
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
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0185\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\be\n\b\f\b\16\bh\13\b\5\bj\n\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u009e"+
		"\n\f\f\f\16\f\u00a1\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00e1\n\r\f\r\16\r\u00e4\13\r\3\r\3\r\5\r\u00e8\n\r"+
		"\3\r\5\r\u00eb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00f6"+
		"\n\16\f\16\16\16\u00f9\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u010e\n\17"+
		"\f\17\16\17\u0111\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u0121\n\20\f\20\16\20\u0124\13\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u0137\n\21\f\21\16\21\u013a\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014d"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015a"+
		"\n\23\3\23\3\23\3\23\5\23\u015f\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0166"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0174\n\24\f\24\16\24\u0177\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0180\n\25\f\25\16\25\u0183\13\25\3\25\2\b\22\32\34\36 &\26\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u01a1\2*\3\2\2\2\4.\3"+
		"\2\2\2\6\67\3\2\2\2\b@\3\2\2\2\nG\3\2\2\2\fP\3\2\2\2\16n\3\2\2\2\20p\3"+
		"\2\2\2\22\u0080\3\2\2\2\24\u0096\3\2\2\2\26\u0098\3\2\2\2\30\u00ea\3\2"+
		"\2\2\32\u00ec\3\2\2\2\34\u00fa\3\2\2\2\36\u0112\3\2\2\2 \u0125\3\2\2\2"+
		"\"\u014c\3\2\2\2$\u0165\3\2\2\2&\u0167\3\2\2\2(\u0178\3\2\2\2*+\5\4\3"+
		"\2+,\5\16\b\2,-\b\2\1\2-\3\3\2\2\2.\64\b\3\1\2/\60\5\b\5\2\60\61\b\3\1"+
		"\2\61\63\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\5\3\2\2\2\66\64\3\2\2\2\67=\b\4\1\289\5\16\b\29:\b\4\1\2:<\3\2\2\2"+
		";8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?=\3\2\2\2@A\7\3\2"+
		"\2AB\7\17\2\2BC\7\33\2\2CD\5\n\6\2DE\7\34\2\2EF\b\5\1\2F\t\3\2\2\2GM\b"+
		"\6\1\2HI\5\f\7\2IJ\b\6\1\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2N\13\3\2\2\2OM\3\2\2\2PQ\7\17\2\2QR\7\61\2\2RS\5\22\n\2ST\7!\2\2"+
		"TU\b\7\1\2U\r\3\2\2\2VW\7\17\2\2WX\7\35\2\2XY\7\36\2\2YZ\5\26\f\2Z[\b"+
		"\b\1\2[o\3\2\2\2\\]\7\17\2\2]^\7\35\2\2^_\5\20\t\2_i\7\36\2\2`a\7\60\2"+
		"\2af\5\22\n\2bc\7#\2\2ce\5\22\n\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2i`\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\5\26\f\2lm\b"+
		"\b\1\2mo\3\2\2\2nV\3\2\2\2n\\\3\2\2\2o\17\3\2\2\2pq\b\t\1\2qr\7\17\2\2"+
		"rs\7\61\2\2st\5\22\n\2t}\b\t\1\2uv\7#\2\2vw\7\17\2\2wx\7\61\2\2xy\5\22"+
		"\n\2yz\b\t\1\2z|\3\2\2\2{u\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\n\1\2\u0081\u0082\5\24\13\2\u0082"+
		"\u0083\b\n\1\2\u0083\u0089\3\2\2\2\u0084\u0085\f\4\2\2\u0085\u0086\7\37"+
		"\2\2\u0086\u0088\7 \2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\23\3\2\2\2\u008b\u0089\3\2\2"+
		"\2\u008c\u008d\7\5\2\2\u008d\u0097\b\13\1\2\u008e\u008f\7\b\2\2\u008f"+
		"\u0097\b\13\1\2\u0090\u0091\7\7\2\2\u0091\u0097\b\13\1\2\u0092\u0093\7"+
		"\6\2\2\u0093\u0097\b\13\1\2\u0094\u0095\7\20\2\2\u0095\u0097\b\13\1\2"+
		"\u0096\u008c\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0092"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099\7\33\2\2\u0099"+
		"\u009f\b\f\1\2\u009a\u009b\5\30\r\2\u009b\u009c\b\f\1\2\u009c\u009e\3"+
		"\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\34"+
		"\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7"+
		"\5\32\16\2\u00a7\u00a8\7\36\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\b\r\1"+
		"\2\u00aa\u00eb\3\2\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\7\35\2\2\u00ad"+
		"\u00ae\5\32\16\2\u00ae\u00af\7\36\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1"+
		"\7\16\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b\r\1\2\u00b3\u00eb\3\2\2\2"+
		"\u00b4\u00b5\7\f\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b7\5\32\16\2\u00b7"+
		"\u00b8\7\36\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\b\r\1\2\u00ba\u00eb\3"+
		"\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7!\2\2\u00be"+
		"\u00bf\b\r\1\2\u00bf\u00eb\3\2\2\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\32"+
		"\16\2\u00c2\u00c3\7!\2\2\u00c3\u00c4\b\r\1\2\u00c4\u00eb\3\2\2\2\u00c5"+
		"\u00c6\7\n\2\2\u00c6\u00cb\5\32\16\2\u00c7\u00c8\7#\2\2\u00c8\u00ca\5"+
		"\32\16\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7!"+
		"\2\2\u00cf\u00eb\3\2\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\7$\2\2\u00d2"+
		"\u00d3\5\32\16\2\u00d3\u00d4\7!\2\2\u00d4\u00d5\b\r\1\2\u00d5\u00eb\3"+
		"\2\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00d9\7\35\2\2\u00d8\u00da\5(\25\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e7\7\36"+
		"\2\2\u00dc\u00dd\7%\2\2\u00dd\u00e2\5&\24\2\u00de\u00df\7#\2\2\u00df\u00e1"+
		"\5&\24\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7&"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\7!\2\2\u00ea\u00a4\3\2\2\2\u00ea\u00ab\3\2"+
		"\2\2\u00ea\u00b4\3\2\2\2\u00ea\u00bb\3\2\2\2\u00ea\u00c0\3\2\2\2\u00ea"+
		"\u00c5\3\2\2\2\u00ea\u00d0\3\2\2\2\u00ea\u00d6\3\2\2\2\u00eb\31\3\2\2"+
		"\2\u00ec\u00ed\b\16\1\2\u00ed\u00ee\5\34\17\2\u00ee\u00ef\b\16\1\2\u00ef"+
		"\u00f7\3\2\2\2\u00f0\u00f1\f\4\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\5\32"+
		"\16\5\u00f3\u00f4\b\16\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\33\3\2\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\17\1\2\u00fb\u00fc\5\36\20\2\u00fc"+
		"\u00fd\b\17\1\2\u00fd\u010f\3\2\2\2\u00fe\u00ff\f\5\2\2\u00ff\u0100\7"+
		"%\2\2\u0100\u0101\5\36\20\2\u0101\u0102\b\17\1\2\u0102\u010e\3\2\2\2\u0103"+
		"\u0104\f\4\2\2\u0104\u0105\7\'\2\2\u0105\u0106\5\36\20\2\u0106\u0107\b"+
		"\17\1\2\u0107\u010e\3\2\2\2\u0108\u0109\f\3\2\2\u0109\u010a\7(\2\2\u010a"+
		"\u010b\5\36\20\2\u010b\u010c\b\17\1\2\u010c\u010e\3\2\2\2\u010d\u00fe"+
		"\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0108\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\35\3\2\2\2\u0111\u010f\3\2\2"+
		"\2\u0112\u0113\b\20\1\2\u0113\u0114\5 \21\2\u0114\u0115\b\20\1\2\u0115"+
		"\u0122\3\2\2\2\u0116\u0117\f\5\2\2\u0117\u0118\7)\2\2\u0118\u0119\5 \21"+
		"\2\u0119\u011a\b\20\1\2\u011a\u0121\3\2\2\2\u011b\u011c\f\4\2\2\u011c"+
		"\u011d\7*\2\2\u011d\u011e\5 \21\2\u011e\u011f\b\20\1\2\u011f\u0121\3\2"+
		"\2\2\u0120\u0116\3\2\2\2\u0120\u011b\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\37\3\2\2\2\u0124\u0122\3\2\2"+
		"\2\u0125\u0126\b\21\1\2\u0126\u0127\5\"\22\2\u0127\u0128\b\21\1\2\u0128"+
		"\u0138\3\2\2\2\u0129\u012a\f\6\2\2\u012a\u012b\7+\2\2\u012b\u012c\5\""+
		"\22\2\u012c\u012d\b\21\1\2\u012d\u0137\3\2\2\2\u012e\u012f\f\5\2\2\u012f"+
		"\u0130\7,\2\2\u0130\u0131\5\"\22\2\u0131\u0132\b\21\1\2\u0132\u0137\3"+
		"\2\2\2\u0133\u0134\f\4\2\2\u0134\u0135\7-\2\2\u0135\u0137\5\"\22\2\u0136"+
		"\u0129\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139!\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013b\u013c\7.\2\2\u013c\u014d\5\"\22\2\u013d\u013e\7*\2\2\u013e"+
		"\u014d\5\"\22\2\u013f\u0140\7\24\2\2\u0140\u014d\b\22\1\2\u0141\u0142"+
		"\7\25\2\2\u0142\u014d\b\22\1\2\u0143\u0144\7\26\2\2\u0144\u014d\b\22\1"+
		"\2\u0145\u0146\7\21\2\2\u0146\u014d\b\22\1\2\u0147\u0148\7\22\2\2\u0148"+
		"\u014d\b\22\1\2\u0149\u014a\7\23\2\2\u014a\u014d\b\22\1\2\u014b\u014d"+
		"\5$\23\2\u014c\u013b\3\2\2\2\u014c\u013d\3\2\2\2\u014c\u013f\3\2\2\2\u014c"+
		"\u0141\3\2\2\2\u014c\u0143\3\2\2\2\u014c\u0145\3\2\2\2\u014c\u0147\3\2"+
		"\2\2\u014c\u0149\3\2\2\2\u014c\u014b\3\2\2\2\u014d#\3\2\2\2\u014e\u0166"+
		"\5&\24\2\u014f\u0150\7\35\2\2\u0150\u0151\5\32\16\2\u0151\u0152\7\36\2"+
		"\2\u0152\u0166\3\2\2\2\u0153\u0154\7\4\2\2\u0154\u0159\5\22\n\2\u0155"+
		"\u0156\7\37\2\2\u0156\u0157\5\32\16\2\u0157\u0158\7 \2\2\u0158\u015a\3"+
		"\2\2\2\u0159\u0155\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0166\3\2\2\2\u015b"+
		"\u015c\7\17\2\2\u015c\u015e\7\35\2\2\u015d\u015f\5(\25\2\u015e\u015d\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\36\2\2\u0161"+
		"\u0162\7\37\2\2\u0162\u0163\5\32\16\2\u0163\u0164\7 \2\2\u0164\u0166\3"+
		"\2\2\2\u0165\u014e\3\2\2\2\u0165\u014f\3\2\2\2\u0165\u0153\3\2\2\2\u0165"+
		"\u015b\3\2\2\2\u0166%\3\2\2\2\u0167\u0168\b\24\1\2\u0168\u0169\7\17\2"+
		"\2\u0169\u016a\b\24\1\2\u016a\u0175\3\2\2\2\u016b\u016c\f\4\2\2\u016c"+
		"\u016d\7\37\2\2\u016d\u016e\5\32\16\2\u016e\u016f\7 \2\2\u016f\u0174\3"+
		"\2\2\2\u0170\u0171\f\3\2\2\u0171\u0172\7\"\2\2\u0172\u0174\7\17\2\2\u0173"+
		"\u016b\3\2\2\2\u0173\u0170\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\'\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179"+
		"\b\25\1\2\u0179\u017a\5\32\16\2\u017a\u0181\b\25\1\2\u017b\u017c\7#\2"+
		"\2\u017c\u017d\5\32\16\2\u017d\u017e\b\25\1\2\u017e\u0180\3\2\2\2\u017f"+
		"\u017b\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182)\3\2\2\2\u0183\u0181\3\2\2\2\37\64=Mfin}\u0089\u0096\u009f"+
		"\u00cb\u00d9\u00e2\u00e7\u00ea\u00f7\u010d\u010f\u0120\u0122\u0136\u0138"+
		"\u014c\u0159\u015e\u0165\u0173\u0175\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}