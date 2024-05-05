package com.dmitriy.javacourse.practice;

/**
 * Предположим, что существует планета "X" на которой времяисчесление отличается от земного.
 * На этой планете отсчёт первого дня любого месяца начинается с 30 числа и стремится к нулю (30, 29, 28, ... , 1).
 * При этом каждая первая неделя месяца состоит из 7 дней, а каждая последующая - на 1 день короче.
 * Вопрос: какое число будет на календаре во 2 день 3 нечетной недели нового месяца?
 */

public class Task2PlanetCalendarRunner {

    public static void main(String[] args) {
        int amountOfWeeks = 0;
        int amountOfDays = 30;
        int nowInWeek = 7;

    }

    public static int countCalendar(int weeks, int days, int duration) {
        int counter = 0;
        while (days > 0 && duration > 0) {
            weeks += 1;
            days -= duration;
            duration -= 1;
            counter++;
        }
        return days;
    }
}
