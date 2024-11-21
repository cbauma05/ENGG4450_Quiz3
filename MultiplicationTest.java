package com.jwetherell.algorithms.mathematics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MultiplicationTest {

    @Test
    void testMultiplication() {
        assertEquals(-50, Multiplication.multiplication(5, -10));
        assertEquals(50, Multiplication.multiplication(-5, -10));
        assertEquals(0, Multiplication.multiplication(0, -10));

    }

    @Test
    void testMultiplication2() {
        assertEquals(8, Multiplication.multiplication2(2, 4));
    }

    @Test
    void testMultiplyUsingLoop() {
        assertEquals(50, Multiplication.multiplication(5, 10));
        assertEquals(50, Multiplication.multiplication(-5, -10));
        assertEquals(0, Multiplication.multiplication(0, -10));
    }

    @Test
    void testMultiplyUsingRecursion() {
        assertEquals(50, Multiplication.multiplication(5, 10));
        assertEquals(50, Multiplication.multiplication(-5, -10));
        assertEquals(0, Multiplication.multiplication(0, -10));
    }

    @Test
    void testMultiplyUsingShift() {
        assertEquals(50, Multiplication.multiplication(5, 10));
        assertEquals(50, Multiplication.multiplication(-5, -10));
        assertEquals(0, Multiplication.multiplication(0, -10));
    }

    @Test
    void testMultiplyUsingLogs() {
        assertEquals(50, Multiplication.multiplication(5, 10));
        assertEquals(50, Multiplication.multiplication(-5, -10));
        assertEquals(0, Multiplication.multiplication(0, -10));
    }

    @Test
    void testMultiplyUsingFFT() {
        assertEquals("50", Multiplication.multiplyUsingFFT("5", "10"));
        assertEquals("50", Multiplication.multiplyUsingFFT("-5", "-10"));
        assertEquals("0", Multiplication.multiplyUsingFFT("0", "-10"));
    }

    @Test
    void testMultiplyUsingLoopWithStringInput() {
        assertEquals("50", Multiplication.multiplyUsingFFT("5", "10"));
        assertEquals("50", Multiplication.multiplyUsingFFT("-5", "-10"));
        assertEquals("0", Multiplication.multiplyUsingFFT("0", "-10"));
    }

    @Test
    void testMultiplyUsingLoopWithIntegerInput() {
        assertEquals(50, Multiplication.multiplication(5, 10));
        assertEquals(50, Multiplication.multiplication(-5, -10));
        assertEquals(0, Multiplication.multiplication(0, -10));
        assertEquals(0, Multiplication.multiplication(0, 10)); // 0
    }

}