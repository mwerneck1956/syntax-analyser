package com.compiler.parser;

import com.compiler.ast.*;
import org.antlr.v4.runtime.*;
import com.compiler.grammar.*;
import com.compiler.visitors.TypeCheckVisitor;
import com.compiler.visitors.JavaVisitor;

// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 
public class JavaCodeGenParser implements ParseAdaptor {

   public JavaCodeGenParser() {
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

            if (typeCheckVisitor.getErrors().size() == 0) {

               int lastDotIndex = path.lastIndexOf(".");
               String fileName = path.substring(path.lastIndexOf("/") + 1, lastDotIndex);


               JavaVisitor javaVisitor = new JavaVisitor(fileName, typeCheckVisitor.getDatas(),
                    typeCheckVisitor.getFunctions(), typeCheckVisitor.getEnv(),
                    typeCheckVisitor.getTypesEnvByFunction());

               ast.accept(javaVisitor);

            

               return ast;
            }

            else
               typeCheckVisitor.printErrors();
         }

         return null;
      } catch (Exception err) {
         return null;
      }
   }
}
