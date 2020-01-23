package ru.job4j.array;

public class Test {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
    }

    public static int findIt(int[] a) {
        int odd = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                odd = a[i];
                break;
            }
            count = 0;
        }
        return odd;
    }
}
