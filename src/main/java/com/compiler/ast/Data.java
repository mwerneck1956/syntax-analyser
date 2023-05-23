package com.compiler.ast;

import java.util.ArrayList;
import java.util.HashMap;

public class Data {

   ID id;
   ArrayList<Declaration> declarations;

   public Data(ID id, ArrayList<Declaration> declarations) {

      this.id = id;
      this.declarations = declarations;
   }

   public int interpret(HashMap<String, Integer> Variables) {
      return 0;
   }

   public void printDataList() {
      for (Declaration d : declarations) {
         System.out.println(d.toString());
      }
   }

   @Override
   public String toString() {
      return this.declarations.toString();
   }
}
