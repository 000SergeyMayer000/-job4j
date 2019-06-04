package msa;

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

    public static void main(String[] args) {
        MinIndex minIndex = new MinIndex();
        int[] arr = {7, 5, 9, 4, 2, -55, 79, -9, -23, 0, 5};
        System.out.println(minIndex.indexOfMin(1, 9, arr));
    }
}
