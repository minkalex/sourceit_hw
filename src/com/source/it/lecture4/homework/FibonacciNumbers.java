package com.source.it.lecture4.homework;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int fibonacci = fibonacci(10);
        System.out.print(fibonacci);
    }

    private static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n > 2) {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
        return 0;
    }
}