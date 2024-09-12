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
public class TestExpt {
  @Test
  void exptTest1(){
    int k=5;
    int expected=1;
    for(int i=-k; i<=k; i++){
      for(int j=0; j<=k; j++){
        assertEquals(expected,SampleMethods.expt(i,j));
        expected*=i;
      }
      expected=1;
    }
  }
}
