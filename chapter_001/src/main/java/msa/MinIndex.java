package msa;

import java.util.Arrays;

public class MinIndex {

    /**
     * метод мозращает индекс минимального значения массива в заданном диапазоне
     */
    public int indexOfMin(int start, int finish, int[] arr) {
        int mininx = start;
        for (int index = start; index != finish+1; index++) {
            if (arr[mininx] > arr[index]) {
                mininx = index;
            }
        }
        return mininx;
    }

    /**
     * метод меняет местами указанные элементы массива.(индексы)
     */
    public int[] swap(int fromInx, int toInx, int[] arr) {
       int tmp;
        tmp = arr[fromInx];
        arr[fromInx]=arr[toInx];
        arr[toInx]=tmp;
        return arr;
    }

    public static void main(String[] args) {
        MinIndex minIndex = new MinIndex();
        int[] arr = {4,3,2,1};
        System.out.println("Индекс минимального элемента = " + minIndex.indexOfMin(0, 3, arr));
       System.out.println("Измененный массив: " + Arrays.toString(minIndex.swap(3, 0, arr)));
    }
}
