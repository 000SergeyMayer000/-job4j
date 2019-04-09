package ru.job4j.array;

/**
 * Класс Turn переворачивает массив задом наперед.
 *
 * @author Mayer Sergej
 * @since 09.04.2019
 */
public class Turn {
    /**
     * @param array
     * @return
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}