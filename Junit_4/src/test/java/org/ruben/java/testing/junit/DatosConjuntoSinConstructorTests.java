package org.ruben.java.testing.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class DatosConjuntoSinConstructorTests {

    //@Parameter tienen que ser public
    //Tenemos el orden para la coleccion, no necesitamos constructor
    @Parameter(0)
    public int m1;
    @Parameter(1)
    public int m2;
    @Parameter(2)
    public int result;


    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 , 2, 2 }, { 0, 2, 0 }, { 32, 4, 128 } };
        return Arrays.asList(data);
    }


    @Test
    public void testMultiplyException() {
        Operaciones tester = new Operaciones();
        assertEquals(result, tester.multiplicar(m1, m2));
    }


    // class to be tested
    class Operaciones {
        public int multiplicar(int primero, int segundo) {
            return primero * segundo;
        }
    }

}