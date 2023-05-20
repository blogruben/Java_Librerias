package org.ruben.java.junit.agruparTests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ClaseA {
    @Test
    public void testSinTipo() {
      System.out.println("testSinTipo()");
    }
  
    @Category(TipoDos.class)
    @Test
    public void testDeTipoDos() {
      System.out.println("testDeTipoDos()");
    }
  }
  

