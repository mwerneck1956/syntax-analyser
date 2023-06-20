
package com.compiler.util;

import org.antlr.v4.runtime.*;

public class CustomErrorListener extends BaseErrorListener {
   private int syntaxErrors = 0;

   @Override
   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
         String msg, RecognitionException e) {
      syntaxErrors++;
   }

   public int getSyntaxErrors() {
      return syntaxErrors;
   }
}