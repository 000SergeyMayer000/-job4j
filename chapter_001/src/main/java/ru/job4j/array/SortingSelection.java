package ru.job4j.array;

import msa.MinIndex;

import java.util.Arrays;

public class SortingSelection {
    public int[] sorting(int[] arr) {
        MinIndex minIndex = new MinIndex();
        for (int i = 0; i < arr.length; i++) {
            int a = minIndex.indexOfMin(i, arr.length - 1, arr);// индекс мин элемента от i до конца массива
            minIndex.swap(i, a, arr);// перестановка местами
            System.out.println(a);
            System.out.println("Измененный массив: " + Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        SortingSelection sortingSelection = new SortingSelection();
        int[] arr = {5,4,3,2,1};
        int[] sortarr = sortingSelection.sorting(arr);

    }
}
