package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void testPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        assertTrue(checker.isPrime(5));  // 5 là số nguyên tố
        assertTrue(checker.isPrime(13)); // 13 là số nguyên tố
    }

    @Test
    void testNonPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        assertFalse(checker.isPrime(4));  // 4 không phải số nguyên tố
        assertFalse(checker.isPrime(1));  // 1 không phải số nguyên tố
    }

    @Test
    void testEdgeCases() {
        PrimeChecker checker = new PrimeChecker();
        assertFalse(checker.isPrime(-1)); // Số âm không phải số nguyên tố
        assertFalse(checker.isPrime(0));  // 0 không phải số nguyên tố
    }
}
