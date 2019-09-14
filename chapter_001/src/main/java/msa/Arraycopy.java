package msa;

import java.util.Arrays;

public class Arraycopy {

    public static void main(String[] args) {
        int[] smallPrimes = {1, 2, 3, 4, 5, 6, 7};
       int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
       // int [] q = System.arraycopy(smallPrimes, 4,smallPrimes, 3, smallPrimes.length-3-1);//первая переменная - исходный массив
        //вторая  - индекс начального элемента КОПИРУЕМОГО фрагмента;
        //третья - массив назначения;
        //четвертая - индекс начальной позиции копируемого фрагмента в КОНЕЧНОМ(массив насзначения);
        //пятая - длинна копируемого фрагмента
        System.out.println(Arrays.toString(smallPrimes));
        char[] a = {'!', 'j', 'o', 'b', '!', '!'};
        char[] b = {'!', '!', '!', '!', '!', '4', '!', '!'};
        System.arraycopy(a, 1, b, 2, 3);
        System.out.println(Arrays.toString(b));
        for (char c : b) {
            System.out.print(c);

        }
    }
}

