package com.ruben.mapper.MapeoSimple;

public class PersonaEntity {

    private String nombre;
    private String apellido;

    public PersonaEntity(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


}