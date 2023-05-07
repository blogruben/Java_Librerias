package org.ruben.java.testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Assertions son funciones esticas para hacer comprobaciones
public class ComprobarValores {

   @Test
   public void testAssertions() {
      // test data
      String hello1 = new String("hola");
      String hello2 = new String("hola");
      String null1 = null;
      String adios1 = "adios";
      String adios2 = "adios";

      int dos = 2;
      int tres = 3;

      String[] esperado = { "one", "two", "three" };
      String[] resultado = { "one", "two", "three" };

      assertEquals(hello1, hello2);
      assertEquals("Los Strings deben ser iguales", hello1, hello2);
      assertTrue(dos < tres);
      assertFalse(dos > tres);
      assertNotNull(hello1);
      assertNull(null1);
      assertSame(adios1, adios2);
      assertNotSame(hello1, null1);
      assertArrayEquals(esperado, resultado);
   }

}
