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
import com.compiler.parser.JavaCodeGenParser;
import com.compiler.visitors.JasminVisitor;
import com.compiler.visitors.JavaVisitor;
import com.compiler.visitors.TypeCheckVisitor;
import com.compiler.util.Util;
import com.compiler.ast.*;

public class App {

    public static void main(String args[]) throws Exception {
        if (args.length == 0)
            Util.printMenu();

        SyntaxParser syntaxParser = new SyntaxParser();
        SemanticalParser semanticalParser = new SemanticalParser();
        JavaCodeGenParser javaCodeGenParser = new JavaCodeGenParser();

        if (args[0].equals("-bs")) {
            System.out.println("Executando bateria de testes sintáticos:");
            new TestParser(syntaxParser, null);
            return;
        }

        if (args[0].equals("-byt")) {
            System.out.println("Executando bateria de testes semânticos:");
            new TestParser(semanticalParser, "semantica/certo");
            return;
        }

        if (args[0].equals("-s")) {
            System.out.println("Gerando código para java");
            new TestParser(javaCodeGenParser, "semantica/certo");
        }

        else {
            try {
                CharStream stream = CharStreams.fromFileName(args[0]);

                langLexer lex = new langLexer(stream);

                CommonTokenStream tokens = new CommonTokenStream(lex);
                langParser parser = new langParser(tokens);

                parser.setBuildParseTree(false);
                Prog ast = parser.prog().ast;

                if (parser.getNumberOfSyntaxErrors() == 0) {
                    TypeCheckVisitor typeCheckVisitor = new TypeCheckVisitor();
                    ast.accept(typeCheckVisitor);

                    if (typeCheckVisitor.getErrors().size() == 0) {
                        JavaVisitor javaVisitor = new JavaVisitor("teste", typeCheckVisitor.getDatas(),
                                typeCheckVisitor.getFunctions(), typeCheckVisitor.getEnv(),
                                typeCheckVisitor.getTypesEnvByFunction());

                        JasminVisitor jasminVisitor = new JasminVisitor("teste", typeCheckVisitor.getDatas(),
                                typeCheckVisitor.getFunctions(), typeCheckVisitor.getEnv(),
                                typeCheckVisitor.getTypesEnvByFunction());

                        ast.accept(javaVisitor);

                        // InterpretVisitor visitor = new InterpretVisitor();
                        // ast.accept(visitor);
                    } else {
                        System.err.println("Aborting due semantical errors");
                        typeCheckVisitor.printErrors();
                    }
                } else {
                    System.err.println("Aborting due to Syntax errors");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
