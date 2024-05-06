package com.dmitriy.javacourse.lesson25;

public class Lesson25Array1D {
    public static void main(String[] args) {
        int[] values = {1, 7, 9, 12, 34};
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
