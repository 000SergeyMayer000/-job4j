package ru.job4j.loop;
/**
 * Класс Factorial вычисляет значение факториала от заданного числа.
 *
 * @author Sergey Mayer
 */
public class Factorial {
    public int calc(int n) {
        int result = 1;
        int m = 1;
        for (m = 1; m <= n; m++) {
            result = result * m;
        }

        return result;
    }
}