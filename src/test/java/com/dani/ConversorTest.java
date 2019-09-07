package com.dani;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ConversorTest {
    private Conversor conversor;
    
    @Test
    public void conversionTest() {
        conversor = new Conversor(); 
        Assert.assertTrue(51==conversor.convertir("LI"));
        Assert.assertTrue(10==conversor.convertir("X"));
    }
} 
