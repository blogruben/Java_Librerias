package org.ruben.java.testing.junitparams.dominio;

public class Persona {

    private String nombre;
    private String apellido;
    private int age;

    public Persona(String nombre,String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.age = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNombreCompleto() {
        return nombre+" "+apellido;
    }
    public boolean isMayorEdad() {
        return age >= 18;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [nombre=" + nombre + ", apellido=" + apellido + ", age=" + age + "]";
    }


}