package com.compiler.ast;

public abstract class Expression extends Node {

   public Expression(int line, int column) {
      super(line, column);
   }

}
