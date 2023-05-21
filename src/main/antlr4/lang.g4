grammar lang;

@parser::header { 
	package com.compiler.grammar;
	import com.compiler.ast.*;

 }

@lexer::header { package com.compiler.grammar; }

/* Regras da gramática */

prog: data+;
data: DATA ID OPEN_BRACKETS (typeDeclaration)+ CLOSE_BRACKETS;
typeDeclaration: ID '::' TYPE SEMI;
function: ID '(' params* ')' (':' TYPE (',' TYPE)*) '{' '}';
params: ID '::' TYPE (',' ID '::' TYPE)*;
type: type OPEN_ANGLEBRACKETS CLOSE_ANGLEBRACKETS | basicType;
basicType: BaseTypes;

// prog: (stmt ';')+; data: ID ('{' typeDeclaration '}' | data); typeDeclaration: ID '::' TYPE ';';
// stmt: ID '=' expr; expr: term '+' expr | term; term: factor '*' term | factor; factor: ID |
// INTEGER | FLOAT;

/* Regras léxicas */

WS: [ \t\r\n]+ -> skip;

fragment Uppercase: [A-Z];
fragment Lowercase: [a-z];
fragment BaseTypes: 'Int' | 'Float' | 'Bool' | 'Char';

ID: [a-z]+ [A-za-z_]*;
TYPE: [A-Z][A-Za-z]*;

INTEGER: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+;

BOOL: 'true' | 'false';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ITERATE: 'iterate';
READ: 'read';
PRINT: 'print';
RETURN: 'return';
DATA: 'data';

OPEN_BRACKETS: '{';
CLOSE_BRACKETS: '}';
OPEN_ANGLEBRACKETS: '[';
CLOSE_ANGLEBRACKETS: ']';
SEMI: ';';
/* inclui todos caracteres da tabela ASCII.
 desde o caractere nulo (NULL) representado por
 \u0000
 
 até o caractere DEL (Delete) representado por \u007F.
 */
CHAR: [\u0000-\u007F];
NEWLINE: '\r'? '\n' -> skip;
LINE_COMMENT: '--' ~('\r' | '\n')* NEWLINE -> skip;
COMMENT: '{*' .*? '*}' -> skip;