package ru.job4j.array;

/**
 * класс BubbleSort сортирует массив целых чисел, используя алгоритм сортировки пузырьком.
 *
 * @author Mayer Sergey.
 * @version 3.0
 * @since 12.04.2016
 */
public class BubbleSort {
    /**
     * @param data
     * @return
     */
    public int[] sort(int[] data) {
        boolean sorted = true;
        for (int i = 0; i < data.length; i++) {
            for (int index = 0; index < (data.length - 1-i); index++) {
                if (data[index] > data[index + 1]) {
                    int temp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return data;
    }
}
