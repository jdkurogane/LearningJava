package com.dmitriy.javacourse.lesson21;

/**
 * Индейцы и манхетен
 */

public class Task3 {
    public static void main(String[] args) {
        int currentYear = 2024;
        int pastYear = 1626;
        double sum = 24;
        double percent = 0.05;
        System.out.println("They could receive: " + countPercent(sum, pastYear, currentYear, percent) + "$");
        System.out.println("They could receive: " + countPercentViaFor(sum, pastYear, currentYear, percent) + "$. Counted via 'for' cycle.");
    }

    public static double countPercent(double sum, int pastDate, int currentDate, double percent) {
        double totalAmount = sum;
        int differenceInYear = currentDate - pastDate;
        while (differenceInYear > 0) {
            totalAmount += totalAmount * percent;
            differenceInYear--;
        }
        return totalAmount;
    }

    public static double countPercentViaFor(double sum, int pastDate, int currentDate, double percent) {
        double result = sum;
        for (int time = currentDate - pastDate; time > 0; time--) {
            result += result * percent;
        }
        return result;
    }
}
