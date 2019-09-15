package ru.job4j.array;

import msa.MinIndex;

import java.util.Arrays;

public class SortingSelection {
    public int[] sorting(int[] arr) {
        MinIndex minIndex = new MinIndex();
        for (int i = 0; i < arr.length; i++) {
            int a = minIndex.indexOfMin(i, arr.length - 1, arr);// индекс мин элемента от i до конца массива
            minIndex.swap(i, a, arr);// перестановка местами
        }
        return arr;
    }

    public static void main(String[] args) {
        SortingSelection sortingSelection = new SortingSelection();
        int[] arr = {12, 0, 36, 5, -4, -12, 100};
        int[] sortarr = sortingSelection.sorting(arr);
        System.out.println("Измененный массив: " + Arrays.toString(arr));
    }
}
