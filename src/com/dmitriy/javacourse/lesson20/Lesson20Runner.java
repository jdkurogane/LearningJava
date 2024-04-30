package com.dmitriy.javacourse.lesson20;

/**
 * important to remember:
 * for (int i = 10; i > 0; i--) {
 *     sout(i);
 * }
 */

public class Lesson20Runner {
    public static void main(String[] args) {    // break - прерывает выполнение цикла
        int value = 10;                         // continue - переход к следующей итерации цикла
        forExample(value);
    }

    public static void forExample(int value) {
        for (value = value; value > 0; value--) {
            System.out.println(value);
        }
    }
}
