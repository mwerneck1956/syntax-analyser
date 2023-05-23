package com.compiler.ast;

public abstract class Expr extends Node {

   public Expr(int line, int column) {
      super(line, column);
   }

   public abstract String toString();

}