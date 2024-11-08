package com.compiler.parser;

import java.io.*;
import com.compiler.ast.*;
import org.antlr.v4.runtime.*;
import com.compiler.grammar.*;

// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 
public class SyntaxParser implements ParseAdaptor {

   public SyntaxParser() {
   }

   public Prog parseFile(String path) {
      try {
         CharStream stream = CharStreams.fromFileName(path);

         langLexer lex = new langLexer(stream);
         CommonTokenStream tokens = new CommonTokenStream(lex);
         langParser parser = new langParser(tokens);

         parser.setBuildParseTree(false);
         Prog ast = parser.prog().ast;

         if (parser.getNumberOfSyntaxErrors() == 0)
            return ast;

         return null;
      } catch (Exception err) {
         return null;
      }
   }
}
