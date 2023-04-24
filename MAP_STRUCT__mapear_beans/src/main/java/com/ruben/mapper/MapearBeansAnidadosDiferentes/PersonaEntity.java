package com.ruben.mapper.MapearBeansAnidadosDiferentes;

public class PersonaEntity {

    private String nombre; // maper solo
    private InnerApellido innerApellido; // diferentes atributos InnerApellido-> 
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public InnerApellido getInnerApellido() {
        return innerApellido;
    }
    public void setInnerApellido(InnerApellido innerApellido) {
        this.innerApellido = innerApellido;
    }


    





}