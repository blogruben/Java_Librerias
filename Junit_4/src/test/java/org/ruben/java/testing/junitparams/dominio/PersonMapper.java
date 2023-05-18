package org.ruben.java.testing.junitparams.dominio;

import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import junitparams.mappers.CsvWithHeaderMapper;

public class PersonMapper extends CsvWithHeaderMapper {
    @Override
    public Object[] map(Reader reader) {
        Object[] map = super.map(reader);
        List<Object[]> result = new LinkedList<Object[]>();
        for (Object lineObj : map) {
            String line = (String) lineObj;
            String[] elements = line.split(",");
            result.add(new Object[] { elements[0], elements[1] });
        }
        return result.toArray();
    }

}