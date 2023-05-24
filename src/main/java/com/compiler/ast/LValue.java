package com.compiler.ast;

public abstract class LValue extends Node {
   public LValue(int line, int column) {
      super(line, column);
   }
}
