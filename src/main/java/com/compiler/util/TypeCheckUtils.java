/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.util;

import com.compiler.typeCheckUtils.STyBool;
import com.compiler.typeCheckUtils.STyChar;
import com.compiler.typeCheckUtils.STyErr;
import com.compiler.typeCheckUtils.STyFloat;
import com.compiler.typeCheckUtils.STyInt;
import com.compiler.typeCheckUtils.SType;

public class TypeCheckUtils {

   public static String createInvalidOperandsErrorMessage(String operator, SType leftType, SType rightType) {
      String errMessage = " Operator " + operator + " do not apply to the types : " + leftType.toString() + " and "
            + rightType.toString();

      return errMessage;

   }

   public static String createEqualErrorMessage(SType leftType, SType rightType) {
      String errMessage = "Cannot compare " + leftType.toString() + " with " + rightType.toString();

      return errMessage;

   }

   public static String createWrongTypeMessage(SType expectedType, SType receivedType) {
      String errMessage = "Expected " + expectedType.toString() + " and received " + receivedType.toString();

      return errMessage;
   }

   public static String createWrongFunctionReturnMessage(SType expectedType, SType receivedType, String functionName) {
      String errMessage = "Function " + functionName + " must return " + expectedType.toString() + " and returned "
            + receivedType.toString();
      return errMessage;
   }

   public static boolean isInstanceOfNumber(SType type) {
      STyInt typeInt = STyInt.newSTyInt();
      STyFloat typeFloat = STyFloat.newSTyFloat();

      return type.match(typeFloat) || type.match(typeInt);
   }

}
