package com.compiler.ast;

import java.util.HashMap;

public class Prog {
   private HashMap<String, Data> dataList;

   public Prog(HashMap<String, Data> dataList) {

      this.dataList = dataList;

   }

   public void printDataList() {
      for (Data value : dataList.values()) {
         value.printDataList();
      }
   }

   public int interpret(HashMap<String, Integer> Variables) {

      return 0;
   }

}
