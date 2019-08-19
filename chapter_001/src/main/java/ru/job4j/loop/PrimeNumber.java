package ru.job4j.loop;

/**
 *  Класс PrimeNumber определяет колличество простых чисел в диапазоне от 2 до указанного.
 */

public class PrimeNumber {
    /**
     * метод calc возращает колличество простых чисел в диапазоне от 2 до finish
     *
     * @param finish
     * @return
     */
    public int calc(int finish) {
        int count = 0;
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        for (int i = 2; i <= finish; i++) {
            if (checkPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
