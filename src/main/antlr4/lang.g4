grammar lang;

@parser::header { package com.compiler.grammar; }

@lexer::header { package com.compiler.grammar; }

/* Regras da gramática */

prog: (stmt ';')+;

stmt:
	ID '=' expr
	| expr '?' '[' stmt ']' ':' '[' stmt ']'
	| expr '?' '[' stmt ']'
	| expr;

expr: term '+' expr | term;

term: factor '*' term | factor;

factor: ID | INT;

/* Regras léxicas */

ID: [a-z]+;
INT: [0-9]+;

NEWLINE: '\r'? '\n' -> skip;
WS: [ \t]+ -> skip;
LINE_COMMENT: '//' ~('\r' | '\n')* NEWLINE -> skip;
COMMENT: '/*' .*? '*/' -> skip;

