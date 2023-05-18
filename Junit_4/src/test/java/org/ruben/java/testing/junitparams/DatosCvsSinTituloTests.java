package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.PersonaAge;
import static org.hamcrest.CoreMatchers.is;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class DatosCvsSinTituloTests {

    @Test
    @FileParameters("src/test/resources/datosPersonaSin.csv")
    public void loadParamsFromCsv(int age, Boolean valido) { 
        assertThat(new PersonaAge(age).isAdult(), is(valido));
    }

}










