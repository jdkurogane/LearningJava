package com.dmitriy.javacourse.lesson18;

public class Task2 {
    public static void main(String[] args) {
        int number = 3;
        int result = getNumberInCube(number);
        System.out.println("Number in ^3 is: " + result);
    }
    public static int getNumberInCube(int value) {
        return value * value * value;
    }
}
