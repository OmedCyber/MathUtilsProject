package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3));
        assertEquals(-1.0, mathUtils.divide(6, 0));
    }
}
