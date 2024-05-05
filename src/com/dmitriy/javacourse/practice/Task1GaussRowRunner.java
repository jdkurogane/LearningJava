package com.dmitriy.javacourse.practice;

/**
 * Find summary of n amount of elements, where x is value of last element.
 * E.G. 1 + 2 + ... + 100 = ?
 */

public class Task1GaussRowRunner {

    public static void main(String[] args) {
        int value = 100;
        System.out.println("Summary of Gauss Row is " + countGaussRow(value));
    }

    public static int countGaussRow(int value) {
        return (value * (value + 1)) / 2;
    }
}
