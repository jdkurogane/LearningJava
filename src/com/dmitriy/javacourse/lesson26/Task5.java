package com.dmitriy.javacourse.lesson26;

/**\
 * Определить сумму значений элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] values = {100, 2, 3, 4, 5, 6, -9};
        getSum(values);
    }

    public static int getMinIndex(int[] array) {
        int index = 0;
        for (int counter = 0; counter < array.length; counter++) {
            if (array[index] > array[counter]) {
                index = counter;
            }
        }
        return index;
    }

    public static int getMaxIndex(int[] array) {
        int index = 0;
        for (int counter = 0; counter < array.length; counter++) {
            if (array[index] < array[counter]) {
                index = counter;
            }
        }
        return index;
    }

    public static void getSum(int[] array) {
        int result = 0;
        int startIndex = getMinIndex(array) < getMaxIndex(array) ? getMinIndex(array) : getMaxIndex(array);
        int endIndex = getMinIndex(array) > getMaxIndex(array) ? getMinIndex(array) : getMaxIndex(array);
        for (int currentIndex = startIndex + 1; currentIndex < endIndex; currentIndex++) {
            result += array[currentIndex];
        }
        System.out.println("Sum of elements between min and max values of the array is: " + result);
    }
}
