package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.Person;
import org.ruben.java.testing.junitparams.dominio.PersonMapper;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.naming.TestCaseName;

@RunWith(JUnitParamsRunner.class)
public class DatosCvsMapearTests {

    @Test
    @FileParameters(value = "src/test/resources/datosPersonaMapear.csv", mapper = PersonMapper.class)
    public void mapearCVSPersona(Person person) { 
        assertEquals("Raul",person.getName() );
    }



}










