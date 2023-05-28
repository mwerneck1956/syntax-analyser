package com.compiler.ast;

import java.util.HashMap;

public class Prog {
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

   public int interpret(HashMap<String, Integer> Variables) {
      return 0;
   }

}
