package com.dmitriy.javacourse.lesson13;

public class TernaryOperator {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 15;
        int max;
        int min = value1 < value2 ? value1 : value2; // ternary operator
        if (value1 > value2) {
            max = value1;
        } else {
            max = value2;
        }
        System.out.println(max + " is max value");
        System.out.println("The min value is " + min);
    }
}
