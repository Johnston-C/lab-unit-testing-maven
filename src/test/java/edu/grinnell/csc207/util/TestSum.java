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

public class TestSum {
  @Test
  void sumTest(){
    int[] values = {1, 2, 3, 4};
    assertEquals(10, SampleMethods.sum(values));
  }
  @Test
  void sumTest2(){
    int[] values = {};
    assertEquals(0, SampleMethods.sum(values));
  }
  @Test
  void sumTest3(){
    int[] values = {-1, 2, -20, 4};
    assertEquals(-15, SampleMethods.sum(values));
  }

  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0,SampleMethods.sum(values), "extreme values");
 } // testExtremes
}
