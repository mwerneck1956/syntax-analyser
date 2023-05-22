package com.compiler.ast;

import java.util.HashMap;

public class Prog {
   private HashMap<String, Data> dataList;

   public Prog(HashMap<String, Data> dataList) {

      this.dataList = dataList;

   }

   public void printDataList() {
      System.out.println("Imprimindo" + dataList.size());

      // for (Data data : dataList) {
      // System.out.println(data.toString());
      // }
   }

   public int interpret(HashMap<String, Integer> Variables) {

      return 0;
   }

}
