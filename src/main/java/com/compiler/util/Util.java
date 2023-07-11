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

   public static void printMenu() {
      System.out.println("Lang compiler v 0.0.1 - Maio de 2020");
      System.out.println("Use ./run-project.sh <Caminho para código Fonte> para rodar um arquivo especifico");
      System.out.println("Ação (uma das seguintes possibilidades): ");

      System.out.println(" -bs : Executa uma bateria de testes sintáticos");
      System.out.println(" -bty : Executa uma bateria de testes no sistemas de tipos");
   }

   public static boolean isBasicDataType(String type) {
      return type == "Int" || type == "Float" || type == "Bool";
   }

   public static String firstCharToLowercase(String str) {
      if (str == null || str.isEmpty()) {
         return str;
      }

      char firstChar = str.charAt(0);
      char lowerFirstChar = Character.toLowerCase(firstChar);

      return lowerFirstChar + str.substring(1);
   }

}
