package com.compiler.ast;

public abstract class Cmd extends Node {

   public Cmd(int line, int column) {
      super(line, column);
   }

   public abstract String toString();

}