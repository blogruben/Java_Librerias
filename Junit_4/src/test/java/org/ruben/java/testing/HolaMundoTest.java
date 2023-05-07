package org.ruben.java.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HolaMundoTest {
    Trabajador employee = new Trabajador();
 
    @Test
    public void testSalarioAnual() {
        employee.nombre = "Pepito";
        employee.edad = 25 ;
        employee.salarioMensual = 8000;
         
       double salary = employee.getSalarioAnual(employee);
       assertEquals(96000, salary, 0.0);
    }
 }


class Trabajador {
    String nombre;
    double salarioMensual;
    int edad;

    double getSalarioAnual(Trabajador trabajador) {
        double salarioAnual = 0;
        salarioAnual = trabajador.salarioMensual * 12;
        return salarioAnual;
    }
}


