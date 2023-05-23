package com.compiler.ast;

import java.util.HashMap;

public class BinOP extends Expr {
   private Expr left;
   private Expr right;

   public BinOP(int lin, int col, Expr left, Expr right) {
      super(lin, col);
      this.left = left;
      this.right = right;
   }

   public void setLeft(Expr n) {
      left = n;
   }

   public void setRight(Expr n) {
      right = n;
   }

   public Expr getLeft() {
      return left;
   }

   public Expr getRight() {
      return right;
   }

   @Override
   public int interpret(HashMap<String, Integer> Variables) {

      return 0;
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return null;
   }

}