package org.ruben.java.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//Procedure es el orden de los tests
public class OrdenarTests {
    
   @BeforeClass  //se ejecuta una vez despues de todos los tests
   public static void beforeClass() {
      System.out.println("antes de todos los test    -> beforeClass()");
   }

   @AfterClass  //se ejecuta una vez despues de tod  -> s los tests
   public static void  afterClass() {
      System.out.println("despues de todos los test  -> afterClass()");
   }

   @Before //despues de cada test
   public void before() {
      System.out.println("antes de cada test         -> before()");
   }
	
   @After //antes de cada test
   public void after() {
      System.out.println("despues de cada test       -> after()");
   }
	
   @Test
   public void testCase1() {
      System.out.println("ejecutando el tests 1      -> testCase1()");
   }

   @Test
   public void testCase2() {
      System.out.println("ejecutando el tests 2      -> testCase2()");
   }
}


//antes de todos los test    -> beforeClass()
//antes de cada test         -> before()
//ejecutando el tests 1      -> testCase1()
//despues de cada test       -> after()
//antes de cada test         -> before()
//ejecutando el tests 2      -> testCase2()
//despues de cada test       -> after()
//despues de todos los test  -> afterClass()
