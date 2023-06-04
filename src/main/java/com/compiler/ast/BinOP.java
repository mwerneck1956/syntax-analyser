/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

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
   public String toString() {
      return null;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}