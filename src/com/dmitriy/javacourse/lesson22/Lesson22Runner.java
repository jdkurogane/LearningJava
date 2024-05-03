package com.dmitriy.javacourse.lesson22;

public class Lesson22Runner {
    public static void main(String[] args) {
        int value = 5; // 5! = 120
        int result = isFactorial(value);
        System.out.println(result);
    }

    public static int isFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * isFactorial(number - 1);
    }
}
