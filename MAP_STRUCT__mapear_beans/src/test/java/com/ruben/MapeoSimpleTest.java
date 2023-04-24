package com.ruben;

import org.junit.Test;
import org.mapstruct.factory.Mappers;
import com.ruben.mapper.MapeoSimple.SimpleMapper;
import com.ruben.mapper.MapeoSimple.PersonaDto;
import com.ruben.mapper.MapeoSimple.PersonaEntity;
import static org.junit.Assert.assertEquals;

public class MapeoSimpleTest {

    @Test
    public void givenSimpleMap_whenMaps_thenCorrect() {
        PersonaEntity personaEntity = new PersonaEntity("ruben", "lopez");
        SimpleMapper mapper = Mappers.getMapper( SimpleMapper.class );
        PersonaDto personDto = mapper.simpleEntityToSimpleDto(personaEntity);
        assertEquals(personDto.getNombre(), personaEntity.getNombre());
        assertEquals(personDto.getSurname(), personaEntity.getApellido());
    }

    @Test
    public void givenSimpleMap_whenInverseMaps_thenCorrect() {
        PersonaDto personaDto = new PersonaDto("ruben", "lopez");
        SimpleMapper mapper = Mappers.getMapper( SimpleMapper.class );
        PersonaEntity personaEntity = mapper.simpleDtoToSimpleEntity(personaDto);
        assertEquals(personaEntity.getNombre(), personaDto.getNombre());
        assertEquals(personaEntity.getApellido(), personaDto.getSurname());
    }



}
