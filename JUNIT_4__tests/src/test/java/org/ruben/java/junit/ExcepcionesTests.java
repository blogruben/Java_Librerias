package org.ruben.java.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcepcionesTests {
    Calcular calcular = new Calcular("centimetros");

    @Test()
    public void dividirEntreDos_Correcto() {
        assertEquals("2 centimetros", calcular.dividir(4, 2));
    }

    // Comprobamos que devueleve esta excepcion
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

    @Rule
    public ExpectedException exceptionEsperada = ExpectedException.none();

    @Test
    public void GivenMultiplicarPositivos_WhenMultiplicoPorNumeroNegativo_ThenIllegalArgumentException() {
        exceptionEsperada.expect(IllegalArgumentException.class);
        exceptionEsperada.expectMessage("No se permiten valores negativos.");
        calcular.multiplicarPositivos(-1, 3);
    }

}

class Calcular {
    private String unid;

    Calcular(String unidades) {
        this.unid = unidades;
    }

    String dividir(int nom, int deno) {
        return nom / deno + " " + unid;
    }

    public int multiplicarPositivos(int i, int j) {
        if (i < 0 || j < 0)
            throw new IllegalArgumentException("ERROR -> No se permiten valores negativos.");
        return i * j;
    }
}
