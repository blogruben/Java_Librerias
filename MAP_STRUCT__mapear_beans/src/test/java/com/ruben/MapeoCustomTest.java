package com.ruben;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.ruben.mapper.MapeoCustom.Persona;
import com.ruben.mapper.MapeoCustom.FechaDto;
import com.ruben.mapper.MapeoCustom.FechaEntity;
import com.ruben.mapper.MapeoCustom.MapeoCustom;
import com.ruben.mapper.MapeoCustom.PersonaDto;

import static org.junit.Assert.assertEquals;
import java.util.Calendar;

public class MapeoCustomTest {
    
    //mapeamos a mano la clase
    @Test
    public void givenMapeoCustom_whenMaps_thenCorrect() {
        FechaEntity personaEntity = new FechaEntity(1995, 03, 20);
        MapeoCustom mapper = Mappers.getMapper( MapeoCustom.class );
        FechaDto fechaDto = mapper.fechaEntityToFechaDtomapear(personaEntity);
        
        Calendar calendarioEntity = Calendar.getInstance();
        calendarioEntity.set(Calendar.YEAR, personaEntity.getAnioNacimiento());
        calendarioEntity.set(Calendar.MONTH, personaEntity.getMesNacimiento());
        calendarioEntity.set(Calendar.DATE, personaEntity.getDiaNacimiento());

        Calendar calendarioDto = Calendar.getInstance();
        calendarioDto.setTime(fechaDto.getFecha());

        assertEquals(calendarioDto.get(Calendar.YEAR), calendarioDto.get(Calendar.YEAR));
        assertEquals(calendarioDto.get(Calendar.MONTH), calendarioDto.get(Calendar.MONTH));
        assertEquals(calendarioDto.get(Calendar.DAY_OF_MONTH), calendarioDto.get(Calendar.DAY_OF_MONTH));
    }


    //solo mapeamos un campo a mano
    @Test
    public void givenMapeoPersona_whenMaps_thenCorrect() {

        Persona persona = new Persona();
        persona.setNombre("ruben");
        persona.setAlturaCentimetros(186);
        MapeoCustom mapper = Mappers.getMapper( MapeoCustom.class );
        PersonaDto personaDto = mapper.userBodyValuesMapper(persona);
        

        assertEquals(persona.getNombre(), personaDto.getNombre());
        assertEquals(Double.valueOf(persona.getAlturaCentimetros()/100), personaDto.getAlturaMetros());
    }


    
}
