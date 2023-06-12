package org.ruben.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTests {

	@Test
	@DisplayName("2 + 1 = 3")
	void addsTwoNumbers() {
		Calculadora cal = new Calculadora();
		assertEquals(3, cal.sumar(2, 1), "2 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",  //probamos el cero
			"1,    0,   1",
			"-1,   1,   0",  //probamos numeros negativos
			"-1,  -2,  -3",  
			"1,    3,   4",  //pruebas standard
			"49, s 51, 100",

	})
	void add(int first, int second, int expectedResult) {
		Calculadora cal = new Calculadora();
		assertEquals(expectedResult, cal.sumar(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
