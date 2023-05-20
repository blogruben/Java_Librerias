package org.ruben.java.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// Runner
public class EjecutarTestsDeOtraClase {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(DatosPreparar.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println("¿Son los tests correctos?  "+result.wasSuccessful());
   }
} 




