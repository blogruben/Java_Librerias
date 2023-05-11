package org.ruben.java.json.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.ruben.java.json.propiedadesPorSecciones.SECCION_1;
import org.ruben.java.json.propiedadesPorSecciones.SECCION_2;

public class RecursosJsonTest {

    @Test
    public void testMapeoEtiquetas() {
        System.out.println("testAssertions()");

           assertEquals("clientes",SECCION_1.NOMBRE.getValor());
           assertEquals("25",SECCION_1.TIPO.getValor());
           assertEquals("integracion",SECCION_1.ENTORNO.getValor());
           assertEquals("digital",SECCION_1.FORMATO.getValor());

           assertEquals("formato parte 1",SECCION_2.FORMATO_PARTE_1.getClave());
           assertEquals("array",SECCION_2.FORMATO_PARTE_1.getValor());
           assertEquals("listado",SECCION_2.FORMATO_PARTE_2.getValor());

     }
}