package com.dmitriy.javacourse.lesson16;

public class Task4 {
    public static void main(String[] args) {
        int year = 1900;
        if (year < 0 || year == 0) {
            System.out.println("Invalid year");
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
    }
}