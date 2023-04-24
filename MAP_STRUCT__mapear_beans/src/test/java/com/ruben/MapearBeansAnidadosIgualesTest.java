package com.ruben;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.ruben.mapper.MapearBeansAnidadosIguales.InnerApellido;
import com.ruben.mapper.MapearBeansAnidadosIguales.PersonaEntity;
import com.ruben.mapper.MapearBeansAnidadosIguales.MapearBeansAnidadosIguales;
import com.ruben.mapper.MapearBeansAnidadosIguales.PersonaDto;


public class MapearBeansAnidadosIgualesTest {

    @Test
    public void givenMapearAnidadosIguales_whenMaps_thenCorrect() {
        InnerApellido innerApellido = new InnerApellido();
        innerApellido.setFirst("Apellido_1");
        innerApellido.setSecond("Apellido2");
        PersonaEntity personalEntity = new PersonaEntity("Ruben",innerApellido);
        MapearBeansAnidadosIguales mapper = Mappers.getMapper( MapearBeansAnidadosIguales.class );
        PersonaDto personaDto = mapper.mapearPersonaEntityToPersonaDto(personalEntity);
        assertEquals(personalEntity.getNombre(),personaDto.getNombre()); 
        assertEquals(personalEntity.getInnerSurname().getFirst(),personaDto.getInnerSurname().getFirst()); 
        assertEquals(personalEntity.getInnerSurname().getSecond(),personaDto.getInnerSurname().getSecond()); 
    }
}
