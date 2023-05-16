package org.ruben.java.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;
import junitparams.JUnitParamsRunner;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;



@RunWith(JUnitParamsRunner.class)
@Category(UnitTest.class)
public class DatosConjuntoJUnitParams {

 

//https://www.testwithspring.com/lesson/writing-parameterized-tests-with-junit-4/
 
    @Test
    @Parameters({
            "0, 0, 0",
            "1, 1, 2"
    })
    public void shouldReturnCorrectSum(int first, 
                                       int second, 
                                       int expectedSum) {
        Calculator calculator = new Calculator();
        int actualSum = calculator.sum(first, second);
        assertThat(actualSum).isEqualByComparingTo(expectedSum);
    }



}




class Calculator {
 
    public int sum(int first, int second) {
        return first + second;
    }
}