package com.compiler.ast;

public abstract class LValue extends Expr {
   public LValue(int line, int column) {
      super(line, column);
   }

   public abstract String getId();
}
