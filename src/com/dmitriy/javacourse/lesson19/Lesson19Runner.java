package com.dmitriy.javacourse.lesson19;

public class Lesson19Runner {
    public static void main(String[] args) {
        int value = 10;
        whileExample(value);
        doWhileExample(value);
    }

    public static void whileExample(int value) {
        while (value > 0) {
            System.out.println(value);
            value--; // value = value - 1; value -= 1;
        }
    }

    public static void doWhileExample(int value) {
        do {
            System.out.println(value);
            value--;
        } while (value > 0);
    }
}
