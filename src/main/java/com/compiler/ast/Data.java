/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import java.util.ArrayList;

import com.compiler.visitors.Visitable;
import com.compiler.visitors.Visitor;

public class Data implements Visitable {

   ID id;
   ArrayList<Declaration> declarations;

   public Data(ID id, ArrayList<Declaration> declarations) {

      this.id = id;
      this.declarations = declarations;
   }

   public ArrayList<Declaration> getDeclarations() {
      return declarations;
   }

   public void printDataList() {
      for (Declaration d : declarations) {
         System.out.println(d.toString());
      }
   }

   public String getIdName() {
      return id.getName();
   }

   @Override
   public String toString() {
      return this.declarations.toString();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
