/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import java.util.ArrayList;
import com.compiler.visitors.Visitor;

public class FunctionCallArray extends LValue {
   private String functionName;
   private ArrayList<Expr> params;
   private Expr returnExpr;

   public FunctionCallArray(int line, int column, String functionName) {
      super(line, column);
      this.functionName = functionName;
      this.params = new ArrayList<Expr>();
      this.returnExpr = null;
   }

   public void addParams(ArrayList<Expr> lvalue) {
      this.params = lvalue;
   }

   public String getFunctionName() {
      return functionName;
   }

   @Override
   public String toString() {
      return "";
   }

   public ArrayList<Expr> getParams() {
      return params;
   }

   public void setReturnExpr(Expr returnExpr) {
      this.returnExpr = returnExpr;
   }

   public Expr getReturnExpr() {
      return returnExpr;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   @Override
   public String getId() {
      return this.getId();
   }

}
