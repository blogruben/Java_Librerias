package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.Person;
import org.ruben.java.testing.junitparams.dominio.PersonMapper;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class DatosCvsMapearTests {

    @Test
    @FileParameters(value = "src/test/resources/datosPersonaMapear.csv", mapper = PersonMapper.class)
    public void loadParamsFromAnyFile(Person person) { 
        assertEquals("raul",person.getName() );
    }



}










