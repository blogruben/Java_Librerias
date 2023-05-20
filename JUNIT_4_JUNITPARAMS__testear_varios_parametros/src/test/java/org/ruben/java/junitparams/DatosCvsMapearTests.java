package org.ruben.java.junitparams;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.junitparams.dominio.PersonMapper;
import org.ruben.java.junitparams.dominio.PersonMapperConResultado;
import org.ruben.java.junitparams.dominio.PersonMapperConVariosResultados;
import org.ruben.java.junitparams.dominio.Persona;
import org.ruben.java.junitparams.dominio.ResultadosPerson;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class DatosCvsMapearTests {

    @Test
    @FileParameters(value = "src/test/resources/datosPersonaMapear.csv", mapper = PersonMapper.class)
    public void mapearCVSPersona(Persona person) { 
        assertEquals("Raul",person.getNombre() );
    }

    @Test
    @FileParameters(value = "src/test/resources/personasMapearConResultado.csv", mapper = PersonMapperConResultado.class)
    public void mapearCVSPersonaConResultadoEsperado(Persona person,boolean esMayorEdad) { 
        assertEquals(esMayorEdad, person.isMayorEdad() );
    }

    @Test
    @FileParameters(value = "src/test/resources/personasMapearConVariosResuls.csv", mapper = PersonMapperConVariosResultados.class)
    public void mapearCVSPersonaConVariosResultadoEsperados(Persona person,ResultadosPerson resultadosPerson) { 
        assertEquals(resultadosPerson.getEsMayor(),person.isMayorEdad() );
        assertEquals(resultadosPerson.getNombreCompleto(),person.getNombreCompleto() );
    }
}










