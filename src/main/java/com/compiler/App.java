package com.compiler;

import org.antlr.v4.runtime.*;
import com.compiler.grammar.*;
import com.compiler.visitors.InterpretVisitor;
import com.compiler.ast.*;

public class App {

    public static void main(String args[]) throws Exception {
        CharStream stream = CharStreams.fromFileName(args[0]);

        langLexer lex = new langLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lex);
        langParser parser = new langParser(tokens);

        parser.setBuildParseTree(false);

        Prog ast = parser.prog().ast;

        InterpretVisitor visitor = new InterpretVisitor();

        ast.accept(visitor);
        // ast.printDataList();

    }
}
