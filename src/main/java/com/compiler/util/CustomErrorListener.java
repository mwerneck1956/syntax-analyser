
package com.compiler.util;

import org.antlr.v4.runtime.*;

public class CustomErrorListener extends BaseErrorListener {

   private boolean hasError;

   public boolean getHasError() {
      System.out.println("Tem erro  : " + hasError);
      return hasError;
   }

   @Override
   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
         String msg, RecognitionException e) {
      this.hasError = true;

      System.out.println("to aqui");
      System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
   }
}