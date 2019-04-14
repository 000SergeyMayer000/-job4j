package ru.job4j.array;

import java.util.Arrays;
/**
 * класс ArrayDuplicate дубликат из массива.
 */

public class ArrayDuplicate {
    /**
     *
     * @param array входной массив.
     * @return массив без дублей.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out] == array[in]) {
                    array[in] = array[unique - 1];
                    unique--;
                }
            }
        }
        return Arrays.copyOf(array,unique);
    }
}