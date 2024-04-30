package com.dmitriy.javacourse.lesson16;

public class Task2 {
    public static void main(String[] args) {
        int number = -363;
        int reminder = number % 10;
        if (reminder == 3 || reminder == -3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
