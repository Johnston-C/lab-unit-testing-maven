package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestNoBs {
@Test
  public void testremoveBs() {
    assertEquals("", 
                 SampleMethods.removeBs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeBs("hello"),
                 "no bs");
    assertEquals("", 
                 SampleMethods.removeBs("b"),
                 "eliminate one b");
    assertEquals("", 
                 SampleMethods.removeBs("bbbb"),
                 "eliminate many bs");
    assertEquals("ain", 
                 SampleMethods.removeBs("bain"),
                 "eliminate one a, short string");
    assertEquals("alphaet", 
                 SampleMethods.removeBs("alphabetb"),
                 "eliminate many bs, medium string");
  } // testremoveBs
}
