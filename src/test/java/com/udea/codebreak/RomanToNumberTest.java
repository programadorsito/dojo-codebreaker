package com.udea.codebreak;
import org.junit.Test;
import org.junit.Assert;

public class RomanToNumberTest {

  @Test
  public void romanToDecimal() {
    RomanToNumber ob = new RomanToNumber(); 
  
    Assert.assertTrue(1==ob.romanToDecimal("I"));
    Assert.assertTrue(100==ob.romanToDecimal("C"));
    Assert.assertTrue(51==ob.romanToDecimal("LI"));
  }
} 
