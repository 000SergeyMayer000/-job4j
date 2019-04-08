package ru.job4j.array;

/**
 * Класс одномерный  Square заполняе массив числами возведенными в квадрат
 */
public class Square {
    /**
     * @param bound количество элементов в массиве
     * @return
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int num = 1; num <= bound; num++) {
            rst[num - 1] = num * num;
        }
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }
}