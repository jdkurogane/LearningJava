package com.dmitriy.javacourse.lesson26;

/**
 * Make a program that puts first 100 numbers that can be divided to 13 or 17 into array.
 * Then print this array.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        Task1.printArray(values);       // Imported func from Task1
        fillArray(values);
        Task1.printArray(values);
    }

    public static void fillArray(int[] array) {
        int currentIndex = 0;
        for (int value = 1; currentIndex < array.length; value++) {
            if (value % 13 == 0 || value % 17 == 0) {
                array[currentIndex] = value;
                currentIndex++;
            }
        }
    }
}


