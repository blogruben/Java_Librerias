package org.ruben.java.testing.junitparams.dominio;

public class PersonProvider {
    public static Object[] provideAdults() {
        return new Object[]{
                 new Object[]{new PersonaAge(25), true},
                 new Object[]{new PersonaAge(32), true}
               };
    }

    public static Object[] provideTeens() {
        return new Object[]{
                 new Object[]{new PersonaAge(12), false},
                 new Object[]{new PersonaAge(17), false}
               };
    }
}
