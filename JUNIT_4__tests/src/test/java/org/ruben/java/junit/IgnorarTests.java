package org.ruben.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class IgnorarTests {

    @Ignore
    @Test
    public void testPepito() {
        // no se ejecuta
        String message = "Pepito";
        assertEquals("Pepito", message);
    }

    @Ignore("Test innecesio porque la funcion ya no es invocada.")
    @Test
    public void testManolito() {
        String message = "Manolito";
        assertEquals("Manolito", message);
    }

    @Test
    public void testRutaWindows() {
        // no debe contenen la palabra lunix, para ejecutar el test
        // en caso contrario se ignora
        Assume.assumeFalse(System.getProperty("os.name").contains("Linux"));
        String message = "C:/user";
        assertEquals("C:/user", message);
    }

    @Test
    public void testRutaLinux() {
        // debe contenen la palabra lunix, para ejecutarse
        Assume.assumeTrue(System.getProperty("os.name").contains("Linux"));

        String message = "var/mnt";
        assertEquals("var/mnt", message);
    }

    @Test
    public void testJuanito() {
        String message = "Juanito";
        assertEquals("Juanito", message);
    }
}
