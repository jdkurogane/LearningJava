package com.dmitriy.javacourse.lesson21;

/**
 * Написать программу высчитывающую факториал введенного целого числа.
 */

public class Task1 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println("Factorial via 'while' is " + countFactorial(value));
        System.out.println("Factorial via 'for' is " + countFactorialViaFor(value));
    }

    public static int countFactorial(int value) {
        int factorial = 1;
        int currentValue = value;
        while (currentValue != 0) {
            factorial *= currentValue;
            currentValue--;
        }
        return factorial;
    }

    public static int countFactorialViaFor(int value) {
        int factorial = 1;
        for (int currentValue = value; currentValue > 0; currentValue--) {
            factorial *= currentValue;
        }
        return factorial;
    }
}
