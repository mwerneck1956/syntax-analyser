/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.util;

public class Util {
   public static boolean isInteger(String input) {
      try {
         Integer.parseInt(input);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }

   public static boolean isDouble(String input) {
      try {
         Double.parseDouble(input);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }
}
