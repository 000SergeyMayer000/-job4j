package ru.job4j.array;

/**
 * Класс FindLoop возращает индекс исклмлго элемента
 */

public class FindLoop {
    /**
     *
     * @param data
     * @param el
     * @return
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index <= data.length - 1; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}