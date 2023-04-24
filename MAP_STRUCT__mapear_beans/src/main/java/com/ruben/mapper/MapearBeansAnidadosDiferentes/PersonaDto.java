package com.ruben.mapper.MapearBeansAnidadosDiferentes;

import java.util.Date;

public class PersonaDto {
 
    private String name;
    private InnerSurname innerSurname;


    public PersonaDto(String name, InnerSurname innerSurname) {
        this.name = name;
        this.innerSurname = innerSurname;
    }


    public String getName() {
        return name;
    }

    public InnerSurname getInnerSurname() {
        return innerSurname;
    }




    
}