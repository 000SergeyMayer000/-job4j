package ru.job4j.array;

/**
 * класс SortingArrays сортирует массив целых чисел по возрастанию
 */

import msa.MinSearch;

import java.util.Arrays;

class SortingArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {3,2,1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0 + i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = (array[j]);
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        MinSearch minSearch=new MinSearch();
      //  System.out.println("Минимальное значение ="+minSearch.minarray(array));
    }
}