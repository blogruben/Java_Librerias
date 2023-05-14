package org.ruben.java.testing;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import junit.framework.TestCase;

//Es preferible tests independientes para el mantenimiento
//pero en caso de no querer repetirnos DRY o crear un objeto muy pesado
//podemos sar una variable estatica, y asegurar el orden de los tests.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DatosDeTestsAnteriores extends TestCase {
    static String referencia;

    @Test
    public void test02Read() {
        Assume.assumeFalse(referencia == null);
        System.out.println("Read - leemos la referencia " + referencia);
    }

    @Test
    public void test03Update() {
        Assume.assumeFalse(referencia == null);
        System.out.println("Update - actualizamos la referencia " + referencia);
    }

    @Test
    public void test01Create() {
        referencia = "1234";
        System.out.println("Create - damos de alta la referencia " + referencia);
    }

    @Test
    public void test04Delete() {
        Assume.assumeFalse(referencia == null);
        System.out.println("Delete - eliminamos la referencia " + referencia);
    }

    // Create - damos de alta la referencia 1234
    // Read - leemos la referencia 1234
    // Update - actualizamos la referencia 1234
    // Delete - eliminamos la referencia 1234

}
