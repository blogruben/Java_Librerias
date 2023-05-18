package org.ruben.java.testing.junitparams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ruben.java.testing.junitparams.dominio.PersonProvider;
import org.ruben.java.testing.junitparams.dominio.Persona;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.hamcrest.CoreMatchers.is;

@RunWith(JUnitParamsRunner.class)
public class DatosClaseTest {

    @Test
    @Parameters(source = PersonProvider.class)
    public void personIsAdult(Persona person, boolean valid) {
        assertThat(person.isAdult(), is(valid));
    }

}


