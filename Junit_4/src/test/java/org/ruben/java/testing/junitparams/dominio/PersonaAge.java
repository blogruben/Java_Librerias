package org.ruben.java.testing.junitparams.dominio;

public class PersonaAge {
    private int age;

    public PersonaAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "Persona [age=" + age + "]";
    }

}

