package ru.job4j.array;

/**
 * класс SortingArrays сортирует массив целых чисел по возрастанию
 */

import java.util.Arrays;

class SortingArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 11, 55, 10, 47, 2, 3, 85, 49, 3};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexmin = i;
            for (int j = 1 + i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexmin = j;
                }
            }
            if (i != indexmin) {
                int tmp = array[i];
                array[i] = array[indexmin];
                array[indexmin] = tmp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
