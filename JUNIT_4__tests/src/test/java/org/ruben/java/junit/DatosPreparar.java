package org.ruben.java.junit;

import org.junit.Test;

import junit.framework.TestCase;

//Fixture pone los objecto para pasar los tests
public class DatosPreparar extends TestCase { // para poder sobrescribir el inicio con setUp y el final con tearDown
    protected Persona persona;

    // iniciamos antes de procesar
    @Override
    protected void setUp() {
        persona = new Persona();
        persona.nombre = "Pepito";
        System.out.println("Persona es -> " + persona);
    }

    @Test
    public void testPepito() {
        assertEquals(persona.nombre, "Pepito");
    }

    // ejecutamos despues de procesar
    @Override
    protected void tearDown() {
        persona = null;
        System.out.println("Persona es -> " + persona);
    }

}

class Persona {
    String nombre;

    @Override
    public String toString() {
        return "Me llamo " + nombre;
    }
}
