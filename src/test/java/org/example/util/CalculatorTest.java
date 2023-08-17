package org.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    void addition() {
        assertEquals(4, calculator.add(2, 2));
    }
}