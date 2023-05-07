package org.ruben.java.testing;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.ruben.java.testing.TestsParaAgrupar.ClaseA;
import org.ruben.java.testing.TestsParaAgrupar.ClaseB;
import org.ruben.java.testing.TestsParaAgrupar.TipoDos;
import org.ruben.java.testing.TestsParaAgrupar.TipoUno;


@RunWith(Categories.class)
@IncludeCategory(TipoDos.class)
@ExcludeCategory(TipoUno.class)
@SuiteClasses({ ClaseA.class, ClaseB.class })
public class AgruparExcluirTests {
  // Los tests ClaseA.testSinTipo() ClaseB.testDeDobleTipo() no se ejecutan.
}

//Salida
//testDeTipoDos()


