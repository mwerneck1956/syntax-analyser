grammar lang;

@parser::header { 
	package com.compiler.grammar;
	import com.compiler.ast.*;

 }

@lexer::header { package com.compiler.grammar; }

prog: data* func*;
data: DATA ID OPEN_BRACKET (decl)* CLOSE_BRACKET;
decl: ID DOUBLECOLON type SEMI;
func:
	ID OPEN_PARENTHESIS (params)? CLOSE_PARENTHESIS (
		COLON type (COMMA type)*
	)? OPEN_BRACKET (cmd)* CLOSE_BRACKET;
params: ID DOUBLECOLON type ( COMMA ID DOUBLECOLON type)*;
type: type OPEN_SQUAREBRACKET CLOSE_SQUAREBRACKET | btype;

btype: INT | CHAR | BOOL | FLOAT | TYPE;
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
aexp: aexp PLUS mexp | aexp MINUS mexp | mexp;
mexp: mexp TIMES sexp | mexp DIV sexp | mexp MOD sexp | sexp;
sexp:
	DENY sexp
	| MINUS sexp
	| LITERAL_TRUE
	| LITERAL_FALSE
	| LITERAL_NULL
	| LITERAL_INT
	| LITERAL_FLOAT
	| LITERAL_CHAR
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
DENY: '!';
AND: '&&';
COLON: ':';
DOUBLECOLON: '::';