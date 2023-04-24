package com.ruben;

import org.junit.Test;
import org.mapstruct.factory.Mappers;
import com.ruben.mapper.MapearPorDefecto.Car;
import com.ruben.mapper.MapearPorDefecto.Coche;
import com.ruben.mapper.MapearPorDefecto.MapearPorDefecto;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class MapearPorDefectoTest {

    @Test
    public void givenMapearPorDefecto_whenMaps_thenCorrect() {
        Car car = new Car();// branch numbre is null
        car.setPrice(23);
        car.setManufacturingDate(new GregorianCalendar(1995, 3, 5));
        MapearPorDefecto mapper = Mappers.getMapper( MapearPorDefecto.class );
        Coche coche = mapper.carToCocheMapear(car);
        
        assertEquals("nombre_sin_definir",coche.getNombre()); // el defaultValue
        assertEquals(0, coche.getPuertas());
        assertEquals("", coche.getDescripcion()); //todos los String nulos se mapean a String vacio
        String expectedTitles[] = {"$23,00","$23.00"};
        List<String> expectedTitlesList = Arrays.asList(expectedTitles);
        assertTrue(expectedTitlesList.contains((coche.getPrecio())));
        assertEquals("05.04.1995", coche.getFechaFabricacion());
        assertNull(car.getId());
        assertNotNull(coche.getId());
    }


}
