package com.ruben.mapper.MapeoSimple;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface SimpleMapper {
    //El atributo nombre se mapea tal cual
    @Mapping(source = "apellido", target = "surname")
    PersonaDto simpleEntityToSimpleDto(PersonaEntity simpleEntity);

    @InheritInverseConfiguration //MapStruct will automatica invierte el mapeo de simpleEntityToSimpleDto
    PersonaEntity simpleDtoToSimpleEntity(PersonaDto message);

}

