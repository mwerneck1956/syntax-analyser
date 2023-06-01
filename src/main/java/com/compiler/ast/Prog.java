package com.compiler.ast;

import java.util.HashMap;

import com.compiler.visitors.Visitable;
import com.compiler.visitors.Visitor;

public class Prog implements Visitable {
   private HashMap<String, Data> dataList;
   private HashMap<String, Function> functions;

   public Prog(HashMap<String, Data> dataList, HashMap<String, Function> functions) {
      this.dataList = dataList;
      this.functions = functions;
   }

   public void printDataList() {
      for (Data value : dataList.values()) {
         value.printDataList();
      }

      System.out.println("Functions size : " + this.functions.size());
   }

   @Override
   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public HashMap<String, Function> getFunctions() {
      return functions;
   }

   public HashMap<String, Data> getDataList() {
      return dataList;
   }

}
