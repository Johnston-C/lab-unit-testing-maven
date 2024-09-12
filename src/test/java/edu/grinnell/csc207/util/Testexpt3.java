package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Myles Bohrer-Purnell,Cade Johnston
 */
public class Testexpt3 {
  @Test
  void exptTest1(){
    assertEquals(1024.0, SampleMethods.expt(2.0, 10), "1K");
  }
  @Test
  void exptTest2(){
    assertEquals(2.25, SampleMethods.expt(1.5, 2), "1K");
  }
}
