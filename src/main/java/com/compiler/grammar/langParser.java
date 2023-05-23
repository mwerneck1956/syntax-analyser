// Generated from lang.g4 by ANTLR 4.8
 
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		RULE_prog = 0, RULE_data = 1, RULE_decl = 2, RULE_func = 3, RULE_params = 4, 
		RULE_type = 5, RULE_btype = 6, RULE_cmd = 7, RULE_exp = 8, RULE_rexp = 9, 
		RULE_aexp = 10, RULE_mexp = 11, RULE_sexp = 12, RULE_pexp = 13, RULE_lvalue = 14, 
		RULE_exps = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "data", "decl", "func", "params", "type", "btype", "cmd", "exp", 
			"rexp", "aexp", "mexp", "sexp", "pexp", "lvalue", "exps"
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
		public DataContext d;
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA) {
				{
				{
				setState(32);
				((ProgContext)_localctx).d = data();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(38);
				func();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
					((ProgContext)_localctx).ast =  new Prog(((ProgContext)_localctx).d.dataList);
				
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
		public HashMap<String, Data> dataList;
		public Token ID;
		public DeclContext d;
		public TerminalNode DATA() { return getToken(langParser.DATA, 0); }
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(langParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(langParser.CLOSE_BRACKET, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
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
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((DataContext)_localctx).dataList =  new HashMap<String, Data>(); 
			setState(47);
			match(DATA);
			setState(48);
			((DataContext)_localctx).ID = match(ID);
			setState(49);
			match(OPEN_BRACKET);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(50);
				((DataContext)_localctx).d = decl();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(CLOSE_BRACKET);

				 	ID id = new ID((((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getLine():0), (((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getCharPositionInLine():0),  (((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getText():null));
					ArrayList<Declaration> declarations = new ArrayList<Declaration>();
					declarations.add(((DataContext)_localctx).d.declaration);

					Data data = new Data(id, declarations);
					_localctx.dataList.put(id.getName(), data);
				
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
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((DeclContext)_localctx).ID = match(ID);
			setState(60);
			match(DOUBLECOLON);
			setState(61);
			((DeclContext)_localctx).t = type(0);
			setState(62);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(OPEN_PARENTHESIS);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(67);
				params();
				}
			}

			setState(70);
			match(CLOSE_PARENTHESIS);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(71);
				match(COLON);
				setState(72);
				type(0);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(73);
					match(COMMA);
					setState(74);
					type(0);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(82);
			match(OPEN_BRACKET);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << READ) | (1L << ITERATE) | (1L << IF) | (1L << ID) | (1L << OPEN_BRACKET))) != 0)) {
				{
				{
				setState(83);
				cmd();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
			setState(92);
			match(DOUBLECOLON);
			setState(93);
			type(0);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				match(ID);
				setState(96);
				match(DOUBLECOLON);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			((TypeContext)_localctx).btype = btype();
			 
					((TypeContext)_localctx).basicType =  ((TypeContext)_localctx).btype.basicType;
				
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
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
					setState(107);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(108);
					match(OPEN_SQUAREBRACKET);
					setState(109);
					match(CLOSE_SQUAREBRACKET);
					}
					} 
				}
				setState(114);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_btype);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((BtypeContext)_localctx).INT = match(INT);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getLine():0), (((BtypeContext)_localctx).INT!=null?((BtypeContext)_localctx).INT.getCharPositionInLine():0), "Int");
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				((BtypeContext)_localctx).CHAR = match(CHAR);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getLine():0), (((BtypeContext)_localctx).CHAR!=null?((BtypeContext)_localctx).CHAR.getCharPositionInLine():0), "CHAR"); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				((BtypeContext)_localctx).BOOL = match(BOOL);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getLine():0), (((BtypeContext)_localctx).BOOL!=null?((BtypeContext)_localctx).BOOL.getCharPositionInLine():0), "CHAR"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				((BtypeContext)_localctx).FLOAT = match(FLOAT);
				((BtypeContext)_localctx).basicType =  new BasicType((((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getLine():0), (((BtypeContext)_localctx).FLOAT!=null?((BtypeContext)_localctx).FLOAT.getCharPositionInLine():0), "Float"); 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(OPEN_BRACKET);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << READ) | (1L << ITERATE) | (1L << IF) | (1L << ID) | (1L << OPEN_BRACKET))) != 0)) {
					{
					{
					setState(128);
					cmd();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(IF);
				setState(136);
				match(OPEN_PARENTHESIS);
				setState(137);
				exp(0);
				setState(138);
				match(CLOSE_PARENTHESIS);
				setState(139);
				cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(IF);
				setState(142);
				match(OPEN_PARENTHESIS);
				setState(143);
				exp(0);
				setState(144);
				match(CLOSE_PARENTHESIS);
				setState(145);
				cmd();
				setState(146);
				match(ELSE);
				setState(147);
				cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(ITERATE);
				setState(150);
				match(OPEN_PARENTHESIS);
				setState(151);
				exp(0);
				setState(152);
				match(CLOSE_PARENTHESIS);
				setState(153);
				cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(READ);
				setState(156);
				lvalue(0);
				setState(157);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(PRINT);
				setState(160);
				exp(0);
				setState(161);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(RETURN);
				setState(164);
				exp(0);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(165);
					match(COMMA);
					setState(166);
					exp(0);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				lvalue(0);
				setState(175);
				match(EQ);
				setState(176);
				exp(0);
				setState(177);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				match(ID);
				setState(180);
				match(OPEN_PARENTHESIS);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << OPEN_PARENTHESIS) | (1L << MINUS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(181);
					exps();
					}
				}

				setState(184);
				match(CLOSE_PARENTHESIS);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELACIONAL) {
					{
					setState(185);
					match(RELACIONAL);
					setState(186);
					lvalue(0);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(187);
						match(COMMA);
						setState(188);
						lvalue(0);
						}
						}
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(194);
					match(GREATER_THAN);
					}
				}

				setState(198);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
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
					setState(204);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(205);
					match(AND);
					setState(206);
					exp(3);
					}
					} 
				}
				setState(211);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(213);
				aexp(0);
				setState(214);
				match(RELACIONAL);
				setState(215);
				aexp(0);
				}
				break;
			case 2:
				{
				setState(217);
				aexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(220);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						match(EQEQ);
						setState(222);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new RexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(223);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(224);
						match(DIFF);
						setState(225);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(230);
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
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(langParser.PLUS, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235);
						match(PLUS);
						setState(236);
						mexp(0);
						}
						break;
					case 2:
						{
						_localctx = new AexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(237);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(238);
						match(MINUS);
						setState(239);
						mexp(0);
						}
						break;
					}
					} 
				}
				setState(244);
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
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(langParser.TIMES, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(248);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(249);
						match(TIMES);
						setState(250);
						sexp();
						}
						break;
					case 2:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(251);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(252);
						match(DIV);
						setState(253);
						sexp();
						}
						break;
					case 3:
						{
						_localctx = new MexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(254);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(255);
						match(MOD);
						setState(256);
						sexp();
						}
						break;
					}
					} 
				}
				setState(261);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitSexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sexp);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICALNEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(LOGICALNEGATION);
				setState(263);
				sexp();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(MINUS);
				setState(265);
				sexp();
				}
				break;
			case LITERAL_TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(LITERAL_TRUE);
				}
				break;
			case LITERAL_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(LITERAL_FALSE);
				}
				break;
			case LITERAL_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(LITERAL_NULL);
				}
				break;
			case LITERAL_INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(LITERAL_INT);
				}
				break;
			case LITERAL_FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				match(LITERAL_FLOAT);
				}
				break;
			case LITERAL_CHAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				match(LITERAL_CHAR);
				}
				break;
			case NEW:
			case ID:
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitPexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PexpContext pexp() throws RecognitionException {
		PexpContext _localctx = new PexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pexp);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				lvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(OPEN_PARENTHESIS);
				setState(277);
				exp(0);
				setState(278);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(NEW);
				setState(281);
				type(0);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(282);
					match(OPEN_SQUAREBRACKET);
					setState(283);
					exp(0);
					setState(284);
					match(CLOSE_SQUAREBRACKET);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(ID);
				setState(289);
				match(OPEN_PARENTHESIS);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ID) | (1L << LITERAL_INT) | (1L << LITERAL_FLOAT) | (1L << LITERAL_CHAR) | (1L << LITERAL_TRUE) | (1L << LITERAL_FALSE) | (1L << LITERAL_NULL) | (1L << OPEN_PARENTHESIS) | (1L << MINUS) | (1L << LOGICALNEGATION))) != 0)) {
					{
					setState(290);
					exps();
					}
				}

				setState(293);
				match(CLOSE_PARENTHESIS);
				setState(294);
				match(OPEN_SQUAREBRACKET);
				setState(295);
				exp(0);
				setState(296);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(301);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(303);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(304);
						match(OPEN_SQUAREBRACKET);
						setState(305);
						exp(0);
						setState(306);
						match(CLOSE_SQUAREBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(308);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(309);
						match(DOT);
						setState(310);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(315);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof langVisitor ) return ((langVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			exp(0);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(317);
				match(COMMA);
				setState(318);
				exp(0);
				}
				}
				setState(323);
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
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 9:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 10:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 11:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0147\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\5\5"+
		"S\n\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6e\n\6\f\6\16\6h\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7"+
		"\16\7t\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t"+
		"\3\t\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b9\n\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00c0\n\t\f\t\16\t\u00c3\13\t\3\t\3\t\5\t\u00c7\n\t\3\t\5\t\u00ca\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00dd\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00e5\n\13\f\13\16\13\u00e8\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00f3\n\f\f\f\16\f\u00f6\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u0104\n\r\f\r\16\r\u0107\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0114\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0121\n\17\3\17\3\17\3\17\5\17\u0126"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u012d\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u013a\n\20\f\20\16\20\u013d\13\20"+
		"\3\21\3\21\3\21\7\21\u0142\n\21\f\21\16\21\u0145\13\21\3\21\2\b\f\22\24"+
		"\26\30\36\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u0169\2%\3"+
		"\2\2\2\4\60\3\2\2\2\6=\3\2\2\2\bC\3\2\2\2\n]\3\2\2\2\fi\3\2\2\2\16\177"+
		"\3\2\2\2\20\u00c9\3\2\2\2\22\u00cb\3\2\2\2\24\u00dc\3\2\2\2\26\u00e9\3"+
		"\2\2\2\30\u00f7\3\2\2\2\32\u0113\3\2\2\2\34\u012c\3\2\2\2\36\u012e\3\2"+
		"\2\2 \u013e\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&+\3\2\2\2\'%\3\2\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,.\3\2\2\2-+\3\2\2\2./\b\2\1\2/\3\3\2\2\2\60\61\b\3\1\2\61\62\7\3"+
		"\2\2\62\63\7\17\2\2\63\67\7\33\2\2\64\66\5\6\4\2\65\64\3\2\2\2\669\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\34\2\2;<\b\3"+
		"\1\2<\5\3\2\2\2=>\7\17\2\2>?\7\61\2\2?@\5\f\7\2@A\7!\2\2AB\b\4\1\2B\7"+
		"\3\2\2\2CD\7\17\2\2DF\7\35\2\2EG\5\n\6\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2"+
		"HR\7\36\2\2IJ\7\60\2\2JO\5\f\7\2KL\7#\2\2LN\5\f\7\2MK\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RI\3\2\2\2RS\3\2\2\2ST\3\2\2"+
		"\2TX\7\33\2\2UW\5\20\t\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2"+
		"\2\2ZX\3\2\2\2[\\\7\34\2\2\\\t\3\2\2\2]^\7\17\2\2^_\7\61\2\2_f\5\f\7\2"+
		"`a\7#\2\2ab\7\17\2\2bc\7\61\2\2ce\5\f\7\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2g\13\3\2\2\2hf\3\2\2\2ij\b\7\1\2jk\5\16\b\2kl\b\7\1\2lr\3"+
		"\2\2\2mn\f\4\2\2no\7\37\2\2oq\7 \2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2s\r\3\2\2\2tr\3\2\2\2uv\7\5\2\2v\u0080\b\b\1\2wx\7\b\2\2x\u0080"+
		"\b\b\1\2yz\7\7\2\2z\u0080\b\b\1\2{|\7\6\2\2|\u0080\b\b\1\2}~\7\20\2\2"+
		"~\u0080\b\b\1\2\177u\3\2\2\2\177w\3\2\2\2\177y\3\2\2\2\177{\3\2\2\2\177"+
		"}\3\2\2\2\u0080\17\3\2\2\2\u0081\u0085\7\33\2\2\u0082\u0084\5\20\t\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u00ca\7\34\2\2\u0089"+
		"\u008a\7\r\2\2\u008a\u008b\7\35\2\2\u008b\u008c\5\22\n\2\u008c\u008d\7"+
		"\36\2\2\u008d\u008e\5\20\t\2\u008e\u00ca\3\2\2\2\u008f\u0090\7\r\2\2\u0090"+
		"\u0091\7\35\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7\36\2\2\u0093\u0094"+
		"\5\20\t\2\u0094\u0095\7\16\2\2\u0095\u0096\5\20\t\2\u0096\u00ca\3\2\2"+
		"\2\u0097\u0098\7\f\2\2\u0098\u0099\7\35\2\2\u0099\u009a\5\22\n\2\u009a"+
		"\u009b\7\36\2\2\u009b\u009c\5\20\t\2\u009c\u00ca\3\2\2\2\u009d\u009e\7"+
		"\13\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7!\2\2\u00a0\u00ca\3\2\2\2\u00a1"+
		"\u00a2\7\t\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7!\2\2\u00a4\u00ca\3\2"+
		"\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00ab\5\22\n\2\u00a7\u00a8\7#\2\2\u00a8"+
		"\u00aa\5\22\n\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7!\2\2\u00af\u00ca\3\2\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7"+
		"$\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\7!\2\2\u00b4\u00ca\3\2\2\2\u00b5"+
		"\u00b6\7\17\2\2\u00b6\u00b8\7\35\2\2\u00b7\u00b9\5 \21\2\u00b8\u00b7\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c6\7\36\2\2\u00bb"+
		"\u00bc\7%\2\2\u00bc\u00c1\5\36\20\2\u00bd\u00be\7#\2\2\u00be\u00c0\5\36"+
		"\20\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7&"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\7!\2\2\u00c9\u0081\3\2\2\2\u00c9\u0089\3\2"+
		"\2\2\u00c9\u008f\3\2\2\2\u00c9\u0097\3\2\2\2\u00c9\u009d\3\2\2\2\u00c9"+
		"\u00a1\3\2\2\2\u00c9\u00a5\3\2\2\2\u00c9\u00b0\3\2\2\2\u00c9\u00b5\3\2"+
		"\2\2\u00ca\21\3\2\2\2\u00cb\u00cc\b\n\1\2\u00cc\u00cd\5\24\13\2\u00cd"+
		"\u00d3\3\2\2\2\u00ce\u00cf\f\4\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d2\5\22"+
		"\n\5\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\13\1"+
		"\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\7%\2\2\u00d9\u00da\5\26\f\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00dd\5\26\f\2\u00dc\u00d6\3\2\2\2\u00dc\u00db\3"+
		"\2\2\2\u00dd\u00e6\3\2\2\2\u00de\u00df\f\5\2\2\u00df\u00e0\7\'\2\2\u00e0"+
		"\u00e5\5\26\f\2\u00e1\u00e2\f\4\2\2\u00e2\u00e3\7(\2\2\u00e3\u00e5\5\26"+
		"\f\2\u00e4\u00de\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\25\3\2\2\2\u00e8\u00e6\3\2\2"+
		"\2\u00e9\u00ea\b\f\1\2\u00ea\u00eb\5\30\r\2\u00eb\u00f4\3\2\2\2\u00ec"+
		"\u00ed\f\5\2\2\u00ed\u00ee\7)\2\2\u00ee\u00f3\5\30\r\2\u00ef\u00f0\f\4"+
		"\2\2\u00f0\u00f1\7*\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00ec\3\2\2\2\u00f2"+
		"\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\27\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\r\1\2\u00f8\u00f9"+
		"\5\32\16\2\u00f9\u0105\3\2\2\2\u00fa\u00fb\f\6\2\2\u00fb\u00fc\7+\2\2"+
		"\u00fc\u0104\5\32\16\2\u00fd\u00fe\f\5\2\2\u00fe\u00ff\7,\2\2\u00ff\u0104"+
		"\5\32\16\2\u0100\u0101\f\4\2\2\u0101\u0102\7-\2\2\u0102\u0104\5\32\16"+
		"\2\u0103\u00fa\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\31\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7.\2\2\u0109\u0114\5\32\16\2\u010a\u010b\7"+
		"*\2\2\u010b\u0114\5\32\16\2\u010c\u0114\7\24\2\2\u010d\u0114\7\25\2\2"+
		"\u010e\u0114\7\26\2\2\u010f\u0114\7\21\2\2\u0110\u0114\7\22\2\2\u0111"+
		"\u0114\7\23\2\2\u0112\u0114\5\34\17\2\u0113\u0108\3\2\2\2\u0113\u010a"+
		"\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113"+
		"\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2"+
		"\2\2\u0114\33\3\2\2\2\u0115\u012d\5\36\20\2\u0116\u0117\7\35\2\2\u0117"+
		"\u0118\5\22\n\2\u0118\u0119\7\36\2\2\u0119\u012d\3\2\2\2\u011a\u011b\7"+
		"\4\2\2\u011b\u0120\5\f\7\2\u011c\u011d\7\37\2\2\u011d\u011e\5\22\n\2\u011e"+
		"\u011f\7 \2\2\u011f\u0121\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u012d\3\2\2\2\u0122\u0123\7\17\2\2\u0123\u0125\7\35\2\2\u0124"+
		"\u0126\5 \21\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\7\36\2\2\u0128\u0129\7\37\2\2\u0129\u012a\5\22\n\2\u012a"+
		"\u012b\7 \2\2\u012b\u012d\3\2\2\2\u012c\u0115\3\2\2\2\u012c\u0116\3\2"+
		"\2\2\u012c\u011a\3\2\2\2\u012c\u0122\3\2\2\2\u012d\35\3\2\2\2\u012e\u012f"+
		"\b\20\1\2\u012f\u0130\7\17\2\2\u0130\u013b\3\2\2\2\u0131\u0132\f\4\2\2"+
		"\u0132\u0133\7\37\2\2\u0133\u0134\5\22\n\2\u0134\u0135\7 \2\2\u0135\u013a"+
		"\3\2\2\2\u0136\u0137\f\3\2\2\u0137\u0138\7\"\2\2\u0138\u013a\7\17\2\2"+
		"\u0139\u0131\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\37\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0143\5\22\n\2\u013f\u0140\7#\2\2\u0140\u0142\5\22\n\2\u0141\u013f\3"+
		"\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"!\3\2\2\2\u0145\u0143\3\2\2\2!%+\67FORXfr\177\u0085\u00ab\u00b8\u00c1"+
		"\u00c6\u00c9\u00d3\u00dc\u00e4\u00e6\u00f2\u00f4\u0103\u0105\u0113\u0120"+
		"\u0125\u012c\u0139\u013b\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}