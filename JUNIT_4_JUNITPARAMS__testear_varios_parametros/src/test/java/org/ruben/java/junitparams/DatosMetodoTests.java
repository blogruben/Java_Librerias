package org.ruben.java.junitparams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.junitparams.dominio.PersonaAge;

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


    @Test
    @Parameters(method = "mixedParameters")
    public void usageOfMultipleTypesOfParameters(
            boolean booleanValue, int[] primitiveArray, String stringValue, String[] stringArray) {

        assertEquals(true, booleanValue);
        assertEquals("Test", stringValue);

    }

    public Object mixedParameters() {
        boolean booleanValue = true;
        int[] primitiveArray = { 1, 2, 3 };
        String stringValue = "Test";
        String[] stringArray = { "one", "two", null };
        return new Object[] {
                new Object[] { booleanValue, primitiveArray, stringValue, stringArray },
        };

    }


}
