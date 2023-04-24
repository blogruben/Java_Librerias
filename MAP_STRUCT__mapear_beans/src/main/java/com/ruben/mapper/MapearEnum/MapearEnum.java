package com.ruben.mapper.MapearEnum;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ValueMapping;

@Mapper
public interface MapearEnum {

    @Mapping( target = "color", source = "colour" )
    @Mapping( target = "tamanio", source = "size" )
    TipoString mapTipoNumToTipoString(TipoNum tipoNum);


    @ValueMapping(target = "SPECIAL", source = "EXTRA")         //ValueMapping para mapear valores de un enum por otro
    @ValueMapping(target = "DEFAULT", source = "STANDARD")
    @ValueMapping(target = "DEFAULT", source = "NORMAL")
    OrdenExterior mapearOrdenToOrdenExterior(Orden orderType);
}
