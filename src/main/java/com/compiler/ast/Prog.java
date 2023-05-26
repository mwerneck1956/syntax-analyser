package com.compiler.ast;

import java.util.HashMap;

import javax.sound.sampled.DataLine;

public class Prog {
   private HashMap<String, Data> dataList;
   private Function function;

   public Prog(HashMap<String, Data> dataList, Function function) {
      this.dataList = dataList;
      this.function = function;

      // System.out.println("Created new prog : " + function);
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
