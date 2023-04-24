package com.ruben.mapper.MapearBeansAnidadosIguales;

public class PersonaEntity {

    private String nombre;
    private InnerApellido innerSurname; 


    public PersonaEntity(String nombre, InnerApellido innerSurname) {
        this.nombre = nombre;
        this.innerSurname = innerSurname;
    }


    public String getNombre() {
        return nombre;
    }


    public InnerApellido getInnerSurname() {
        return innerSurname;
    }

    






}