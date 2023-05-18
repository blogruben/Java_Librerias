package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.Persona;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.hamcrest.CoreMatchers.is;

@RunWith(JUnitParamsRunner.class)
public class DatosMetodoTests {



    @Test
    @Parameters(method = "adultValues")
    public void personIsAdultConMetodo(int age, boolean valid) throws Exception {
        assertEquals(valid, new Persona(age).isAdult());
    }
    
    private Object[] adultValues() {
        return new Object[]{
                     new Object[]{13, false},
                     new Object[]{17, false},
                     new Object[]{18, true},
                     new Object[]{22, true}
                };
    }

    @Test
    @Parameters
    public void isAdult(Persona person, boolean valid) throws Exception {
        assertThat(person.isAdult(), is(valid));
    }

    //El prefijo parametersFor delante del nombre del test
    //para enlazar estos datos con metodo isAdult
    private Object[] parametersForIsAdult() {
        return new Object[]{
                     new Object[]{new Persona(13), false},
                     new Object[]{new Persona(17), false},
                     new Object[]{new Persona(18), true},
                     new Object[]{new Persona(22), true}
                };
    }




}
