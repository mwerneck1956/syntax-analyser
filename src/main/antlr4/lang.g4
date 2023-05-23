grammar lang;

@parser::header { 
	package com.compiler.grammar;
	import com.compiler.ast.*;
	import java.util.HashMap;
 }

@lexer::header { package com.compiler.grammar; }

prog
	returns[Prog ast]:
	d = dataList func* { 
		$ast = new Prog($d.dataListInstance);
	};

dataList
	returns[HashMap<String,Data> dataListInstance]:
	{ 
		$dataListInstance = new HashMap<String,Data>();
 	} (
		d = data { 
		$dataListInstance.put($d.dataObj.getIdName() , $d.dataObj);
		}
	)*;

data
	returns[Data dataObj]:
	DATA ID OPEN_BRACKET d = declList CLOSE_BRACKET {
	 	ID id = new ID($ID.line, $ID.pos,  $ID.text);

		$dataObj = new Data(id, $d.declarationList);
	};

declList
	returns[ArrayList<Declaration> declarationList]:
	{$declarationList = new ArrayList<Declaration>();} (
		decl {$declarationList.add($decl.declaration);}
	)*;

decl
	returns[Declaration declaration]:
	ID DOUBLECOLON t = type SEMI {
		{ 
			ID id = new ID($ID.line, $ID.pos,  $ID.text);
			$declaration = new Declaration(id, $t.basicType);	 
		}
};
func:
	ID OPEN_PARENTHESIS (params)? CLOSE_PARENTHESIS (
		COLON type (COMMA type)*
	)? OPEN_BRACKET (cmd)* CLOSE_BRACKET;
params
	returns[Param param]:
	ID DOUBLECOLON t = type { 

	ID id = new ID($ID.line, $ID.pos,  $ID.text);
	$param = new Param(id , $t.basicType);
} (COMMA ID DOUBLECOLON type)*;

type
	returns[BasicType basicType]:
	type OPEN_SQUAREBRACKET CLOSE_SQUAREBRACKET
	| btype { 
		$basicType = $btype.basicType;
	};

btype
	returns[BasicType basicType]:
	INT {$basicType  = new BasicType($INT.line, $INT.pos, "Int");}
	| CHAR {$basicType  = new BasicType($CHAR.line, $CHAR.pos, "CHAR"); }
	| BOOL {$basicType  = new BasicType($BOOL.line, $BOOL.pos, "CHAR"); }
	| FLOAT {$basicType  = new BasicType($FLOAT.line, $FLOAT.pos, "Float"); }
	| TYPE {$basicType  = new BasicType($TYPE.line, $TYPE.pos, $TYPE.text); };
cmd:
	OPEN_BRACKET (cmd)* CLOSE_BRACKET
	| IF OPEN_PARENTHESIS exp CLOSE_PARENTHESIS cmd
	| IF OPEN_PARENTHESIS exp CLOSE_PARENTHESIS cmd ELSE cmd
	| ITERATE OPEN_PARENTHESIS exp CLOSE_PARENTHESIS cmd
	| READ lvalue SEMI
	| PRINT exp SEMI
	| RETURN exp (COMMA exp)* SEMI
	| lvalue EQ exp SEMI
	| ID OPEN_PARENTHESIS (exps)? CLOSE_PARENTHESIS (
		RELACIONAL lvalue (COMMA lvalue)* GREATER_THAN
	)? SEMI;
exp: exp AND exp | rexp;
rexp:
	aexp RELACIONAL aexp
	| rexp EQEQ aexp
	| rexp DIFF aexp
	| aexp;
aexp
	returns[Expr binOp]:
	a = aexp PLUS m = mexp { $binOp = new Add($PLUS.line, $PLUS.pos, $a.binOp, $m.mexpExpr); }
	| a = aexp MINUS m = mexp { $binOp = new Minus($MINUS.line, $MINUS.pos, $a.binOp, $m.mexpExpr); 
		}
	| m = mexp { $binOp = $m.mexpExpr; };
