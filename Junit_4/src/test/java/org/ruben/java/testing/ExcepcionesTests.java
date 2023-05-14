package org.ruben.java.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExcepcionesTests {
    Calcular calcular = new Calcular("centimetros");

    @Test()
    public void dividirEntreDos_Correcto() {
        assertEquals("2 centimetros", calcular.dividir(4, 2));
    }

    // Coprobamos que devueleve esta excepcion
    @Test(expected = ArithmeticException.class)
    public void dividirEntreCero_Error1() {
        calcular.dividir(4, 0);
    }

    @Test
    public void dividirEntreCero_Error2() {
        try {
            calcular.dividir(4, 0);
        } catch (ArithmeticException e) {
            assertNotNull(e);
        }
    }

}

class Calcular {
    private String unidades;

    Calcular(String message) {
        this.unidades = message;
    }

    String dividir(int nominador, int denominador) {
        return nominador / denominador + " " + unidades;
    }

}