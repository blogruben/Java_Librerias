package org.ruben.java.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.ruben.java.junit.agruparTests.ClaseA;
import org.ruben.java.junit.agruparTests.ClaseB;
import org.ruben.java.junit.agruparTests.TipoDos;


@RunWith(Categories.class)
@IncludeCategory(TipoDos.class)
@SuiteClasses( { ClaseA.class, ClaseB.class }) 
public class AgruparIncludeTests {
  // Se ejecuta todos los tests menos el testSinTipo() que no es del tipo dos
}

//Salida
//testDeTipoDos()
//testDeDobleTipo()