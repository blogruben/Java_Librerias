package org.ruben.java.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.ruben.java.junit.agruparTests.TestClase1;
import org.ruben.java.junit.agruparTests.TestClase2;

@RunWith(Suite.class)
@Suite.SuiteClasses({
                TestClase1.class,
                TestClase2.class
})

// Suite permite agrupar tests de diferentes clases.
public class AgruparTests {
}


//Salida
// testClase1
// testClase2