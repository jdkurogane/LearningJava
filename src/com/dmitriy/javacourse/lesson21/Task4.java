package com.dmitriy.javacourse.lesson21;

/**
 * Find if number is simple.
 */

public class Task4 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Your number is simple: " + isSimple(number));
    }

    public static boolean isSimple(int value) {
        for (int currentValue = 2; currentValue < value; currentValue++) {
            if (value % currentValue == 0) {
                return false;
            }
        }
        return true;
    }
}
