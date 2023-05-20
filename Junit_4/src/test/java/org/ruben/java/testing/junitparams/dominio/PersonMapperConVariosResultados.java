package org.ruben.java.testing.junitparams.dominio;

import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import junitparams.mappers.CsvWithHeaderMapper;

public class PersonMapperConVariosResultados extends CsvWithHeaderMapper {
    @Override
    public Object[] map(Reader reader) {
        Object[] map = super.map(reader);
        List<Object> result = new LinkedList<>();
        for (Object lineObj : map) {
            String line = (String) lineObj;
            String[] elements = line.split(",");

            // valor
            String name = elements[0].trim();
            String apellido = elements[1].trim();
            int edad = Integer.parseInt(elements[2].trim());
            Persona persona = new Persona(name, apellido, edad);

            // resultado
            boolean esMayor = Boolean.parseBoolean(elements[3].trim());
            String nombreCompleto = elements[4].trim();
            ResultadosPerson resultadosPerson = new ResultadosPerson(esMayor,nombreCompleto);


            result.add(new Object[] { persona, resultadosPerson });
        }
        return result.toArray();
    }

}