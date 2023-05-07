package org.ruben.java.testing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// Runner
public class EjecutarTestsDeLaMismaClase {
   public static void main(String[] args) {
      Class<EjecutarTestsDeLaMismaClase> clase = EjecutarTestsDeLaMismaClase.class;
      Result result = JUnitCore.runClasses(clase);
		
      if (result.wasSuccessful()) {
         System.out.println("Tests ejecutados correctamente !!!");
      } else {
         System.out.print("Test ejecutados con errores");
         for (Failure failure : result.getFailures()) {
            System.out.print(", "+failure.getTestHeader());
         }
         System.out.println(" !!!");
      }
   }

   @Test
   public void testCorrect() {
      int valor1 = 2;
      int valor2 = 3;
      double result = valor1 + valor2;
      assertTrue(result == 5);
   }

   @Test
   public void testError() {
      int valor1 = 2;
      int valor2 = 4;
      double result = valor1 + valor2;
      assertTrue(result == 5);
   }


}