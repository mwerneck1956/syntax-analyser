package com.compiler.parser;

import java.io.*;
import com.compiler.ast.*;
import org.antlr.v4.runtime.*;
import com.compiler.grammar.*;
import com.compiler.visitors.TypeCheckVisitor;

// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 
public class SemanticalParser implements ParseAdaptor {

   public SemanticalParser() {
   }

   public Prog parseFile(String path) {
      try {
         CharStream stream = CharStreams.fromFileName(path);

         langLexer lex = new langLexer(stream);
         CommonTokenStream tokens = new CommonTokenStream(lex);
         langParser parser = new langParser(tokens);

         parser.setBuildParseTree(false);
         Prog ast = parser.prog().ast;

         if (parser.getNumberOfSyntaxErrors() == 0) {
            TypeCheckVisitor typeCheckVisitor = new TypeCheckVisitor();

            ast.accept(typeCheckVisitor);

            if (typeCheckVisitor.getErrors().size() == 0)
               return ast;
            else
               typeCheckVisitor.printErrors();
         }

         return null;
      } catch (Exception err) {
         return null;
      }
   }
}
