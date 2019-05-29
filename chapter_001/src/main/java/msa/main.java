package msa;


import msa.lesson15.Array;

public class main {
    public static void main(String[] args) {
/**
 * мето мозращает индекс минимального значения массива
 */

        Array array = new Array();
        int[] arr = {7, 9, 4, 2, -55, 79, -9, -23, 0, 5};
        int start =5;
        int finish =9;

        int mininx = 0;
        for (int index = start; index < finish; index++) {

            if (arr[mininx] > arr[index]) {
                mininx = index;

            }        }
        System.out.println(mininx);
    }
}