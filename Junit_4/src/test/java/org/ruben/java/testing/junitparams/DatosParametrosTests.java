package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.PersonaAge;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.custom.combined.CombinedParameters;

import static org.hamcrest.CoreMatchers.is;

@RunWith(JUnitParamsRunner.class)
public class DatosParametrosTests {

    @Test
    @Parameters({
            "17, false",
            "22, true" })
    public void testPersonaEsMayorDeEdad(int age, boolean valid) throws Exception {
        assertThat(new PersonaAge(age).isAdult(), is(valid));
    }

    @Test
    @Parameters({ "Hola,1", "Adios,2" })
    public void parametrosSeparadosPorComas(String p1, Integer p2) {
        assertThat(p1, Matchers.anyOf(Matchers.is("Hola"), Matchers.is("Adios")));
    }

    @Test
    @Parameters({ "Hola|1", "Adios|2" })
    public void parametrosSeparadosPorBarraVertical(String p1, Integer p2) {
        assertThat(p1, Matchers.anyOf(Matchers.is("Hola"), Matchers.is("Adios")));
    }

    @Test
    @CombinedParameters({ "Hola,Adios", "1|2" })
    public void CombinacionDeSeparaciones(String p1, Integer p2) {
        assertThat(p1, Matchers.anyOf(Matchers.is("Hola"), Matchers.is("Adios")));
    }

}
