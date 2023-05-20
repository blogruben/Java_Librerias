package org.ruben.java.testing.hamcrest;

import org.hamcrest.Matchers;
import org.hamcrest.core.CombinableMatcher;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import org.junit.Test;

//Assertions son funciones esticas para hacer comprobaciones
public class ComprobarValoresHAMCREST {

  // Core Hamcrest Matchers with assertThat
  @Test
  public void testAssertThatHamcrestCoreMatchers() {
    assertThat("good", allOf(equalTo("good"), startsWith("good")));
    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
    assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
    assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
    assertThat(new Object(), not(sameInstance(new Object())));

    int i = 2;
    assertThat(i, Matchers.either(Matchers.is(3)).or(Matchers.is(5)));
    int j = 2;
    assertThat(j, Matchers.anyOf(Matchers.is(3),Matchers.is(5)));

  }

  @Test
  public void testAssertTrue() {
    org.junit.Assert.assertTrue("failure - should be true", true);
  }

}
