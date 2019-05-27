package ru.job4j.array;

import java.util.Arrays;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 9, 4, 2, -9, -23, 0, 5};
        System.out.println("Массив до сортировки:" + Arrays.toString(arr));
        int min = arr[0];
        int indmin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                indmin = i;
            }
        }
        System.out.println("Минимальное значение - " + min);
        System.out.println("Индекс минимального значения - " + indmin);
        int tmp = arr[0];
        arr[0] = arr[indmin];
        arr[indmin] = tmp;
        System.out.println("массив после перестановки минимального элемента :" + Arrays.toString(arr));
    }
}