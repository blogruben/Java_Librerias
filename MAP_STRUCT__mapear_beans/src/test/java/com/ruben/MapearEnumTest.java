package com.ruben;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.ruben.mapper.MapearEnum.Colour;
import com.ruben.mapper.MapearEnum.MapearEnum;
import com.ruben.mapper.MapearEnum.Orden;
import com.ruben.mapper.MapearEnum.OrdenExterior;
import com.ruben.mapper.MapearEnum.Size;
import com.ruben.mapper.MapearEnum.TipoNum;
import com.ruben.mapper.MapearEnum.TipoString;

public class MapearEnumTest {


    @Test
    public void givenMapearClaseConEnum_whenMaps_thenCorrect() {
        TipoNum tipoNum = new TipoNum();
        tipoNum.setSize(Size.MIDDLE);
        tipoNum.setColour(Colour.RED);
        MapearEnum mapper = Mappers.getMapper( MapearEnum.class );
        TipoString tipoString = mapper.mapTipoNumToTipoString(tipoNum);

        assertEquals("RED",tipoString.getColor()); 
        assertEquals("MIDDLE", tipoString.getTamanio());
    }
    
    
    @Test
    public void givenMapearOrdenRetail_whenMaps_thenCorrect() {
        MapearEnum mapper = Mappers.getMapper( MapearEnum.class );
        OrdenExterior ordenExterior = mapper.mapearOrdenToOrdenExterior(Orden.RETAIL);
        assertEquals("RETAIL",ordenExterior.name()); 
    }


    @Test
    public void givenMapearOrdenB2B_whenMaps_thenCorrect() {
        MapearEnum mapper = Mappers.getMapper( MapearEnum.class );
        OrdenExterior ordenExterior = mapper.mapearOrdenToOrdenExterior(Orden.B2B);
        assertEquals("B2B",ordenExterior.name()); 
    }


    @Test
    public void givenMapearOrdenExtra_whenMaps_thenCorrect() {
        MapearEnum mapper = Mappers.getMapper( MapearEnum.class );
        OrdenExterior ordenExterior = mapper.mapearOrdenToOrdenExterior(Orden.EXTRA);
        assertEquals("SPECIAL",ordenExterior.name()); 
    }


    @Test
    public void givenMapearOrdenStandard_whenMaps_thenCorrect() {
        MapearEnum mapper = Mappers.getMapper( MapearEnum.class );
        OrdenExterior ordenExterior = mapper.mapearOrdenToOrdenExterior(Orden.STANDARD);
        assertEquals("DEFAULT",ordenExterior.name()); 
    }
    

    @Test
    public void givenMapearOrdenNormal_whenMaps_thenCorrect() {
        MapearEnum mapper = Mappers.getMapper( MapearEnum.class );
        OrdenExterior ordenExterior = mapper.mapearOrdenToOrdenExterior(Orden.NORMAL);
        assertEquals("DEFAULT",ordenExterior.name()); 
    }



}