mexp
	returns[Expr mexpExpr]:
	m = mexp TIMES s = sexp {
		$mexpExpr = new Mult($TIMES.line, $TIMES.pos, $m.mexpExpr , $s.sexpValue);
	}
	| m = mexp DIV s = sexp { 
		$mexpExpr = new Div($DIV.line, $DIV.pos, $m.mexpExpr , $s.sexpValue);
	}
	| mexp MOD sexp
	| s = sexp {  $mexpExpr = $s.sexpValue; };
sexp
	returns[Expr sexpValue]:
	LOGICALNEGATION sexp
	| MINUS sexp
	| LITERAL_TRUE {$sexpValue = new LiteralTrue($LITERAL_TRUE.line,$LITERAL_TRUE.pos);}
	| LITERAL_FALSE {$sexpValue = new LiteralFalse($LITERAL_FALSE.line,$LITERAL_FALSE.pos);}
	| LITERAL_NULL {$sexpValue = new LiteralNull($LITERAL_NULL.line,$LITERAL_NULL.pos);}
	| LITERAL_INT {
		$sexpValue = new LiteralInt($LITERAL_INT.line,$LITERAL_INT.pos,Integer.parseInt($LITERAL_INT.text) );
		}
	| LITERAL_FLOAT {
		$sexpValue = new LiteralFloat($LITERAL_FLOAT.line,$LITERAL_FLOAT.pos,Float.parseFloat($LITERAL_FLOAT.text) );
		}
	| LITERAL_CHAR { 
		$sexpValue = new LiteralChar($LITERAL_CHAR.line,$LITERAL_CHAR.pos,$LITERAL_CHAR.text );
	}
	| pexp;
pexp:
	lvalue
	| OPEN_PARENTHESIS exp CLOSE_PARENTHESIS
	| NEW type (OPEN_SQUAREBRACKET exp CLOSE_SQUAREBRACKET)?
	| ID OPEN_PARENTHESIS (exps)? CLOSE_PARENTHESIS OPEN_SQUAREBRACKET exp CLOSE_SQUAREBRACKET;
lvalue:
	ID
	| lvalue OPEN_SQUAREBRACKET exp CLOSE_SQUAREBRACKET
	| lvalue DOT ID;
exps: exp (COMMA exp)*;

/* Regras Léxicas */

//Reserved Words
DATA: 'data';
NEW: 'new';
INT: 'Int';
FLOAT: 'Float';
BOOL: 'Bool';
CHAR: 'Char';
PRINT: 'print';
RETURN: 'return';
READ: 'read';
ITERATE: 'iterate';
IF: 'if';
ELSE: 'else';

ID: [a-z]+ [A-za-z_]*;
TYPE: [A-Z][A-Za-z]*;

LITERAL_INT: [0-9]+;
LITERAL_FLOAT: [0-9]* '.' [0-9]+;
LITERAL_CHAR: '\'' ( '\\' [btnr"'\\] | ~[\r\n\\"]) '\'';
LITERAL_TRUE: 'true';
LITERAL_FALSE: 'false';
LITERAL_NULL: 'null';

NEWLINE: '\r'? '\n' -> skip;
WHITESPACE: [ \t]+ -> skip;
LINE_COMMENT: '--' ~( '\r' | '\n')* NEWLINE -> skip;
COMMENT: '{-' .*? '*}' -> skip;

//Symbols
OPEN_BRACKET: '{';
CLOSE_BRACKET: '}';
OPEN_PARENTHESIS: '(';
CLOSE_PARENTHESIS: ')';
OPEN_SQUAREBRACKET: '[';
CLOSE_SQUAREBRACKET: ']';
SEMI: ';';
DOT: '.';
COMMA: ',';
EQ: '=';
RELACIONAL: '<';
GREATER_THAN: '>';
EQEQ: '==';
DIFF: '!=';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
MOD: '%';
LOGICALNEGATION: '!';
AND: '&&';
COLON: ':';
DOUBLECOLON: '::';