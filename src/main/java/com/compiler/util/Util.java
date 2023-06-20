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
      System.out.println("Use java -cp . Lang ação <Caminho para código Fonte> ");
      System.out.println("Ação (uma das seguintes possibilidades): ");

      System.out.println(" -bs : Executa uma bateria de testes sintáticos");
      System.out.println(" -bty : Executa uma bateria de testes no sistemas de tipos");
      System.out.println(" -bsm : Executa uma bateria de testes no interpretador");

      System.out.println(" -pp: Pretty print program.");
      System.out.println(" -tp: Verficar tipos e imprimir o ambiente de tipos");
      System.out.println(" -i : Apenas interpretar");

      System.out.println(" -ti: Verificar tipos e depois interpretar");
      System.out.println(" -dti: Verificar tipos, imprimir o ambiente de tipos e depois interpretar");
      System.out.println(
            " -gvz: Create a dot file. (Feed it to graphviz dot tool to generate graphical representation of the AST)");
   }

}
