package com.example.demo;

public class PrimeChecker {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Số nhỏ hơn hoặc bằng 1 không phải số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Không phải số nguyên tố
            }
        }
        return true; // Là số nguyên tố
    }
}
