package org.ruben.java.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FallarTest {

    @Test
    public void testIncompleto() {
        fail("Aun no esta implementado.");
    }

    @Test
    public void testearCondicion() {
        int aleatorio = (int) Math.random() * 100000;
        if (aleatorio > Integer.MAX_VALUE) {
            fail("El numero maximo no puede exceder el int maximo permitido.");
        }
        // more testing code
    }
}
