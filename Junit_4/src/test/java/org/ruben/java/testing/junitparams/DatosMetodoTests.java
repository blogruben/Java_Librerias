package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.PersonaAge;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.hamcrest.CoreMatchers.is;

@RunWith(JUnitParamsRunner.class)
public class DatosMetodoTests {

    @Test
    @Parameters(method = "adultValues")
    public void personIsAdultConMetodo(int age, boolean valid) throws Exception {
        assertEquals(valid, new PersonaAge(age).isAdult());
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
    public void isAdult(PersonaAge person, boolean valid) throws Exception {
        assertThat(person.isAdult(), is(valid));
    }

    //El prefijo parametersFor delante del nombre del test
    //para enlazar estos datos con metodo isAdult
    private Object[] parametersForIsAdult() {
        return new Object[]{
                     new Object[]{new PersonaAge(13), false},
                     new Object[]{new PersonaAge(17), false},
                     new Object[]{new PersonaAge(18), true},
                     new Object[]{new PersonaAge(22), true}
                };
    }




}
