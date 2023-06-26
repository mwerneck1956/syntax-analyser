/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import java.util.HashMap;
import java.util.ArrayList;
import com.compiler.visitors.Visitable;
import com.compiler.visitors.Visitor;

public class Prog implements Visitable {
   private ArrayList<Data> dataList;
   private ArrayList<Function> functions;

   public Prog(ArrayList<Data> dataList, ArrayList<Function> functions) {
      this.dataList = dataList;
      this.functions = functions;
   }

   public void printDataList() {
      for (Data value : dataList) {
         value.printDataList();
      }

      System.out.println("Functions size : " + this.functions.size());
   }

   @Override
   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public ArrayList<Function> getFunctions() {
      return functions;
   }

   public ArrayList<Data> getDataList() {
      return dataList;
   }

}
