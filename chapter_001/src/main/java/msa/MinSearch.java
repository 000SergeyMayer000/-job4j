package msa;

public class MinSearch {
    public int min(int[] arr) {
        int minvalue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minvalue > arr[i]) {
                minvalue = arr[i];
            }
        }
        return minvalue;
    }

    public static void main(String[] args) {
        MinSearch minSearch = new MinSearch();
        int[] arr = new int[]{12, 9, 8, 7, 16, 10, 6, 5, 15, 17, 4, 14, 11, -12, 3, 2, 1, 0, 13};
        int min = minSearch.min(arr);
        System.out.println(min);
    }

}