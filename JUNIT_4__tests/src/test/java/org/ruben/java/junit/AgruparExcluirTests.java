package org.ruben.java.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.ruben.java.junit.agruparTests.ClaseA;
import org.ruben.java.junit.agruparTests.ClaseB;
import org.ruben.java.junit.agruparTests.TipoDos;
import org.ruben.java.junit.agruparTests.TipoUno;


@RunWith(Categories.class)
@IncludeCategory(TipoDos.class)
@ExcludeCategory(TipoUno.class)
@SuiteClasses({ ClaseA.class, ClaseB.class })
public class AgruparExcluirTests {
  // Los tests ClaseA.testSinTipo() ClaseB.testDeDobleTipo() no se ejecutan.
}

//Salida
//testDeTipoDos()


