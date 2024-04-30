package com.dmitriy.javacourse.lesson16;

public class Task1 {
    public static void main(String[] args) {
        int month = 3;
        if (month == 12 || 1 <= month && month <= 2){
            System.out.println("Winter");
        } else if (3 <= month && month <= 5) {
            System.out.println("Spring");
        } else if (6 <= month && month <= 8) {
            System.out.println("Summer");
        } else if (9 <= month && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Month is invalid");
        }
    }
}
