/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/
package com.compiler;

import org.antlr.v4.runtime.*;
import com.compiler.grammar.*;
import com.compiler.parser.SemanticalParser;
import com.compiler.parser.SyntaxParser;
import com.compiler.parser.TestParser;
import com.compiler.visitors.InterpretVisitor;
import com.compiler.visitors.TypeCheckVisitor;
import com.compiler.util.Util;
import com.compiler.ast.*;

public class App {

    public static void main(String args[]) throws Exception {
        if (args.length == 0)
            Util.printMenu();

        SyntaxParser syntaxParser = new SyntaxParser();
        SemanticalParser semanticalParser = new SemanticalParser();

        if (args[0].equals("-bs")) {
            System.out.println("Executando bateria de testes sintáticos:");
            TestParser tp = new TestParser(syntaxParser, null);
            return;
        }

        if (args[0].equals("-byt")) {
            System.out.println("Executando bateria de testes semânticos:");
            TestParser tp = new TestParser(semanticalParser, "semantica/certo");
            return;
        } else {
            CharStream stream = CharStreams.fromFileName(args[0]);

            langLexer lex = new langLexer(stream);

            CommonTokenStream tokens = new CommonTokenStream(lex);
            langParser parser = new langParser(tokens);

            parser.setBuildParseTree(false);
            // parser.prog();

            if (parser.getNumberOfSyntaxErrors() == 0) {
                Prog ast = parser.prog().ast;

                TypeCheckVisitor typeCheckVisitor = new TypeCheckVisitor();
                ast.accept(typeCheckVisitor);

                if (typeCheckVisitor.getErrors().size() == 0) {
                    InterpretVisitor visitor = new InterpretVisitor();
                    ast.accept(visitor);
                } else {
                    typeCheckVisitor.printErrors();
                    throw new Exception("The program has semantical errors");
                }

            }
        }

    }
}
