package com.mdazad.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        calc.add(5);
        assertEquals(5, calc.getResult());
    }

    @Test
    public void testSubtract() {
        Calc calc = new Calc();
        calc.subtract(5);
        assertEquals(-5, calc.getResult());
    }

    @Test
    public void testDivide() {
        Calc calc = new Calc();
        calc.divide(5);
        assertEquals(0, calc.getResult());
    }

    @Test
    public void testMultiply() {
        Calc calc = new Calc();
        calc.multiply(5);
        assertEquals(0, calc.getResult());
    }

    @Test
    public void testChainedOperations() {
        Calc calc = new Calc();
        calc.add(5).subtract(3).multiply(2).divide(4);
        assertEquals(1, calc.getResult());
    }
}