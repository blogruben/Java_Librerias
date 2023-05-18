package org.ruben.java.testing.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//Parameterized Test
@RunWith(Parameterized.class)
public class DatosConjuntoConConstructor {
    private Integer numeroDeEntrada;
    private Boolean resultadoEsperado;
    private Primos primos;

    @Before
    public void initialize() {
        primos = new Primos();
    }

    //Usamos constructor para los parametros de la coleccion
    public DatosConjuntoConConstructor(Integer numeroDeEntrada, Boolean resultadoEsperado) {
        this.numeroDeEntrada = numeroDeEntrada;
        this.resultadoEsperado = resultadoEsperado;
     }

     @Parameterized.Parameters
     public static Collection<Object[]> datosDePrueba() {
        return Arrays.asList(new Object[][] {
           { 2, true },
           { 6, false },
           { 19, true },
           { 22, false },
           { 23, true }
        });
     }

   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + numeroDeEntrada);
      assertEquals(resultadoEsperado, primos.esPrimo(numeroDeEntrada));
   }

//Parameterized Number is : 2
//Parameterized Number is : 6
//Parameterized Number is : 19
//Parameterized Number is : 22
//Parameterized Number is : 23

}

class Primos {
    public Boolean esPrimo(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}