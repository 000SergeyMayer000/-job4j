package ru.job4j.loop;
/**
 * Класс Counter выполняет сложение сложение четных чисел
 * в заданном интервале.
 *
 * @author Sergey Mayer
 */
public class Counter {
    /**
     *
     * @param start  первое значение
     * @param  finish второе значение
     * @return результат
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (start = 0; start <= finish; start++) {
            if (start % 2 == 1) {
                continue;

            }
            sum = sum + start;
        }
        return sum;
    }
}