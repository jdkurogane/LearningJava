package com.dmitriy.javacourse.lesson26;

/**
 * Написать 2 метода, которые определяют индекс минимального и максимального значения одномерного массива соответственно.
 */

public class Task4 {
    public static void main(String[] args) {
        int[] values = {1, 2, -3, 0, 58, -12, 91};
        findMin(values);
        findMax(values);
    }

    public static void findMin(int[] array) {
        int result = 0;
        int index = 0;
        for (int counter = 0; counter < array.length; counter++) {
            if (result > array[counter]) {
                result = array[counter];
                index = counter;
            }
        }
        System.out.println("The min value of array is " + result);
        System.out.println("The index of min value of array is " + index);
    }

    public static void findMax(int[] array) {
        int result = 0;
        int index = 0;
        for (int counter = 0; counter < array.length; counter++) {
            if (result < array[counter]) {
                result = array[counter];
                index = counter;
            }
        }
        System.out.println("The max value of array is " + result);
        System.out.println("The index of max value of array is " + index);
    }
}
