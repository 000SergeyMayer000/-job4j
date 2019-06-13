package ru.job4j.array;

import java.util.Arrays;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 9, 4, 2, -9, -23, 0, 5};
        System.out.println("Массив до сортировки:" + Arrays.toString(arr));
        int min = arr[0];
        int indmin = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {


                if (min > arr[j]) {
                    min = arr[j];
                    indmin = j;

//            System.out.println("Минимальное значение - " + min);
//            System.out.println("Индекс минимального значения - " + indmin);
                    int tmp = arr[j];
                    arr[j] = arr[indmin];
                    arr[indmin] = tmp;
                    //     System.out.println("массив после перестановки минимального элемента :" + Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}