/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/
package com.compiler;

import org.antlr.v4.runtime.*;
import com.compiler.grammar.*;
import com.compiler.visitors.InterpretVisitor;
import com.compiler.visitors.TypeCheckVisitor;
import com.compiler.ast.*;

public class App {

    public static void main(String args[]) throws Exception {
        CharStream stream = CharStreams.fromFileName(args[0]);

        langLexer lex = new langLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lex);
        langParser parser = new langParser(tokens);

        parser.setBuildParseTree(false);

        if (parser.getNumberOfSyntaxErrors() == 0) {
            Prog ast = parser.prog().ast;

            TypeCheckVisitor typeCheckVisitor = new TypeCheckVisitor();
            ast.accept(typeCheckVisitor);

            if (typeCheckVisitor.getErrors().size() == 0) {
                InterpretVisitor visitor = new InterpretVisitor();

                ast.accept(visitor);
            } else {
                typeCheckVisitor.printErrors();
                throw new Exception("The program have a sytantical error");
            }

        }
    }
}
