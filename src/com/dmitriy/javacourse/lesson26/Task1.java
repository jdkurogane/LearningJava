package com.dmitriy.javacourse.lesson26;

/**
 * Make a program that prints array in normal order, then in reversed order.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(values);
        printArrayReversed(values);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayReversed(int[] array) {
        for (int j = array.length; j > 0; j--) {
            System.out.print(array[j - 1] + " ");
        }
        System.out.println();
    }
}

