package org.ruben.java.testing.junitparams.dominio;

import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import junitparams.mappers.CsvWithHeaderMapper;

public class PersonMapper extends CsvWithHeaderMapper {
    @Override
    public Person[] map(Reader reader) {
        Object[] map = super.map(reader);
        List<Person> result = new LinkedList<>();
        for (Object lineObj : map) {
            String line = (String) lineObj;
            String[] elements = line.split(",");

            String name= elements[0].trim();
            String apellido = elements[1].trim();
            int edad = Integer.parseInt(elements[2].trim()) ;
            result.add(new Person( name, apellido, edad ));
        }
        Person[]arr = new Person [result.size()];
        result.toArray(arr);
        return arr;
    }

}