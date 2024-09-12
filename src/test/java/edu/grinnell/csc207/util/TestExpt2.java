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
public class TestExpt2 {
  @Test
  void exptTest1(){
    assertEquals(1024, SampleMethods.expt(2, 10), "1K");
  }
}
