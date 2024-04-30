package com.dmitriy.javacourse.lesson16;

public class Task3 {
    public static void main(String[] args) {
        int money = 81;
        int reminder10 = money % 10;
        int reminder100 = money % 100;
        if (reminder10 == 0 || (5 <= reminder10 && reminder10 <= 9) || (11 <= reminder100 && reminder100 <= 19)) {
            System.out.println(money + " рублей");
        } else if (2 <= reminder10 && reminder10 <= 4) {
            System.out.println(money + " рубля");
        } else if (reminder10 == 1) {
            System.out.println(money + " рубль");
        } else {
            System.out.println(money + " is invalid");
        }
    }
}
