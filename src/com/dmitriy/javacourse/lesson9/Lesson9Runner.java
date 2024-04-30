package com.dmitriy.javacourse.lesson9;

public class Lesson9Runner {
    public static void main(String[] args) {
        int value = 10 + 4; // +, -, /, %
        System.out.println(value);

        int number = 10;
        number = (number - 2) / 3; // () - rise the priority
        System.out.println(number);

        int value2 = 7;
        value2 += 1;
        value2++;        // value + 1, value += 1
        value2--;        // value - 1, value -= 1
        System.out.println(value2);

        int value3 = 10;
        System.out.println(value3 / (double) 4); // or make double value3
    }
}
