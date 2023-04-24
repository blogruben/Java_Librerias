package com.ruben.mapper.MapearMultipleBeans;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapearMultipleBeans {

    @Mapping(source = "identidad.nombre", target = "nombre")
    @Mapping(source = "identidad.apellidos", target = "apellidos")  
    @Mapping(source = "direccion.fulladdress", target = "fulladdress")
    Persona indetityAndDireccionToPersona(Identidad identidad, Direccion direccion);   
 
}

