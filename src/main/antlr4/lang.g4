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

factor: ID | INTEGER | FLOAT;


/* Regras léxicas */

ID: [a-z]+ [a-zA-z_]*;
INTEGER: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+;
BOOL: 'true' | 'false';
TYPENAME: [:uppercase:] [:lowercase:]+ ([:uppercase:] | [:lowercase:])+;
IF: 'if';
THEN: 'then';
ELSE: 'else';
ITERATE: 'iterate';
READ: 'read';
PRINT: 'print';
RETURN: 'return';
/*  inclui todos caracteres da tabela ASCII.
 desde o caractere nulo (NULL) representado por \u0000 
 até o caractere DEL (Delete) representado por \u007F. */
CHAR: [\u0000-\u007F]; 


NEWLINE: [\r | \n | \r\n] -> skip;  /* No nosso jflex estava como endOfLine */
WS: [ \t | \b | \n | \r]+ -> skip;
LINE_COMMENT: '--' ~('\r' | '\n')* NEWLINE -> skip;
COMMENT: '{*' .*? '*}' -> skip;
