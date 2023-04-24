package com.ruben;

import org.mapstruct.factory.Mappers;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.ruben.mapper.MapearMultipleBeans.Direccion;
import com.ruben.mapper.MapearMultipleBeans.Identidad;
import com.ruben.mapper.MapearMultipleBeans.MapearMultipleBeans;
import com.ruben.mapper.MapearMultipleBeans.Persona;

public class MapearMultipleBeansTest {

    @Test
    public void givenMapearMUltipleBeans_whenMaps_thenCorrect() {
        Direccion direccion = new Direccion();
        direccion.setFulladdress(null);
        direccion.setCity(null);
        direccion.setCountry(null);
        Identidad identidad = new Identidad();
        identidad.setNombre(null);
        identidad.setApellidos(null);
        identidad.setDNI(null);
        MapearMultipleBeans mapper = Mappers.getMapper( MapearMultipleBeans.class );
        Persona persona = mapper.indetityAndDireccionToPersona(identidad, direccion);

        assertEquals(identidad.getNombre(),persona.getNombre()); 
        assertEquals(identidad.getApellidos(), persona.getApellidos());
        assertEquals(direccion.getFulladdress(), persona.getFulladdress()); 
    }
}
