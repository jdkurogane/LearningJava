package com.dmitriy.javacourse.lesson13;

public class Lesson13Runner {
    public static void main(String[] args) {
        int value = 10;
        boolean test = value > 0;
        if (test) {
            System.out.println(value + " positive value"); // concatenation
        } else {
            System.out.println("Value is not positive");
        }

        int value2 = 0;
        if (value2 > 0) {
            System.out.println("Positive value");
        } else if (value2 < 0) {
            System.out.println("Negative value");
        } else {
            System.out.println("Zero");
        }
    }
}
