/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

public abstract class Type extends Node {

   public Type(int line, int col) {
      super(line, col);
   }

   public abstract boolean match(Type t);

}
