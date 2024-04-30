package com.dmitriy.javacourse.lesson8;

public class Lesson8Runner {
    public static void main(String[] args) {
        int intValue;  // define
        intValue = 28; // initialize
        System.out.println(intValue);

        final int changeNum = 1101; // final prevent changes
        intValue = changeNum;
        System.out.println(intValue);

        double doubleValue = 12.98; // define + init
        System.out.println(doubleValue);

        byte byteValue = 39;
        System.out.println(byteValue);

        char charValue = '?';
        System.out.println(charValue);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        String stringValue = "Hello World";
        System.out.println(stringValue);
    }
}
