package com.dmitriy.javacourse.practice;

/**
 * Предположим, что существует планета "X" на которой времяисчесление отличается от земного.
 * На этой планете отсчёт первого дня любого месяца начинается с 30 числа и стремится к нулю (30, 29, 28, ... , 1).
 * При этом каждая первая неделя месяца состоит из 8 дней, а каждая последующая - на 1 день короче.
 * Вопрос: какое число будет на календаре в 3 день 2 нечетной недели нового месяца?
 */

public class Task2PlanetCalendarRunner {        //Solution needs optimization

    public static void main(String[] args) {
        int amountOfWeeks = 0;
        int amountOfDays = 30;
        int nowInWeek = 8;
        System.out.println("There are " + countNumberOfWeek(amountOfWeeks, nowInWeek, amountOfDays) + " weeks in month");
        System.out.println("The date is " + countDayInCalendar(countNumberOfWeek(amountOfWeeks, nowInWeek, amountOfDays), amountOfDays, nowInWeek));
    }

    public static int countNumberOfWeek (int numberOfCurrentWeek, int weekLength, int daysInMonth) {
        while (weekLength > 0 && daysInMonth > 0) {
            numberOfCurrentWeek++;
            daysInMonth -= weekLength;
            weekLength--;
        }
        return numberOfCurrentWeek;
    }

    public static int countDayInCalendar (int countNumberOfWeek, int date, int weekLength) {
        int counter = 0;
        while (date > 0 && countNumberOfWeek > 0) {
            if (countNumberOfWeek == 3) {
                date = date - 3;
                break;
            }
            date -= weekLength - counter;
            countNumberOfWeek--;
            counter++;
        }
        return date;
    }
}
