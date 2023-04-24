package com.ruben.mapper.MapeoSimple;

public class PersonaDto {
 
    private String nombre;
    private String surname;

    public PersonaDto(String nombre, String surname) {
        this.nombre = nombre;
        this.surname = surname;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSurname() {
        return surname;
    }


}