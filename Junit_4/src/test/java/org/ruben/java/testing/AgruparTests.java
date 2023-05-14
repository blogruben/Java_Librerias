package org.ruben.java.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.ruben.java.testing.agruparTests.TestClase1;
import org.ruben.java.testing.agruparTests.TestClase2;

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