package com.ruben.mapper.MapearBeansAnidadosIguales;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

//quitamos el warning de que se mapean atributos automaticamente porque se llaman igual
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapearBeansAnidadosIguales {

   
    //al llamarse igual los atributos, no definimos ninguna conversion
    PersonaDto mapearPersonaEntityToPersonaDto(PersonaEntity complexEntity);

} 


