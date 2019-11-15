package ru.job4j.array;

import java.util.Arrays;

/**
 * класс SelectionSort - Реализация алгоритма Сортировка выбором
 */

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int minI = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    minI = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != minI) {
                int tmp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
