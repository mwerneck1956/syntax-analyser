/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import java.util.ArrayList;
import com.compiler.visitors.Visitor;

public class Return extends Cmd {

   private ArrayList<Expr> returnedExprs;

   public Return(int line, int col) {
      super(line, col);
      this.returnedExprs = new ArrayList<>();
   }

   public String toString() {
      return this.returnedExprs.toString();
   }

   public void addExpr(Expr expr) {
      this.returnedExprs.add(expr);
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public ArrayList<Expr> getReturnedExprs() {
      return returnedExprs;
   }

}
