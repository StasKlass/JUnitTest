package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxTest {

    @Test
    public void testMaxPositiveNumbers() {
        assertEquals(5, Math.max(2, 5));
    }

    @Test
    public void testMaxNegativeNumbers() {
        assertEquals(-2, Math.max(-5, -2));
    }

    @Test
    public void testMaxMixedNumbers() {
        assertEquals(10, Math.max(-10, 10));
    }
}
