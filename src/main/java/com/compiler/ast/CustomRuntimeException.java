package com.compiler.ast;

public class CustomRuntimeException extends Error {

   private int line;
   private int column;

   public CustomRuntimeException(String message, int line, int column) {
      super(message);

      this.line = line;
      this.column = column;
   }

   @Override
   public String getMessage() {
      return "Error ocurred at line  " + line + " and column " + column + " :" + super.getMessage();
   }

   @Override
   public String toString() {
      return "Error ocurred at line  " + line + " and column " + column + " :" + getMessage();

   }

}
