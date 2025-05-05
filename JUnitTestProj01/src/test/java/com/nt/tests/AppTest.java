package com.nt.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest {

    @Test
    @DisplayName("Test sum with positive numbers")
    public void testWithPositive() {
        Arithmetic ar = new Arithmetic();
        float expected = 30.0f;
        float actual = ar.sum(10.0f, 20.0f);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test sum with negative numbers")
    public void testWithNegatives() {
        Arithmetic ar = new Arithmetic();
        float expected = -30.0f;
        float actual = ar.sum(-10.0f, -20.0f);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test sum with zeros")
    public void testWithZero() {
        Arithmetic ar = new Arithmetic();
        float expected = 0.0f;
        float actual = ar.sum(0.0f, 0.0f);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test sum with mixed values")
    public void testWithMixedValues() {
        Arithmetic ar = new Arithmetic();
        float expected = -10.0f;
        float actual = ar.sum(10.0f, -20.0f);
        assertEquals(expected, actual);
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("Disabled test - sum with mixed integers")
    public void testSumWithMixedValues() {
        int val1 = 10;
        int val2 = -20;
        float expected = -10.0f;
        float actual = new Arithmetic().sum(val1, val2);
        assertEquals(expected, actual);
    }
}
