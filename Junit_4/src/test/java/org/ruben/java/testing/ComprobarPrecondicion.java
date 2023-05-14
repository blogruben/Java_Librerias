package org.ruben.java.testing;

import org.junit.Assume;
import org.junit.Test;

//Assertions son funciones esticas para hacer comprobaciones
public class ComprobarPrecondicion {

   @Test
   public void testAssertions() {
      // Precondiciones para ejecutar el test
      Assume.assumeFalse(System.getProperty("os.name").contains("Linux"));
      Assume.assumeTrue(System.getProperty("os.name").contains("Linux"));
   }

}
