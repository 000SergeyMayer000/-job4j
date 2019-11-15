package msa;

public class MinSearch {
    public int minarray(int[] arr) {
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
        int[] arr = new int[]{12, 9, 8, 7};
        int min = minSearch.minarray(arr);
        System.out.println(min);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}