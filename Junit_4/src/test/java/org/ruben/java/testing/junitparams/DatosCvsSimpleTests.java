package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.PersonaAge;
import static org.hamcrest.CoreMatchers.is;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class DatosCvsSimpleTests {

    @Test
    @FileParameters("src/test/resources/datosPersonaSinTitulo.csv")
    public void loadParamsFromCsv(int age, Boolean valido) { 
        assertThat(new PersonaAge(age).isAdult(), is(valido));
    }


    @Test
    @FileParameters(value = "src/test/resources/datosPersonaConTitulo.csv", mapper = CsvWithHeaderMapper.class)
    public void loadParamsFromCsvWithHeader(int id, String name) { }
}










