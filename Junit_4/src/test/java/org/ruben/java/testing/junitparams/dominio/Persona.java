package org.ruben.java.testing.junitparams.dominio;

public class Persona {
    private int age;

    public Persona(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

}