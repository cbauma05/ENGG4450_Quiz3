package com.jwetherell.algorithms.mathematics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Map;

class PrimesTest {

    // METHOD 1
    @Test
    void testIsPrime_RegularCases() {
        assertTrue(Primes.isPrime(2));  // Prime
        assertTrue(Primes.isPrime(13)); // Prime
        assertFalse(Primes.isPrime(10)); // Not prime
    }

    @Test
    void testIsPrime_EdgeCases() {
        assertFalse(Primes.isPrime(1));  // 1 is not a prime
        assertFalse(Primes.isPrime(0));  // 0 is not a prime
        assertFalse(Primes.isPrime(-7)); // Negative numbers are not primes
    }

    // METHOD 2
    @Test
    void testGetPrimeFactorization_RegularCases() {
        // Regular cases
        assertEquals(Map.of(2L, 3L), Primes.getPrimeFactorization(8)); // 2^3
        assertEquals(Map.of(2L, 1L, 5L, 1L), Primes.getPrimeFactorization(10)); // 2 * 5
    }

    @Test
    void testGetPrimeFactorization_EdgeCases() {
        // Edge cases
        assertEquals(Map.of(), Primes.getPrimeFactorization(1)); // No prime factors
        assertEquals(Map.of(2L, 1L), Primes.getPrimeFactorization(2)); // Single prime
    }

    // METHOD 3
    @Test
    void testSieveOfEratosthenes_RegularCases() {
        assertTrue(Primes.sieveOfEratosthenes(2)); // Prime
        assertFalse(Primes.sieveOfEratosthenes(4)); // Not prime
    }

    @Test
    void testSieveOfEratosthenes_EdgeCases() {
        assertFalse(Primes.sieveOfEratosthenes(1)); // 1 is not prime
        assertTrue(Primes.sieveOfEratosthenes(13)); // Prime
    }

    // METHOD 4
    @Test
    void testMillerRabinTest() {
        assertTrue(Primes.millerRabinTest(2));  // Prime
        assertFalse(Primes.millerRabinTest(10)); // Not prime
    }

}