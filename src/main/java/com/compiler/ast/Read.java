package com.compiler.ast;

import java.util.HashMap;

public class Read extends Cmd {
   private LValue lvalue;

   public Read(int line, int column, LValue lvalue) {
      super(line, column);
      this.lvalue = lvalue;
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public int interpret(HashMap<String, Integer> Variables) {
      // TODO Auto-generated method stub
      return 0;
   }

}
