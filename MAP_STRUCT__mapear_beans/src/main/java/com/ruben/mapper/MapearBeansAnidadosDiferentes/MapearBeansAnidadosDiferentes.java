package com.ruben.mapper.MapearBeansAnidadosDiferentes;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper
public interface MapearBeansAnidadosDiferentes {

    @Mapping(target="nombre", source="name")   
    @Mapping(target="innerApellido.apellido_uno", source="innerSurname.first")     
    @Mapping(target="innerApellido.apellido_dos", source="innerSurname.second")   
    PersonaEntity mapear(PersonaDto personaDto);
   
} 


