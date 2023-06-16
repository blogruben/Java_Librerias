package org.ruben.java.hamcrest;

import static org.hamcrest.Matchers.either;
import static org.hamcrest.Matchers.empty;

import org.hamcrest.core.CombinableMatcher;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.ruben.java.hamcrest.CustomMatcher.contieneAlgunNumero;


public class ComprobarValoresHAMCREST {

  @Test
  public void testAssertThatHamcrestCoreMatchers() {
    List<String> listado = Arrays.asList("uno","dos","tres");

    //is
    assertThat(new Object(), not(sameInstance(new Object())));
	  assertThat(false, is(false));

    //tipos
    assertThat("algo", isA(String.class));
    assertThat("foo", is(any(String.class)));
    assertThat(new Object(), is(not(nullValue())));

    //colecciones
	  assertThat(listado, is(not(empty())));
    assertThat(listado, hasItem("dos"));
	  assertThat(listado, hasItems("uno", "dos"));
    assertThat(new String[] {"uno", "dos"}, is(not(equalTo(new String[] {"uno"}))));

    //match custom
    assertThat("a1a", is(contieneAlgunNumero())); 

    //cadenas
    assertThat("uno dos tres", startsWith("uno"));
    assertThat("uno dos tres", endsWith("tres"));
    assertThat("uno dos tres", containsString("dos"));

    //booleanos anyOf
    assertThat("foo bar qux", anyOf(startsWith("foo"), endsWith("baz")));
    assertThat(3, anyOf(is(3),is(5)));
    assertThat("Hola", anyOf(is("Hola"), is("Adios")));
    assertThat("Adios", anyOf(is("Hola"), is("Adios")));
    assertThat("good", anyOf(equalTo("bad"), equalTo("good")));

    //booleanos allOf
    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
    assertThat("foo bar baz", allOf(startsWith("foo"), endsWith("baz")));
    assertThat("good", allOf(equalTo("good"), startsWith("good")));

    //booleanos both
    assertThat("foo bar baz", both(startsWith("foo")).and(endsWith("baz")));

    //booleanos either
    assertThat("foo bar baz", either(startsWith("foo")).or(endsWith("baz")));
    assertThat(2, either(is(3)).or(is(2)));
    assertThat("fan", either(containsString("a")).or(containsString("b")));
    assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
  }



   //anyOf is || 
   //allOf es &&

}
