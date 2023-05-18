package org.ruben.java.testing.junitparams.dominio;

public class PersonProvider {
    public static Object[] provideAdults() {
        return new Object[]{
                 new Object[]{new Persona(25), true},
                 new Object[]{new Persona(32), true}
               };
    }

    public static Object[] provideTeens() {
        return new Object[]{
                 new Object[]{new Persona(12), false},
                 new Object[]{new Persona(17), false}
               };
    }
}
