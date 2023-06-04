/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

public class CustomRuntimeException extends Error {

   private int line;
   private int column;

   public CustomRuntimeException(String message, Node astNode) {
      super(message);

      this.line = astNode.getLine();
      this.column = astNode.getCol();
   }

   @Override
   public String getMessage() {
      return "Error ocurred at line  " + line + " and column " + column + " : " + super.getMessage();
   }

   @Override
   public String toString() {
      return "Error ocurred at line  " + line + " and column " + column + " : " + getMessage();

   }

}
