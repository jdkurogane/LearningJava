package com.dmitriy.javacourse.lesson10;

public class Lesson10Runner {
    public static void main(String[] args) {
        boolean value = true;
        System.out.println(value);

        int number1 = 10;
        int number2 = 5;
        System.out.println(number1 > number2); // <, >, ==, <=, >=, !=

        int x = 67;
        boolean result = 0 < x && x <= 100; // &&, ||, !
        System.out.println(!result);
    }
}
