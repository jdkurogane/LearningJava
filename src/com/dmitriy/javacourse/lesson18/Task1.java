package com.dmitriy.javacourse.lesson18;

public class Task1 {
    public static void main(String[] args) {
        int first = 10;
        int second = 50;
        int result = isMaxValue(first, second);
        System.out.println("Max value is " + result);
    }
    public static int isMaxValue(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else if (value1 < value2) {
            return value2;
        } else {
            return (value1 + value2) / 2;
        }
    }
}
