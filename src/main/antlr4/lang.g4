/* 
 Matheus Gomes Luz Werneck (201835037) 
 Pedro Henrique Almeida Cardoso Reis (201835039)
 */

grammar lang;

@parser::header { 
	/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
	*/

	package com.compiler.grammar;
	import com.compiler.ast.*;
	import java.util.HashMap;
	import java.util.ArrayList;
 }

@lexer::header { package com.compiler.grammar; }

prog
	returns[Prog ast]:
	dataList functions { 
		$ast = new Prog($dataList.dataListInstance, $functions.functionsList);		
	};

dataList
	returns[ArrayList<Data> dataListInstance]:
	{ 
		$dataListInstance = new ArrayList<Data>();
 	} (
		d = data { 
		$dataListInstance.add($d.dataObj);
		}
	)*;

data
	returns[Data dataObj]:
	DATA TYPE OPEN_BRACKET d = declList CLOSE_BRACKET {
	 	ID id = new ID($TYPE.line, $TYPE.pos,  $TYPE.text);

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

functions
	returns[ArrayList<Function> functionsList]:
	{ $functionsList = new ArrayList<Function>(); } (
		func { 
			$functionsList.add($func.f);
		}
	)*;

func
	returns[Function f]:
	ID {
		ID id = new ID($ID.line, $ID.pos, $ID.text);
		Function func = new Function(id);
	 } OPEN_PARENTHESIS (
		params { 
		func.setParamlist($params.paramsArray);
	 }
	)? CLOSE_PARENTHESIS (
		COLON type { 
		func.addReturn($type.basicType);
	} (
			COMMA type { 
		func.addReturn($type.basicType);
	}
		)*
	)? cmdList { 
		func.setBody($cmdList.commands);

		$f = func;
	};
params
	returns[ArrayList<Param> paramsArray]:
	{ 
		$paramsArray = new ArrayList<Param>();
	} ID DOUBLECOLON t = type { 
	ID newId = new ID($ID.line, $ID.pos,  $ID.text);
	Param newParam = new Param(newId , $t.basicType);
	$paramsArray.add(newParam);

} (
		COMMA ID DOUBLECOLON t = type { 
				ID id = new ID($ID.line, $ID.pos,  $ID.text);
				Param param = new Param(id , $t.basicType);
				$paramsArray.add(param);
	}
	)*;

type
	returns[Type basicType]:
	t = type OPEN_SQUAREBRACKET CLOSE_SQUAREBRACKET { 
		$basicType = new TypeArray($OPEN_SQUAREBRACKET.line,$OPEN_SQUAREBRACKET.pos, $t.basicType);
	}
	| btype { 
		$basicType = $btype.basicType;
	};

btype
	returns[Type basicType]:
	INT {$basicType  = new TypeInt($INT.line, $INT.pos); }
	| CHAR {$basicType  = new TypeChar($CHAR.line, $CHAR.pos); }
	| BOOL {$basicType  = new TypeBool($BOOL.line, $BOOL.pos); }
	| FLOAT {$basicType  = new TypeFloat($FLOAT.line, $FLOAT.pos); }
	| TYPE {$basicType  = new TypeCustom($TYPE.line, $TYPE.pos, $TYPE.text); };

cmdList
	returns[CmdList commands]:
	{ 
		$commands = new CmdList($OPEN_BRACKET.line,$OPEN_BRACKET.pos);
	} OPEN_BRACKET (
		c = cmd {
		$commands.addCommand($c.command);
	}
	)* CLOSE_BRACKET;

cmd
	returns[Cmd command]:
	IF OPEN_PARENTHESIS exp1 = exp CLOSE_PARENTHESIS rightSide = cmdList { 
		$command = new If($OPEN_PARENTHESIS.line, $OPEN_PARENTHESIS.pos, $exp1.expInstance, $rightSide.commands);
	}
	| IF OPEN_PARENTHESIS exp1 = exp CLOSE_PARENTHESIS then = cmdList ELSE elseCmd = cmdList { 
		$command = new If($OPEN_PARENTHESIS.line, $OPEN_PARENTHESIS.pos, $exp1.expInstance, $then.commands, $elseCmd.commands);
	}
	| IF OPEN_PARENTHESIS exp1 = exp CLOSE_PARENTHESIS cmd { 
		$command = new If($OPEN_PARENTHESIS.line, $OPEN_PARENTHESIS.pos, $exp1.expInstance, $cmd.command);
	}
	| IF OPEN_PARENTHESIS exp1 = exp CLOSE_PARENTHESIS thenCmd = cmd ELSE elseSimpleCmd = cmd { 
		$command = new If($OPEN_PARENTHESIS.line, $OPEN_PARENTHESIS.pos, $exp1.expInstance, $thenCmd.command, $elseSimpleCmd.command);
	}
	| ITERATE OPEN_PARENTHESIS e = exp CLOSE_PARENTHESIS c = cmd { 
		$command = new Iterate($ITERATE.line, $ITERATE.pos,  $e.expInstance , $c.command);
	}
	| ITERATE OPEN_PARENTHESIS e = exp CLOSE_PARENTHESIS cmdList { 
		$command = new Iterate($ITERATE.line, $ITERATE.pos,  $e.expInstance , $cmdList.commands);
	}
	| READ l = lvalue SEMI {
		$command = new Read($READ.line,$READ.pos , $l.node);
	}
	| PRINT e = exp SEMI { 
		$command = new Print($PRINT.line,$PRINT.pos, $e.expInstance);
	}
	| RETURN { 
	 	Return returnCmd = new Return($RETURN.line,$RETURN.pos);
	} exp { 
		returnCmd.addExpr($exp.expInstance);
	} (
		COMMA exp { 
		returnCmd.addExpr($exp.expInstance);
	}
	)* SEMI { 
		$command = returnCmd;
	}
	| l = lvalue EQ e = exp SEMI {
		$command = new Attribution($EQ.line, $EQ.pos, $l.node, $e.expInstance );
	}
	| ID { 
		FunctionCall functionCall = new FunctionCall($ID.line, $ID.pos, $ID.text);
	} OPEN_PARENTHESIS (
		exps {  functionCall.addParams($exps.expressions); }
	)? CLOSE_PARENTHESIS (
		RELACIONAL lvalue { functionCall.addReturn($lvalue.node);  } (
			COMMA lvalue { 
			functionCall.addReturn($lvalue.node);
		}
		)* GREATER_THAN
	)? SEMI {  $command = functionCall; };
exp
	returns[Expr expInstance]:
	e1 = exp AND e2 = exp {
		$expInstance = new And($AND.line , $AND.pos, $e1.expInstance, $e2.expInstance);
	}
	| r = rexp { $expInstance = $rexp.rexpExpr; };
rexp
	returns[Expr rexpExpr]:
	a = aexp { $rexpExpr = $a.binOp; }
	| r = rexp RELACIONAL a = aexp { $rexpExpr = new LessThan($EQEQ.line, $EQEQ.pos,  $r.rexpExpr, $a.binOp);
		}
	| r = rexp GREATER_THAN a = aexp { $rexpExpr = new GreatherThan($EQEQ.line, $EQEQ.pos,  $r.rexpExpr, $a.binOp);  
		}
	| r = rexp EQEQ a = aexp { $rexpExpr = new Equal($EQEQ.line, $EQEQ.pos, $r.rexpExpr, $a.binOp);  
		}
	| r = rexp DIFF a = aexp { $rexpExpr = new Diff($DIFF.line, $DIFF.pos, $r.rexpExpr, $a.binOp);  
		};

aexp
	returns[Expr binOp]:
	a = aexp PLUS m = mexp { $binOp = new Add($PLUS.line, $PLUS.pos, $a.binOp, $m.mexpExpr); }
	| a = aexp MINUS m = mexp { $binOp = new Sub($MINUS.line, $MINUS.pos, $a.binOp, $m.mexpExpr); }
	| m = mexp { $binOp = $m.mexpExpr; };
mexp
	returns[Expr mexpExpr]:
	m = mexp TIMES s = sexp {
		$mexpExpr = new Mult($TIMES.line, $TIMES.pos, $m.mexpExpr , $s.sexpValue);
	}
	| m = mexp DIV s = sexp { 
		$mexpExpr = new Div($DIV.line, $DIV.pos, $m.mexpExpr , $s.sexpValue);
	}
	| m = mexp MOD s = sexp { $mexpExpr = new Mod($MOD.line, $MOD.pos,  $m.mexpExpr , $s.sexpValue); 
		}
	| s = sexp {  $mexpExpr = $s.sexpValue; };
sexp
	returns[Expr sexpValue]:
	LOGICALNEGATION sexp { 
		$sexpValue = new Not($LOGICALNEGATION.line, $LOGICALNEGATION.pos, $sexp.sexpValue);
	}
	| LITERAL_TRUE { 
		$sexpValue = new LiteralTrue($LITERAL_TRUE.line,$LITERAL_TRUE.pos);
		
	}
	| LITERAL_FALSE {$sexpValue = new LiteralFalse($LITERAL_FALSE.line,$LITERAL_FALSE.pos);}
	| LITERAL_NULL {
		$sexpValue = new LiteralNull($LITERAL_NULL.line,$LITERAL_NULL.pos);
	}
	| LITERAL_INT {
		$sexpValue = new LiteralInt($LITERAL_INT.line,$LITERAL_INT.pos,Integer.parseInt($LITERAL_INT.text) );
		}
	| LITERAL_FLOAT {
		$sexpValue = new LiteralFloat($LITERAL_FLOAT.line,$LITERAL_FLOAT.pos,Float.parseFloat($LITERAL_FLOAT.text) );
		}
	| LITERAL_CHAR { 
		$sexpValue = new LiteralChar($LITERAL_CHAR.line,$LITERAL_CHAR.pos,$LITERAL_CHAR.text );
	}
	| pexp { $sexpValue = $pexp.value; };
pexp
	returns[LValue value]:
	l = lvalue { $value = $l.node; }
	| OPEN_PARENTHESIS exp CLOSE_PARENTHESIS { $value = new ParenthesisExpression($OPEN_PARENTHESIS.line, $OPEN_PARENTHESIS.pos, $exp.expInstance); 
	}
	| NEW type { 
		NewData newData = new NewData($NEW.line, $NEW.pos, $type.basicType);
	} { 
		$value =  newData;
	}
	| NEW type OPEN_SQUAREBRACKET exp CLOSE_SQUAREBRACKET { 
		$value = new NewArray($NEW.line, $NEW.pos, $type.basicType, $exp.expInstance);
	}
	| ID { 
		FunctionCallArray functionCall = new FunctionCallArray($ID.line, $ID.pos, $ID.text);
	} OPEN_PARENTHESIS (
		exps {
		functionCall.addParams($exps.expressions);
	 }
	)? CLOSE_PARENTHESIS OPEN_SQUAREBRACKET exp { 
		functionCall.setReturnExpr($exp.expInstance);
	} CLOSE_SQUAREBRACKET { 
		$value = functionCall;
	};
lvalue
	returns[LValue node]:
	ID { 
		$node = new ID($ID.line,$ID.pos, $ID.text);	
	}
	| l = lvalue OPEN_SQUAREBRACKET exp CLOSE_SQUAREBRACKET {
		$node = new ArrayPositionAccess($OPEN_SQUAREBRACKET.line,$OPEN_SQUAREBRACKET.pos, $l.node, $exp.expInstance);
	 }
	| l = lvalue DOT ID { 
		$node = new AttributeAccess($DOT.line,$DOT.pos, $l.node, new ID($ID.line,$ID.pos, $ID.text));
	};
exps
	returns[ArrayList<Expr> expressions]:
	{ $expressions = new ArrayList<Expr>(); } e1 = exp {
		$expressions.add($e1.expInstance);
	} (
		COMMA e2 = exp {
		$expressions.add($e2.expInstance);
	}
	)*;

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
LITERAL_TRUE: 'true';
LITERAL_FALSE: 'false';
LITERAL_NULL: 'null';

LITERAL_INT: [0-9]+;
LITERAL_FLOAT: [0-9]* '.' [0-9]+;
LITERAL_CHAR: '\'' ( '\\' [btnr"'\\] | ~[\r\n\\"]) '\'';

ID: [a-z]+ ('_' | [0-9] | [a-zA-Z])*;
TYPE: [A-Z] ('_' | [0-9] | [a-zA-Z])*;

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