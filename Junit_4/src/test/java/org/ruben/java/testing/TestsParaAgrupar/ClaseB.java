package org.ruben.java.testing.TestsParaAgrupar;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category({TipoDos.class, TipoUno.class})
public class ClaseB {
  @Test
  public void testDeDobleTipo() {
    System.out.println("testDeDobleTipo()");
  }
}