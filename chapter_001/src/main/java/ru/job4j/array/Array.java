package ru.job4j.array;

public class Array {
    public int indexOfMin(int start, int finish, int[] arr) {
        int min = arr[0];
        int indmin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == start) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == finish) {
                        break;
                    } else {
                        if (arr[j] < min) {
                            min = arr[j];
                            indmin = j;
                        }
                    }
                }
            }
        }
        return indmin;

    }
}