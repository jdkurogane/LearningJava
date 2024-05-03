package com.dmitriy.javacourse.lesson21;

public class Task5 {
    public static void main(String[] args) {
        char startChar = 'p';
        printLetters(startChar);
    }

    public static void printLetters(char startChar) {
        for (char currentChar = startChar; !isVowel(currentChar); currentChar++) {
            System.out.println(currentChar);
        }
    }

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y';
    }
}
