package com.dmitriy.javacourse.lesson17;

public class Lesson17Runner {
    // [modifier] return_value nameVerb([param]) body
    public static void main(String[] args) {
        int year = 2004;
        boolean leap = isLeapYear(year);
        boolean mistake = isMistake(year);
        boolean result = accuracyCheck(leap, mistake);
        System.out.println("Високосный: " + result);
    }
    public static boolean isMistake(int year) {
        return year < 0 || year == 0;
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static boolean accuracyCheck(boolean leap, boolean mistake) {
        return leap && !mistake;
    }
}
