package org.ruben.java.testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// Runner
public class EjecutarTestsDeOtraClase {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(PrepararDatos.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println("¿Son los tests correctos?  "+result.wasSuccessful());
   }
} 




