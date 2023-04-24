package com.ruben.mapper.MapeoCustom;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface MapeoCustom {

    default FechaDto fechaEntityToFechaDtomapear(FechaEntity studentEntity) {
        final int anio = studentEntity.getAnioNacimiento();
        final int mes = studentEntity.getMesNacimiento();
        final int dia = studentEntity.getDiaNacimiento();
        final String fechaString = dia+"/"+mes+"/"+anio;
        DateFormat formateador= new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;
        try {
            fecha = formateador.parse(fechaString);
        } catch (ParseException e) {
            throw new RuntimeException("No se ha podido parsear al objeto Date la fecha fecha");
        }
        FechaDto fechaDto = new FechaDto();
        fechaDto.setFecha(fecha);
        return fechaDto;
    }


    @Mapping(target = "alturaMetros", source = "alturaCentimetros", qualifiedByName = "inchToCentimeter")
    public PersonaDto userBodyValuesMapper(Persona dto);
    

    @Named("inchToCentimeter") 
    public static double inchToCentimeter(int alturaCentimetros) { 
        return alturaCentimetros / 100; 
    }


} 


