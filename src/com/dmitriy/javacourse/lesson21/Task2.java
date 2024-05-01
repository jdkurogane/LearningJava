package com.dmitriy.javacourse.lesson21;

/**
 * Имеется число. Посчитать сумму цифр данного числа.
 */

public class Task2 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Summary is " + sum(number));
        System.out.println("Summary via 'while' is " + sumWhile(number));
    }

    public static int sum(int value) {
        int result = 0;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            int singleNumber = currentValue % 10;
            result += singleNumber;
        }
        return result;
    }

    public static int sumWhile(int value) {
        int result = 0;
        int currentValue = (value > 0 ? value : value * -1);
        while (currentValue > 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }
}
