package com.dmitriy.javacourse.lesson23;

public class Lesson23Runner {
    public static void main(String[] args) {
        int[] values = {1, 6, 9, -4, 135};
        System.out.println(values.length);
        System.out.println(values[3]);
        values[3] = 723;
        System.out.println(values[3]);
    }

    public static void isNotDefinedMassive() {
        int[] values = new int[3];
        System.out.println(values[1]); // receive default answer equal to 0
    }
}
