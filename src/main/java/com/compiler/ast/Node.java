package com.compiler.ast;

import java.util.HashMap;

public abstract class Node {

   private int line, col;

   public Node(int line, int col) {
      this.line = line;
      this.col = col;
   }

   public int getLine() {
      return line;
   }

   public int getCol() {
      return col;
   }

   public abstract int interpret(HashMap<String, Integer> Variables);

}