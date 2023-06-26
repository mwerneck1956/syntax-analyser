// Generated from lang.g4 by ANTLR 4.8
 
	/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
	*/

	package com.compiler.grammar;
	import com.compiler.ast.*;
	import java.util.HashMap;
	import java.util.ArrayList;
 
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATA=1, NEW=2, INT=3, FLOAT=4, BOOL=5, CHAR=6, PRINT=7, RETURN=8, READ=9, 
		ITERATE=10, IF=11, ELSE=12, LITERAL_TRUE=13, LITERAL_FALSE=14, LITERAL_NULL=15, 
		LITERAL_INT=16, LITERAL_FLOAT=17, LITERAL_CHAR=18, ID=19, TYPE=20, NEWLINE=21, 
		WHITESPACE=22, LINE_COMMENT=23, COMMENT=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, 
		OPEN_PARENTHESIS=27, CLOSE_PARENTHESIS=28, OPEN_SQUAREBRACKET=29, CLOSE_SQUAREBRACKET=30, 
		SEMI=31, DOT=32, COMMA=33, EQ=34, RELACIONAL=35, GREATER_THAN=36, EQEQ=37, 
		DIFF=38, PLUS=39, MINUS=40, TIMES=41, DIV=42, MOD=43, LOGICALNEGATION=44, 
		AND=45, COLON=46, DOUBLECOLON=47;
	public static final int
		RULE_prog = 0, RULE_dataList = 1, RULE_data = 2, RULE_declList = 3, RULE_decl = 4, 
		RULE_functions = 5, RULE_func = 6, RULE_params = 7, RULE_type = 8, RULE_btype = 9, 
		RULE_cmdList = 10, RULE_cmd = 11, RULE_exp = 12, RULE_rexp = 13, RULE_aexp = 14, 
		RULE_mexp = 15, RULE_sexp = 16, RULE_pexp = 17, RULE_lvalue = 18, RULE_exps = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dataList", "data", "declList", "decl", "functions", "func", 
			"params", "type", "btype", "cmdList", "cmd", "exp", "rexp", "aexp", "mexp", 
			"sexp", "pexp", "lvalue", "exps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'data'", "'new'", "'Int'", "'Float'", "'Bool'", "'Char'", "'print'", 
			"'return'", "'read'", "'iterate'", "'if'", "'else'", "'true'", "'false'", 
			"'null'", null, null, null, null, null, null, null, null, null, "'{'", 
			"'}'", "'('", "')'", "'['", "']'", "';'", "'.'", "','", "'='", "'<'", 
			"'>'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'&&'", 
			"':'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATA", "NEW", "INT", "FLOAT", "BOOL", "CHAR", "PRINT", "RETURN", 
			"READ", "ITERATE", "IF", "ELSE", "LITERAL_TRUE", "LITERAL_FALSE", "LITERAL_NULL", 
			"LITERAL_INT", "LITERAL_FLOAT", "LITERAL_CHAR", "ID", "TYPE", "NEWLINE", 
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
		public FunctionsContext functions;
		public DataListContext dataList() {
			return getRuleContext(DataListContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
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
			((ProgContext)_localctx).functions = functions();
			 
					((ProgContext)_localctx).ast =  new Prog(((ProgContext)_localctx).dataList.dataListInstance, ((ProgContext)_localctx).functions.functionsList);		
				
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
		public ArrayList<Data> dataListInstance;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitDataList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataListContext dataList() throws RecognitionException {
		DataListContext _localctx = new DataListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					((DataListContext)_localctx).dataListInstance =  new ArrayList<Data>();
			 	
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA) {
				{
				{
				setState(45);
				((DataListContext)_localctx).d = data();
				 
						_localctx.dataListInstance.add(((DataListContext)_localctx).d.dataObj);
						
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

	public static class DataContext extends ParserRuleContext {
		public Data dataObj;
		public Token TYPE;
		public DeclListContext d;
		public TerminalNode DATA() { return getToken(langParser.DATA, 0); }
		public TerminalNode TYPE() { return getToken(langParser.TYPE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(langParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(langParser.CLOSE_BRACKET, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(DATA);
			setState(54);
			((DataContext)_localctx).TYPE = match(TYPE);
			setState(55);
			match(OPEN_BRACKET);
			setState(56);
			((DataContext)_localctx).d = declList();
			setState(57);
			match(CLOSE_BRACKET);

				 	ID id = new ID((((DataContext)_localctx).TYPE!=null?((DataContext)_localctx).TYPE.getLine():0), (((DataContext)_localctx).TYPE!=null?((DataContext)_localctx).TYPE.getCharPositionInLine():0),  (((DataContext)_localctx).TYPE!=null?((DataContext)_localctx).TYPE.getText():null));

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclListContext)_localctx).declarationList =  new ArrayList<Declaration>();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(61);
				((DeclListContext)_localctx).decl = decl();
				_localctx.declarationList.add(((DeclListContext)_localctx).decl.declaration);
				}
				}
				setState(68);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((DeclContext)_localctx).ID = match(ID);
			setState(70);
			match(DOUBLECOLON);
			setState(71);
			((DeclContext)_localctx).t = type(0);
			setState(72);
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

	public static class FunctionsContext extends ParserRuleContext {
		public ArrayList<Function> functionsList;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionsContext)_localctx).functionsList =  new ArrayList<Function>(); 
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(76);
				((FunctionsContext)_localctx).func = func();
				 
							_localctx.functionsList.add(((FunctionsContext)_localctx).func.f);
						
				}
				}
				setState(83);
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

	public static class FuncContext extends ParserRuleContext {
		public Function f;
		public Token ID;
		public ParamsContext params;
		public TypeContext type;
		public CmdListContext cmdList;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((FuncContext)_localctx).ID = match(ID);

					ID id = new ID((((FuncContext)_localctx).ID!=null?((FuncContext)_localctx).ID.getLine():0), (((FuncContext)_localctx).ID!=null?((FuncContext)_localctx).ID.getCharPositionInLine():0), (((FuncContext)_localctx).ID!=null?((FuncContext)_localctx).ID.getText():null));
					Function func = new Function(id);
				 
			setState(86);
			match(OPEN_PARENTHESIS);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(87);
				((FuncContext)_localctx).params = params();
				 
						func.setParamlist(((FuncContext)_localctx).params.paramsArray);
					 
				}
			}

			setState(92);
			match(CLOSE_PARENTHESIS);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(93);
				match(COLON);
				setState(94);
				((FuncContext)_localctx).type = type(0);
				 
						func.addReturn(((FuncContext)_localctx).type.basicType);
					
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					((FuncContext)_localctx).type = type(0);
					 
							func.addReturn(((FuncContext)_localctx).type.basicType);
						
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(107);
			((FuncContext)_localctx).cmdList = cmdList();
			 
					func.setBody(((FuncContext)_localctx).cmdList.commands);

					((FuncContext)_localctx).f =  func;
				
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					((ParamsContext)_localctx).paramsArray =  new ArrayList<Param>();
				
			setState(111);
			((ParamsContext)_localctx).ID = match(ID);
			setState(112);
			match(DOUBLECOLON);
			setState(113);
			((ParamsContext)_localctx).t = type(0);
			 
				ID newId = new ID((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getLine():0), (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getCharPositionInLine():0),  (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null));
				Param newParam = new Param(newId , ((ParamsContext)_localctx).t.basicType);
				_localctx.paramsArray.add(newParam);


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
		public Type basicType;
		public TypeContext t;
		public BtypeContext btype;
		public Token OPEN_SQUAREBRACKET;
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(langParser.OPEN_SQUAREBRACKET, 0); }
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(langParser.CLOSE_SQUAREBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
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
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.t = _prevctx;
					_localctx.t = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(131);
					((TypeContext)_localctx).OPEN_SQUAREBRACKET = match(OPEN_SQUAREBRACKET);
					setState(132);
					match(CLOSE_SQUAREBRACKET);
					 
					          		((TypeContext)_localctx).basicType =  new TypeArray((((TypeContext)_localctx).OPEN_SQUAREBRACKET!=null?((TypeContext)_localctx).OPEN_SQUAREBRACKET.getLine():0),(((TypeContext)_localctx).OPEN_SQUAREBRACKET!=null?((TypeContext)_localctx).OPEN_SQUAREBRACKET.getCharPositionInLine():0), ((TypeContext)_localctx).t.basicType);
					          	
					}
					} 
				}
				setState(138);
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
		public Type basicType;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_btype);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((BtypeContext)_localctx).INT = match(INT);
				((BtypeContext)_localctx).basicType =  new TypeInt((((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getLine():0), (((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getCharPositionInLine():0)); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((BtypeContext)_localctx).CHAR = match(CHAR);
				((BtypeContext)_localctx).basicType =  new TypeChar((((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getLine():0), (((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getCharPositionInLine():0)); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((BtypeContext)_localctx).BOOL = match(BOOL);
				((BtypeContext)_localctx).basicType =  new TypeBool((((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getLine():0), (((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getCharPositionInLine():0)); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				((BtypeContext)_localctx).FLOAT = match(FLOAT);
				((BtypeContext)_localctx).basicType =  new TypeFloat((((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getLine():0), (((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getCharPositionInLine():0)); 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				((BtypeContext)_localctx).TYPE = match(TYPE);
				((BtypeContext)_localctx).basicType =  new TypeCustom((((BtypeContext)_localctx).TYPE!=null?((BtypeContext)_localctx).TYPE.getLine():0), (((BtypeContext)_localctx).TYPE!=null?((BtypeContext)_localctx).TYPE.getCharPositionInLine():0), (((BtypeContext)_localctx).TYPE!=null?((BtypeContext)_localctx).TYPE.getText():null)); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitCmdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdListContext cmdList() throws RecognitionException {
		CmdListContext _localctx = new CmdListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					((CmdListContext)_localctx).commands =  new CmdList((((CmdListContext)_localctx).OPEN_BRACKET!=null?((CmdListContext)_localctx).OPEN_BRACKET.getLine():0),(((CmdListContext)_localctx).OPEN_BRACKET!=null?((CmdListContext)_localctx).OPEN_BRACKET.getCharPositionInLine():0));
				
			setState(152);
			((CmdListContext)_localctx).OPEN_BRACKET = match(OPEN_BRACKET);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << READ) | (1L << ITERATE) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(153);
				((CmdListContext)_localctx).c = cmd();

						_localctx.commands.addCommand(((CmdListContext)_localctx).c.command);
					
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		public CmdListContext rightSide;
		public CmdListContext then;
		public CmdListContext elseCmd;
		public CmdContext cmd;
		public CmdContext thenCmd;
		public CmdContext elseSimpleCmd;
		public Token ITERATE;
		public ExpContext e;
		public CmdContext c;
		public CmdListContext cmdList;
		public Token READ;
		public LvalueContext l;
		public Token PRINT;
		public Token RETURN;
		public ExpContext exp;
		public Token EQ;
		public Token ID;
		public ExpsContext exps;
		public LvalueContext lvalue;
		public TerminalNode IF() { return getToken(langParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(langParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(langParser.CLOSE_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<CmdListContext> cmdList() {
			return getRuleContexts(CmdListContext.class);
		}
		public CmdListContext cmdList(int i) {
			return getRuleContext(CmdListContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(langParser.ELSE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmd);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(IF);
				setState(164);
				((CmdContext)_localctx).OPEN_PARENTHESIS = match(OPEN_PARENTHESIS);
				setState(165);
				((CmdContext)_localctx).exp1 = exp(0);
				setState(166);
				match(CLOSE_PARENTHESIS);
				setState(167);
				((CmdContext)_localctx).rightSide = cmdList();
				 
						((CmdContext)_localctx).command =  new If((((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getLine():0), (((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getCharPositionInLine():0), ((CmdContext)_localctx).exp1.expInstance, ((CmdContext)_localctx).rightSide.commands);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(IF);
				setState(171);
				((CmdContext)_localctx).OPEN_PARENTHESIS = match(OPEN_PARENTHESIS);
				setState(172);
				((CmdContext)_localctx).exp1 = exp(0);
				setState(173);
				match(CLOSE_PARENTHESIS);
				setState(174);
				((CmdContext)_localctx).then = cmdList();
				setState(175);
				match(ELSE);
				setState(176);
				((CmdContext)_localctx).elseCmd = cmdList();
				 
						((CmdContext)_localctx).command =  new If((((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getLine():0), (((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getCharPositionInLine():0), ((CmdContext)_localctx).exp1.expInstance, ((CmdContext)_localctx).then.commands, ((CmdContext)_localctx).elseCmd.commands);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(IF);
				setState(180);
				((CmdContext)_localctx).OPEN_PARENTHESIS = match(OPEN_PARENTHESIS);
				setState(181);
				((CmdContext)_localctx).exp1 = exp(0);
				setState(182);
				match(CLOSE_PARENTHESIS);
				setState(183);
				((CmdContext)_localctx).cmd = cmd();
				 
						((CmdContext)_localctx).command =  new If((((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getLine():0), (((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getCharPositionInLine():0), ((CmdContext)_localctx).exp1.expInstance, ((CmdContext)_localctx).cmd.command);
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(IF);
				setState(187);
				((CmdContext)_localctx).OPEN_PARENTHESIS = match(OPEN_PARENTHESIS);
				setState(188);
				((CmdContext)_localctx).exp1 = exp(0);
				setState(189);
				match(CLOSE_PARENTHESIS);
				setState(190);
				((CmdContext)_localctx).thenCmd = cmd();
				setState(191);
				match(ELSE);
				setState(192);
				((CmdContext)_localctx).elseSimpleCmd = cmd();
				 
						((CmdContext)_localctx).command =  new If((((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getLine():0), (((CmdContext)_localctx).OPEN_PARENTHESIS!=null?((CmdContext)_localctx).OPEN_PARENTHESIS.getCharPositionInLine():0), ((CmdContext)_localctx).exp1.expInstance, ((CmdContext)_localctx).thenCmd.command, ((CmdContext)_localctx).elseSimpleCmd.command);
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				((CmdContext)_localctx).ITERATE = match(ITERATE);
				setState(196);
				match(OPEN_PARENTHESIS);
				setState(197);
				((CmdContext)_localctx).e = exp(0);
				setState(198);
				match(CLOSE_PARENTHESIS);
				setState(199);
				((CmdContext)_localctx).c = cmd();
				 
						((CmdContext)_localctx).command =  new Iterate((((CmdContext)_localctx).ITERATE!=null?((CmdContext)_localctx).ITERATE.getLine():0), (((CmdContext)_localctx).ITERATE!=null?((CmdContext)_localctx).ITERATE.getCharPositionInLine():0),  ((CmdContext)_localctx).e.expInstance , ((CmdContext)_localctx).c.command);
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				((CmdContext)_localctx).ITERATE = match(ITERATE);
				setState(203);
				match(OPEN_PARENTHESIS);
				setState(204);
				((CmdContext)_localctx).e = exp(0);
				setState(205);
				match(CLOSE_PARENTHESIS);
				setState(206);
				((CmdContext)_localctx).cmdList = cmdList();
				 
						((CmdContext)_localctx).command =  new Iterate((((CmdContext)_localctx).ITERATE!=null?((CmdContext)_localctx).ITERATE.getLine():0), (((CmdContext)_localctx).ITERATE!=null?((CmdContext)_localctx).ITERATE.getCharPositionInLine():0),  ((CmdContext)_localctx).e.expInstance , ((CmdContext)_localctx).cmdList.commands);
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				((CmdContext)_localctx).READ = match(READ);
				setState(210);
				((CmdContext)_localctx).l = lvalue(0);
				setState(211);
				match(SEMI);

						((CmdContext)_localctx).command =  new Read((((CmdContext)_localctx).READ!=null?((CmdContext)_localctx).READ.getLine():0),(((CmdContext)_localctx).READ!=null?((CmdContext)_localctx).READ.getCharPositionInLine():0) , ((CmdContext)_localctx).l.node);
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				((CmdContext)_localctx).PRINT = match(PRINT);
				setState(215);
				((CmdContext)_localctx).e = exp(0);
				setState(216);
				match(SEMI);
				 
						((CmdContext)_localctx).command =  new Print((((CmdContext)_localctx).PRINT!=null?((CmdContext)_localctx).PRINT.getLine():0),(((CmdContext)_localctx).PRINT!=null?((CmdContext)_localctx).PRINT.getCharPositionInLine():0), ((CmdContext)_localctx).e.expInstance);
					
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				((CmdContext)_localctx).RETURN = match(RETURN);
				 
					 	Return returnCmd = new Return((((CmdContext)_localctx).RETURN!=null?((CmdContext)_localctx).RETURN.getLine():0),(((CmdContext)_localctx).RETURN!=null?((CmdContext)_localctx).RETURN.getCharPositionInLine():0));
					
				setState(221);
				((CmdContext)_localctx).exp = exp(0);
				 
						returnCmd.addExpr(((CmdContext)_localctx).exp.expInstance);
					
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(223);
					match(COMMA);
					setState(224);
					((CmdContext)_localctx).exp = exp(0);
					 
							returnCmd.addExpr(((CmdContext)_localctx).exp.expInstance);
						
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(SEMI);
				 
						((CmdContext)_localctx).command =  returnCmd;
					
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(235);
				((CmdContext)_localctx).l = lvalue(0);
				setState(236);
				((CmdContext)_localctx).EQ = match(EQ);
				setState(237);
				((CmdContext)_localctx).e = exp(0);
				setState(238);
				match(SEMI);

						((CmdContext)_localctx).command =  new Attribution((((CmdContext)_localctx).EQ!=null?((CmdContext)_localctx).EQ.getLine():0), (((CmdContext)_localctx).EQ!=null?((CmdContext)_localctx).EQ.getCharPositionInLine():0), ((CmdContext)_localctx).l.node, ((CmdContext)_localctx).e.expInstance );
					
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(241);
				((CmdContext)_localctx).ID = match(ID);
				 
						FunctionCall functionCall = new FunctionCall((((CmdContext)_localctx).ID!=null?((CmdContext)_localctx).ID.getLine():0), (((CmdContext)_localctx).ID!=null?((CmdContext)_localctx).ID.getCharPositionInLine():0), (((CmdContext)_localctx).ID!=null?((CmdContext)_localctx).ID.getText():null));
					
				setState(243);
				match(OPEN_PARENTHESIS);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << ID) | (1L << OPEN_PARENTHESIS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(244);
					((CmdContext)_localctx).exps = exps();
					  functionCall.addParams(((CmdContext)_localctx).exps.expressions); 
					}
				}

				setState(249);
				match(CLOSE_PARENTHESIS);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELACIONAL) {
					{
					setState(250);
					match(RELACIONAL);
					setState(251);
					((CmdContext)_localctx).lvalue = lvalue(0);
					 functionCall.addReturn(((CmdContext)_localctx).lvalue.node);  
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(253);
						match(COMMA);
						setState(254);
						((CmdContext)_localctx).lvalue = lvalue(0);
						 
									functionCall.addReturn(((CmdContext)_localctx).lvalue.node);
								
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(262);
					match(GREATER_THAN);
					}
				}

				setState(266);
				match(SEMI);
				  ((CmdContext)_localctx).command =  functionCall; 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
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
			setState(271);
			((ExpContext)_localctx).r = ((ExpContext)_localctx).rexp = rexp(0);
			 ((ExpContext)_localctx).expInstance =  ((ExpContext)_localctx).rexp.rexpExpr; 
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
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
					setState(274);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(275);
					((ExpContext)_localctx).AND = match(AND);
					setState(276);
					((ExpContext)_localctx).e2 = exp(3);

					          		((ExpContext)_localctx).expInstance =  new And((((ExpContext)_localctx).AND!=null?((ExpContext)_localctx).AND.getLine():0) , (((ExpContext)_localctx).AND!=null?((ExpContext)_localctx).AND.getCharPositionInLine():0), ((ExpContext)_localctx).e1.expInstance, ((ExpContext)_localctx).e2.expInstance);
					          	
					}
					} 
				}
				setState(283);
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
		public TerminalNode GREATER_THAN() { return getToken(langParser.GREATER_THAN, 0); }
		public TerminalNode EQEQ() { return getToken(langParser.EQEQ, 0); }
		public TerminalNode DIFF() { return getToken(langParser.DIFF, 0); }
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitRexp(this);
			else return visitor.visitChildren(this);
		}
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
			setState(285);
			((RexpContext)_localctx).a = aexp(0);
			 ((RexpContext)_localctx).rexpExpr =  ((RexpContext)_localctx).a.binOp; 
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(288);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(289);
						match(RELACIONAL);
						setState(290);
						((RexpContext)_localctx).a = aexp(0);
						 ((RexpContext)_localctx).rexpExpr =  new LessThan((((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getLine():0), (((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getCharPositionInLine():0),  ((RexpContext)_localctx).r.rexpExpr, ((RexpContext)_localctx).a.binOp);
						          		
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(293);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(294);
						match(GREATER_THAN);
						setState(295);
						((RexpContext)_localctx).a = aexp(0);
						 ((RexpContext)_localctx).rexpExpr =  new GreatherThan((((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getLine():0), (((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getCharPositionInLine():0),  ((RexpContext)_localctx).r.rexpExpr, ((RexpContext)_localctx).a.binOp);  
						          		
						}
						break;
					case 3:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(298);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(299);
						((RexpContext)_localctx).EQEQ = match(EQEQ);
						setState(300);
						((RexpContext)_localctx).a = aexp(0);
						 ((RexpContext)_localctx).rexpExpr =  new Equal((((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getLine():0), (((RexpContext)_localctx).EQEQ!=null?((RexpContext)_localctx).EQEQ.getCharPositionInLine():0), ((RexpContext)_localctx).r.rexpExpr, ((RexpContext)_localctx).a.binOp);  
						          		
						}
						break;
					case 4:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						_localctx.r = _prevctx;
						_localctx.r = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(303);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(304);
						((RexpContext)_localctx).DIFF = match(DIFF);
						setState(305);
						((RexpContext)_localctx).a = aexp(0);
						 ((RexpContext)_localctx).rexpExpr =  new Diff((((RexpContext)_localctx).DIFF!=null?((RexpContext)_localctx).DIFF.getLine():0), (((RexpContext)_localctx).DIFF!=null?((RexpContext)_localctx).DIFF.getCharPositionInLine():0), ((RexpContext)_localctx).r.rexpExpr, ((RexpContext)_localctx).a.binOp);  
						          		
						}
						break;
					}
					} 
				}
				setState(312);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitAexp(this);
			else return visitor.visitChildren(this);
		}
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
			setState(314);
			((AexpContext)_localctx).m = mexp(0);
			 ((AexpContext)_localctx).binOp =  ((AexpContext)_localctx).m.mexpExpr; 
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						((AexpContext)_localctx).PLUS = match(PLUS);
						setState(319);
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
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						((AexpContext)_localctx).MINUS = match(MINUS);
						setState(324);
						((AexpContext)_localctx).m = mexp(0);
						 ((AexpContext)_localctx).binOp =  new Sub((((AexpContext)_localctx).MINUS!=null?((AexpContext)_localctx).MINUS.getLine():0), (((AexpContext)_localctx).MINUS!=null?((AexpContext)_localctx).MINUS.getCharPositionInLine():0), ((AexpContext)_localctx).a.binOp, ((AexpContext)_localctx).m.mexpExpr); 
						}
						break;
					}
					} 
				}
				setState(331);
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
		public Token MOD;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitMexp(this);
			else return visitor.visitChildren(this);
		}
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
			setState(333);
			((MexpContext)_localctx).s = sexp();
			  ((MexpContext)_localctx).mexpExpr =  ((MexpContext)_localctx).s.sexpValue; 
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						_localctx.m = _prevctx;
						_localctx.m = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(336);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(337);
						((MexpContext)_localctx).TIMES = match(TIMES);
						setState(338);
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
						setState(341);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(342);
						((MexpContext)_localctx).DIV = match(DIV);
						setState(343);
						((MexpContext)_localctx).s = sexp();
						 
						          		((MexpContext)_localctx).mexpExpr =  new Div((((MexpContext)_localctx).DIV!=null?((MexpContext)_localctx).DIV.getLine():0), (((MexpContext)_localctx).DIV!=null?((MexpContext)_localctx).DIV.getCharPositionInLine():0), ((MexpContext)_localctx).m.mexpExpr , ((MexpContext)_localctx).s.sexpValue);
						          	
						}
						break;
					case 3:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						_localctx.m = _prevctx;
						_localctx.m = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(346);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(347);
						((MexpContext)_localctx).MOD = match(MOD);
						setState(348);
						((MexpContext)_localctx).s = sexp();
						 ((MexpContext)_localctx).mexpExpr =  new Mod((((MexpContext)_localctx).MOD!=null?((MexpContext)_localctx).MOD.getLine():0), (((MexpContext)_localctx).MOD!=null?((MexpContext)_localctx).MOD.getCharPositionInLine():0),  ((MexpContext)_localctx).m.mexpExpr , ((MexpContext)_localctx).s.sexpValue); 
						          		
						}
						break;
					}
					} 
				}
				setState(355);
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
		public Token LOGICALNEGATION;
		public SexpContext sexp;
		public Token LITERAL_TRUE;
		public Token LITERAL_FALSE;
		public Token LITERAL_NULL;
		public Token LITERAL_INT;
		public Token LITERAL_FLOAT;
		public Token LITERAL_CHAR;
		public PexpContext pexp;
		public TerminalNode LOGICALNEGATION() { return getToken(langParser.LOGICALNEGATION, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitSexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sexp);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICALNEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				((SexpContext)_localctx).LOGICALNEGATION = match(LOGICALNEGATION);
				setState(357);
				((SexpContext)_localctx).sexp = sexp();
				 
						((SexpContext)_localctx).sexpValue =  new Not((((SexpContext)_localctx).LOGICALNEGATION!=null?((SexpContext)_localctx).LOGICALNEGATION.getLine():0), (((SexpContext)_localctx).LOGICALNEGATION!=null?((SexpContext)_localctx).LOGICALNEGATION.getCharPositionInLine():0), ((SexpContext)_localctx).sexp.sexpValue);
					
				}
				break;
			case LITERAL_TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				((SexpContext)_localctx).LITERAL_TRUE = match(LITERAL_TRUE);
				 
						((SexpContext)_localctx).sexpValue =  new LiteralTrue((((SexpContext)_localctx).LITERAL_TRUE!=null?((SexpContext)_localctx).LITERAL_TRUE.getLine():0),(((SexpContext)_localctx).LITERAL_TRUE!=null?((SexpContext)_localctx).LITERAL_TRUE.getCharPositionInLine():0));
						
					
				}
				break;
			case LITERAL_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				((SexpContext)_localctx).LITERAL_FALSE = match(LITERAL_FALSE);
				((SexpContext)_localctx).sexpValue =  new LiteralFalse((((SexpContext)_localctx).LITERAL_FALSE!=null?((SexpContext)_localctx).LITERAL_FALSE.getLine():0),(((SexpContext)_localctx).LITERAL_FALSE!=null?((SexpContext)_localctx).LITERAL_FALSE.getCharPositionInLine():0));
				}
				break;
			case LITERAL_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				((SexpContext)_localctx).LITERAL_NULL = match(LITERAL_NULL);

						((SexpContext)_localctx).sexpValue =  new LiteralNull((((SexpContext)_localctx).LITERAL_NULL!=null?((SexpContext)_localctx).LITERAL_NULL.getLine():0),(((SexpContext)_localctx).LITERAL_NULL!=null?((SexpContext)_localctx).LITERAL_NULL.getCharPositionInLine():0));
					
				}
				break;
			case LITERAL_INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				((SexpContext)_localctx).LITERAL_INT = match(LITERAL_INT);

						((SexpContext)_localctx).sexpValue =  new LiteralInt((((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getLine():0),(((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getCharPositionInLine():0),Integer.parseInt((((SexpContext)_localctx).LITERAL_INT!=null?((SexpContext)_localctx).LITERAL_INT.getText():null)) );
						
				}
				break;
			case LITERAL_FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				((SexpContext)_localctx).LITERAL_FLOAT = match(LITERAL_FLOAT);

						((SexpContext)_localctx).sexpValue =  new LiteralFloat((((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getLine():0),(((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getCharPositionInLine():0),Float.parseFloat((((SexpContext)_localctx).LITERAL_FLOAT!=null?((SexpContext)_localctx).LITERAL_FLOAT.getText():null)) );
						
				}
				break;
			case LITERAL_CHAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				((SexpContext)_localctx).LITERAL_CHAR = match(LITERAL_CHAR);
				 
						((SexpContext)_localctx).sexpValue =  new LiteralChar((((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getLine():0),(((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getCharPositionInLine():0),(((SexpContext)_localctx).LITERAL_CHAR!=null?((SexpContext)_localctx).LITERAL_CHAR.getText():null) );
					
				}
				break;
			case NEW:
			case ID:
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(372);
				((SexpContext)_localctx).pexp = pexp();
				 ((SexpContext)_localctx).sexpValue =  ((SexpContext)_localctx).pexp.value; 
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
		public LValue value;
		public LvalueContext l;
		public Token OPEN_PARENTHESIS;
		public ExpContext exp;
		public Token NEW;
		public TypeContext type;
		public Token ID;
		public ExpsContext exps;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitPexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pexp);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				((PexpContext)_localctx).l = lvalue(0);
				 ((PexpContext)_localctx).value =  ((PexpContext)_localctx).l.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				((PexpContext)_localctx).OPEN_PARENTHESIS = match(OPEN_PARENTHESIS);
				setState(381);
				((PexpContext)_localctx).exp = exp(0);
				setState(382);
				match(CLOSE_PARENTHESIS);
				 ((PexpContext)_localctx).value =  new ParenthesisExpression((((PexpContext)_localctx).OPEN_PARENTHESIS!=null?((PexpContext)_localctx).OPEN_PARENTHESIS.getLine():0), (((PexpContext)_localctx).OPEN_PARENTHESIS!=null?((PexpContext)_localctx).OPEN_PARENTHESIS.getCharPositionInLine():0), ((PexpContext)_localctx).exp.expInstance); 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				((PexpContext)_localctx).NEW = match(NEW);
				setState(386);
				((PexpContext)_localctx).type = type(0);
				 
						NewData newData = new NewData((((PexpContext)_localctx).NEW!=null?((PexpContext)_localctx).NEW.getLine():0), (((PexpContext)_localctx).NEW!=null?((PexpContext)_localctx).NEW.getCharPositionInLine():0), ((PexpContext)_localctx).type.basicType);
					
				 
						((PexpContext)_localctx).value =   newData;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				((PexpContext)_localctx).NEW = match(NEW);
				setState(391);
				((PexpContext)_localctx).type = type(0);
				setState(392);
				match(OPEN_SQUAREBRACKET);
				setState(393);
				((PexpContext)_localctx).exp = exp(0);
				setState(394);
				match(CLOSE_SQUAREBRACKET);
				 
						((PexpContext)_localctx).value =  new NewArray((((PexpContext)_localctx).NEW!=null?((PexpContext)_localctx).NEW.getLine():0), (((PexpContext)_localctx).NEW!=null?((PexpContext)_localctx).NEW.getCharPositionInLine():0), ((PexpContext)_localctx).type.basicType, ((PexpContext)_localctx).exp.expInstance);
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				((PexpContext)_localctx).ID = match(ID);
				 
						FunctionCallArray functionCall = new FunctionCallArray((((PexpContext)_localctx).ID!=null?((PexpContext)_localctx).ID.getLine():0), (((PexpContext)_localctx).ID!=null?((PexpContext)_localctx).ID.getCharPositionInLine():0), (((PexpContext)_localctx).ID!=null?((PexpContext)_localctx).ID.getText():null));
					
				setState(399);
				match(OPEN_PARENTHESIS);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << ID) | (1L << OPEN_PARENTHESIS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(400);
					((PexpContext)_localctx).exps = exps();

							functionCall.addParams(((PexpContext)_localctx).exps.expressions);
						 
					}
				}

				setState(405);
				match(CLOSE_PARENTHESIS);
				setState(406);
				match(OPEN_SQUAREBRACKET);
				setState(407);
				((PexpContext)_localctx).exp = exp(0);
				 
						functionCall.setReturnExpr(((PexpContext)_localctx).exp.expInstance);
					
				setState(409);
				match(CLOSE_SQUAREBRACKET);
				 
						((PexpContext)_localctx).value =  functionCall;
					
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
		public LValue node;
		public LvalueContext l;
		public Token ID;
		public Token OPEN_SQUAREBRACKET;
		public ExpContext exp;
		public Token DOT;
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(langParser.OPEN_SQUAREBRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(langParser.CLOSE_SQUAREBRACKET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(langParser.DOT, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
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
			setState(415);
			((LvalueContext)_localctx).ID = match(ID);
			 
					((LvalueContext)_localctx).node =  new ID((((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getLine():0),(((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getCharPositionInLine():0), (((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getText():null));	
				
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(418);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(419);
						((LvalueContext)_localctx).OPEN_SQUAREBRACKET = match(OPEN_SQUAREBRACKET);
						setState(420);
						((LvalueContext)_localctx).exp = exp(0);
						setState(421);
						match(CLOSE_SQUAREBRACKET);

						          		((LvalueContext)_localctx).node =  new ArrayPositionAccess((((LvalueContext)_localctx).OPEN_SQUAREBRACKET!=null?((LvalueContext)_localctx).OPEN_SQUAREBRACKET.getLine():0),(((LvalueContext)_localctx).OPEN_SQUAREBRACKET!=null?((LvalueContext)_localctx).OPEN_SQUAREBRACKET.getCharPositionInLine():0), ((LvalueContext)_localctx).l.node, ((LvalueContext)_localctx).exp.expInstance);
						          	 
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(424);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(425);
						((LvalueContext)_localctx).DOT = match(DOT);
						setState(426);
						((LvalueContext)_localctx).ID = match(ID);
						 
						          		((LvalueContext)_localctx).node =  new AttributeAccess((((LvalueContext)_localctx).DOT!=null?((LvalueContext)_localctx).DOT.getLine():0),(((LvalueContext)_localctx).DOT!=null?((LvalueContext)_localctx).DOT.getCharPositionInLine():0), ((LvalueContext)_localctx).l.node, new ID((((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getLine():0),(((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getCharPositionInLine():0), (((LvalueContext)_localctx).ID!=null?((LvalueContext)_localctx).ID.getText():null)));
						          	
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExpsContext)_localctx).expressions =  new ArrayList<Expr>(); 
			setState(434);
			((ExpsContext)_localctx).e1 = exp(0);

					_localctx.expressions.add(((ExpsContext)_localctx).e1.expInstance);
				
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(436);
				match(COMMA);
				setState(437);
				((ExpsContext)_localctx).e2 = exp(0);

						_localctx.expressions.add(((ExpsContext)_localctx).e2.expInstance);
					
				}
				}
				setState(444);
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
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5"+
		"C\n\5\f\5\16\5F\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7R\n\7"+
		"\f\7\16\7U\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\5\bl\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00e6\n\r\f\r\16\r\u00e9\13\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fa\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u0104\n\r\f\r\16\r\u0107\13\r\3\r\3\r\5\r\u010b"+
		"\n\r\3\r\3\r\5\r\u010f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u011a\n\16\f\16\16\16\u011d\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0137\n\17\f\17\16\17\u013a\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u014a"+
		"\n\20\f\20\16\20\u014d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0162\n\21"+
		"\f\21\16\21\u0165\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u017a\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0196\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u019f\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01af\n\24\f\24"+
		"\16\24\u01b2\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01bb\n\25"+
		"\f\25\16\25\u01be\13\25\3\25\2\b\22\32\34\36 &\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\2\2\u01df\2*\3\2\2\2\4.\3\2\2\2\6\67\3\2\2"+
		"\2\b>\3\2\2\2\nG\3\2\2\2\fM\3\2\2\2\16V\3\2\2\2\20p\3\2\2\2\22\u0080\3"+
		"\2\2\2\24\u0097\3\2\2\2\26\u0099\3\2\2\2\30\u010e\3\2\2\2\32\u0110\3\2"+
		"\2\2\34\u011e\3\2\2\2\36\u013b\3\2\2\2 \u014e\3\2\2\2\"\u0179\3\2\2\2"+
		"$\u019e\3\2\2\2&\u01a0\3\2\2\2(\u01b3\3\2\2\2*+\5\4\3\2+,\5\f\7\2,-\b"+
		"\2\1\2-\3\3\2\2\2.\64\b\3\1\2/\60\5\6\4\2\60\61\b\3\1\2\61\63\3\2\2\2"+
		"\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66"+
		"\64\3\2\2\2\678\7\3\2\289\7\26\2\29:\7\33\2\2:;\5\b\5\2;<\7\34\2\2<=\b"+
		"\4\1\2=\7\3\2\2\2>D\b\5\1\2?@\5\n\6\2@A\b\5\1\2AC\3\2\2\2B?\3\2\2\2CF"+
		"\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FD\3\2\2\2GH\7\25\2\2HI\7\61\2"+
		"\2IJ\5\22\n\2JK\7!\2\2KL\b\6\1\2L\13\3\2\2\2MS\b\7\1\2NO\5\16\b\2OP\b"+
		"\7\1\2PR\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\r\3\2\2\2US"+
		"\3\2\2\2VW\7\25\2\2WX\b\b\1\2X\\\7\35\2\2YZ\5\20\t\2Z[\b\b\1\2[]\3\2\2"+
		"\2\\Y\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^k\7\36\2\2_`\7\60\2\2`a\5\22\n\2ah"+
		"\b\b\1\2bc\7#\2\2cd\5\22\n\2de\b\b\1\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2h"+
		"f\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2k_\3\2\2\2kl\3\2\2\2lm\3\2\2\2"+
		"mn\5\26\f\2no\b\b\1\2o\17\3\2\2\2pq\b\t\1\2qr\7\25\2\2rs\7\61\2\2st\5"+
		"\22\n\2t}\b\t\1\2uv\7#\2\2vw\7\25\2\2wx\7\61\2\2xy\5\22\n\2yz\b\t\1\2"+
		"z|\3\2\2\2{u\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\b\n\1\2\u0081\u0082\5\24\13\2\u0082\u0083\b\n\1"+
		"\2\u0083\u008a\3\2\2\2\u0084\u0085\f\4\2\2\u0085\u0086\7\37\2\2\u0086"+
		"\u0087\7 \2\2\u0087\u0089\b\n\1\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\23\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u008e\7\5\2\2\u008e\u0098\b\13\1\2\u008f\u0090\7\b\2\2"+
		"\u0090\u0098\b\13\1\2\u0091\u0092\7\7\2\2\u0092\u0098\b\13\1\2\u0093\u0094"+
		"\7\6\2\2\u0094\u0098\b\13\1\2\u0095\u0096\7\26\2\2\u0096\u0098\b\13\1"+
		"\2\u0097\u008d\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0093"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\b\f\1\2\u009a"+
		"\u00a0\7\33\2\2\u009b\u009c\5\30\r\2\u009c\u009d\b\f\1\2\u009d\u009f\3"+
		"\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\34"+
		"\2\2\u00a4\27\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8"+
		"\5\32\16\2\u00a8\u00a9\7\36\2\2\u00a9\u00aa\5\26\f\2\u00aa\u00ab\b\r\1"+
		"\2\u00ab\u010f\3\2\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\7\35\2\2\u00ae"+
		"\u00af\5\32\16\2\u00af\u00b0\7\36\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2"+
		"\7\16\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\b\r\1\2\u00b4\u010f\3\2\2\2"+
		"\u00b5\u00b6\7\r\2\2\u00b6\u00b7\7\35\2\2\u00b7\u00b8\5\32\16\2\u00b8"+
		"\u00b9\7\36\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\b\r\1\2\u00bb\u010f\3"+
		"\2\2\2\u00bc\u00bd\7\r\2\2\u00bd\u00be\7\35\2\2\u00be\u00bf\5\32\16\2"+
		"\u00bf\u00c0\7\36\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7\16\2\2\u00c2"+
		"\u00c3\5\30\r\2\u00c3\u00c4\b\r\1\2\u00c4\u010f\3\2\2\2\u00c5\u00c6\7"+
		"\f\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\7\36\2\2"+
		"\u00c9\u00ca\5\30\r\2\u00ca\u00cb\b\r\1\2\u00cb\u010f\3\2\2\2\u00cc\u00cd"+
		"\7\f\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\7\36\2"+
		"\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\b\r\1\2\u00d2\u010f\3\2\2\2\u00d3"+
		"\u00d4\7\13\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\b\r"+
		"\1\2\u00d7\u010f\3\2\2\2\u00d8\u00d9\7\t\2\2\u00d9\u00da\5\32\16\2\u00da"+
		"\u00db\7!\2\2\u00db\u00dc\b\r\1\2\u00dc\u010f\3\2\2\2\u00dd\u00de\7\n"+
		"\2\2\u00de\u00df\b\r\1\2\u00df\u00e0\5\32\16\2\u00e0\u00e7\b\r\1\2\u00e1"+
		"\u00e2\7#\2\2\u00e2\u00e3\5\32\16\2\u00e3\u00e4\b\r\1\2\u00e4\u00e6\3"+
		"\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7!"+
		"\2\2\u00eb\u00ec\b\r\1\2\u00ec\u010f\3\2\2\2\u00ed\u00ee\5&\24\2\u00ee"+
		"\u00ef\7$\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\b\r"+
		"\1\2\u00f2\u010f\3\2\2\2\u00f3\u00f4\7\25\2\2\u00f4\u00f5\b\r\1\2\u00f5"+
		"\u00f9\7\35\2\2\u00f6\u00f7\5(\25\2\u00f7\u00f8\b\r\1\2\u00f8\u00fa\3"+
		"\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u010a\7\36\2\2\u00fc\u00fd\7%\2\2\u00fd\u00fe\5&\24\2\u00fe\u0105\b\r"+
		"\1\2\u00ff\u0100\7#\2\2\u0100\u0101\5&\24\2\u0101\u0102\b\r\1\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7&\2\2\u0109\u010b\3\2\2\2\u010a\u00fc\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7!\2\2\u010d\u010f\b\r\1\2\u010e"+
		"\u00a5\3\2\2\2\u010e\u00ac\3\2\2\2\u010e\u00b5\3\2\2\2\u010e\u00bc\3\2"+
		"\2\2\u010e\u00c5\3\2\2\2\u010e\u00cc\3\2\2\2\u010e\u00d3\3\2\2\2\u010e"+
		"\u00d8\3\2\2\2\u010e\u00dd\3\2\2\2\u010e\u00ed\3\2\2\2\u010e\u00f3\3\2"+
		"\2\2\u010f\31\3\2\2\2\u0110\u0111\b\16\1\2\u0111\u0112\5\34\17\2\u0112"+
		"\u0113\b\16\1\2\u0113\u011b\3\2\2\2\u0114\u0115\f\4\2\2\u0115\u0116\7"+
		"/\2\2\u0116\u0117\5\32\16\5\u0117\u0118\b\16\1\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\33\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\b\17\1\2\u011f\u0120"+
		"\5\36\20\2\u0120\u0121\b\17\1\2\u0121\u0138\3\2\2\2\u0122\u0123\f\6\2"+
		"\2\u0123\u0124\7%\2\2\u0124\u0125\5\36\20\2\u0125\u0126\b\17\1\2\u0126"+
		"\u0137\3\2\2\2\u0127\u0128\f\5\2\2\u0128\u0129\7&\2\2\u0129\u012a\5\36"+
		"\20\2\u012a\u012b\b\17\1\2\u012b\u0137\3\2\2\2\u012c\u012d\f\4\2\2\u012d"+
		"\u012e\7\'\2\2\u012e\u012f\5\36\20\2\u012f\u0130\b\17\1\2\u0130\u0137"+
		"\3\2\2\2\u0131\u0132\f\3\2\2\u0132\u0133\7(\2\2\u0133\u0134\5\36\20\2"+
		"\u0134\u0135\b\17\1\2\u0135\u0137\3\2\2\2\u0136\u0122\3\2\2\2\u0136\u0127"+
		"\3\2\2\2\u0136\u012c\3\2\2\2\u0136\u0131\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\35\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013b\u013c\b\20\1\2\u013c\u013d\5 \21\2\u013d\u013e\b\20\1\2\u013e"+
		"\u014b\3\2\2\2\u013f\u0140\f\5\2\2\u0140\u0141\7)\2\2\u0141\u0142\5 \21"+
		"\2\u0142\u0143\b\20\1\2\u0143\u014a\3\2\2\2\u0144\u0145\f\4\2\2\u0145"+
		"\u0146\7*\2\2\u0146\u0147\5 \21\2\u0147\u0148\b\20\1\2\u0148\u014a\3\2"+
		"\2\2\u0149\u013f\3\2\2\2\u0149\u0144\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\37\3\2\2\2\u014d\u014b\3\2\2"+
		"\2\u014e\u014f\b\21\1\2\u014f\u0150\5\"\22\2\u0150\u0151\b\21\1\2\u0151"+
		"\u0163\3\2\2\2\u0152\u0153\f\6\2\2\u0153\u0154\7+\2\2\u0154\u0155\5\""+
		"\22\2\u0155\u0156\b\21\1\2\u0156\u0162\3\2\2\2\u0157\u0158\f\5\2\2\u0158"+
		"\u0159\7,\2\2\u0159\u015a\5\"\22\2\u015a\u015b\b\21\1\2\u015b\u0162\3"+
		"\2\2\2\u015c\u015d\f\4\2\2\u015d\u015e\7-\2\2\u015e\u015f\5\"\22\2\u015f"+
		"\u0160\b\21\1\2\u0160\u0162\3\2\2\2\u0161\u0152\3\2\2\2\u0161\u0157\3"+
		"\2\2\2\u0161\u015c\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164!\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7.\2\2\u0167"+
		"\u0168\5\"\22\2\u0168\u0169\b\22\1\2\u0169\u017a\3\2\2\2\u016a\u016b\7"+
		"\17\2\2\u016b\u017a\b\22\1\2\u016c\u016d\7\20\2\2\u016d\u017a\b\22\1\2"+
		"\u016e\u016f\7\21\2\2\u016f\u017a\b\22\1\2\u0170\u0171\7\22\2\2\u0171"+
		"\u017a\b\22\1\2\u0172\u0173\7\23\2\2\u0173\u017a\b\22\1\2\u0174\u0175"+
		"\7\24\2\2\u0175\u017a\b\22\1\2\u0176\u0177\5$\23\2\u0177\u0178\b\22\1"+
		"\2\u0178\u017a\3\2\2\2\u0179\u0166\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u016c"+
		"\3\2\2\2\u0179\u016e\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0172\3\2\2\2\u0179"+
		"\u0174\3\2\2\2\u0179\u0176\3\2\2\2\u017a#\3\2\2\2\u017b\u017c\5&\24\2"+
		"\u017c\u017d\b\23\1\2\u017d\u019f\3\2\2\2\u017e\u017f\7\35\2\2\u017f\u0180"+
		"\5\32\16\2\u0180\u0181\7\36\2\2\u0181\u0182\b\23\1\2\u0182\u019f\3\2\2"+
		"\2\u0183\u0184\7\4\2\2\u0184\u0185\5\22\n\2\u0185\u0186\b\23\1\2\u0186"+
		"\u0187\b\23\1\2\u0187\u019f\3\2\2\2\u0188\u0189\7\4\2\2\u0189\u018a\5"+
		"\22\n\2\u018a\u018b\7\37\2\2\u018b\u018c\5\32\16\2\u018c\u018d\7 \2\2"+
		"\u018d\u018e\b\23\1\2\u018e\u019f\3\2\2\2\u018f\u0190\7\25\2\2\u0190\u0191"+
		"\b\23\1\2\u0191\u0195\7\35\2\2\u0192\u0193\5(\25\2\u0193\u0194\b\23\1"+
		"\2\u0194\u0196\3\2\2\2\u0195\u0192\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0198\7\36\2\2\u0198\u0199\7\37\2\2\u0199\u019a\5\32\16"+
		"\2\u019a\u019b\b\23\1\2\u019b\u019c\7 \2\2\u019c\u019d\b\23\1\2\u019d"+
		"\u019f\3\2\2\2\u019e\u017b\3\2\2\2\u019e\u017e\3\2\2\2\u019e\u0183\3\2"+
		"\2\2\u019e\u0188\3\2\2\2\u019e\u018f\3\2\2\2\u019f%\3\2\2\2\u01a0\u01a1"+
		"\b\24\1\2\u01a1\u01a2\7\25\2\2\u01a2\u01a3\b\24\1\2\u01a3\u01b0\3\2\2"+
		"\2\u01a4\u01a5\f\4\2\2\u01a5\u01a6\7\37\2\2\u01a6\u01a7\5\32\16\2\u01a7"+
		"\u01a8\7 \2\2\u01a8\u01a9\b\24\1\2\u01a9\u01af\3\2\2\2\u01aa\u01ab\f\3"+
		"\2\2\u01ab\u01ac\7\"\2\2\u01ac\u01ad\7\25\2\2\u01ad\u01af\b\24\1\2\u01ae"+
		"\u01a4\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\'\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4"+
		"\b\25\1\2\u01b4\u01b5\5\32\16\2\u01b5\u01bc\b\25\1\2\u01b6\u01b7\7#\2"+
		"\2\u01b7\u01b8\5\32\16\2\u01b8\u01b9\b\25\1\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b6\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd)\3\2\2\2\u01be\u01bc\3\2\2\2\36\64DS\\hk}\u008a\u0097\u00a0"+
		"\u00e7\u00f9\u0105\u010a\u010e\u011b\u0136\u0138\u0149\u014b\u0161\u0163"+
		"\u0179\u0195\u019e\u01ae\u01b0\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}