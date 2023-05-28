package com.compiler.ast;

import com.compiler.visitors.Visitable;

public abstract class Node implements Visitable {

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

}