package msa;

import java.util.Arrays;

public class MinIndex {

    /**
     * метод мозращает индекс минимального значения массива в заданном диапазоне
     */
    public int indexOfMin(int start, int finish, int[] arr) {
        int mininx = 0;
        for (int index = start; index < finish; index++) {
            if (arr[mininx] > arr[index]) {
                mininx = index;
            }
        }
        return mininx;
    }

    /**
     * метод меняет местами указанные элементы массива.
     */
    public int[] swap(int fromInx, int toInx, int[] arr) {
        int tmp = 0;
        int indtmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fromInx) {
                tmp = arr[i];
                indtmp = i;
            }
            if (arr[i] == toInx) {
                arr[indtmp] = arr[i];
                arr[i] = tmp;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        MinIndex minIndex = new MinIndex();
        int[] arr = {7, 5, 9, 4, 2, -55, 79, -9, -23, 0, 5};
        System.out.println("Индекс минимального элемента = " + minIndex.indexOfMin(1, 9, arr));
        System.out.println("Измененный массив: " + Arrays.toString(minIndex.swap(7, -55, arr)));

    }
}
