package msa;

import java.util.Arrays;

/**
 * метод MergingArrays принимает два сортированных массива
 * и результатом слияния получаем третий сортирванный массив
 */
public class MergingArrays {
    public int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            if (left[i] < right[i]) {
                arr[i * 2] = left[i];
                arr[i * 2 + 1] = right[i];
            } else {
                arr[i * 2] = right[i];
                arr[i * 2 + 1] = left[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        MergingArrays mergingArrays = new MergingArrays();
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        System.out.println(Arrays.toString(mergingArrays.merge(a, b)));
    }
}
