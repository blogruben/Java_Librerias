package org.ruben.java.hamcrest;

import java.util.regex.Pattern;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class CustomMatcher  extends TypeSafeMatcher<String> {

	private String text;

	public void describeTo(Description description) {
		description.appendText("Se espera que contengo algun numero el texto "+text);
	}

	@Override
	public boolean matchesSafely(String texto) {
		this.text = texto;
        final String REGEX = ".*[0-9].*"; 
        Pattern pattern = Pattern.compile(REGEX);
        java.util.regex.Matcher matcher = pattern.matcher(texto);
        boolean cotieneREGEX = matcher.matches();
		return cotieneREGEX;
	}
	
	@Factory
	public static <T> Matcher<String> contieneAlgunNumero() {
		return new CustomMatcher();
	}
}