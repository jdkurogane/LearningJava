package com.dmitriy.javacourse.lesson15;

public class Lesson15Runner {
    public static void main(String[] args) {
        int month = 1;
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Month is invalid");
        }

        int number = 2;
        String result = switch (number) {
            case 1, 3, 5, 7, 9 -> "Odd";
            case 2, 4, 6, 8, 10 -> "Even";
            case 0 -> "Zero";
            default -> "Invalid number";
        };
        System.out.println(result);
    }
}
