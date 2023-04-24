package com.ruben;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mapstruct.factory.Mappers;
import com.ruben.mapper.MapearBeansAnidadosDiferentes.InnerSurname;
import com.ruben.mapper.MapearBeansAnidadosDiferentes.MapearBeansAnidadosDiferentes;
import com.ruben.mapper.MapearBeansAnidadosDiferentes.PersonaDto;
import com.ruben.mapper.MapearBeansAnidadosDiferentes.PersonaEntity;

public class MapearBeansAnidadosDiferentesTest {

    @Test
    public void givenMapearAnidadosDiferentes_whenMaps_thenCorrect() {
        InnerSurname innerApellido = new InnerSurname();
        innerApellido.setFirst("Apellido_1");
        innerApellido.setSecond("Apellido_2");
        PersonaDto personaDto = new PersonaDto("f",innerApellido);
        MapearBeansAnidadosDiferentes mapper = Mappers.getMapper( MapearBeansAnidadosDiferentes.class );
        PersonaEntity personaEntity = mapper.mapear(personaDto);
        assertEquals(personaDto.getName(),personaEntity.getNombre()); 
        assertEquals(personaDto.getInnerSurname().getFirst(),personaEntity.getInnerApellido().getApellido_uno()); 
        assertEquals(personaDto.getInnerSurname().getSecond(),personaEntity.getInnerApellido().getApellido_dos()); 
    }
}
