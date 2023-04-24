package com.ruben.mapper.MapearPorDefecto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT, 
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT //en caso de nulo ponemos el valor por defecto
)
public interface MapearPorDefecto {

    @Mapping(source = "brand", target = "nombre", defaultValue = "nombre_sin_definir")
    @Mapping(source = "numbreDoors", target = "puertas")
    @Mapping(source = "price", target = "precio", numberFormat = "$#.00")
    @Mapping(source = "manufacturingDate", target = "fechaFabricacion", dateFormat = "dd.MM.yyyy")
    @Mapping(source = "id", target = "id", defaultExpression = "java(java.util.UUID.randomUUID().toString())")//si es nulo
    Coche carToCocheMapear(Car car);

    //mapeamos los String nulos por String vacio
    default String mapEmptyString(String string) {
        return string != null && !string.isEmpty() ? string : "";
    }
} 


