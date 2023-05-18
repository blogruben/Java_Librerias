package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.Persona;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.hamcrest.CoreMatchers.is;

@RunWith(JUnitParamsRunner.class)
public class DatosParametrosTests {

    @Test
    @Parameters({ 
            "17, false", 
            "22, true" })
    public void personIsAdultConValores(int age, boolean valid) throws Exception {
        assertThat(new Persona(age).isAdult(), is(valid));
    }

}










