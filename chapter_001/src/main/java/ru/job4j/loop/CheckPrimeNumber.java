package ru.job4j.loop;

/**
        * Класс CheckPrimeNumber  проверяет является ли число простым
        * @author Sergey Mayer
        */

public class CheckPrimeNumber {
    /**
     * Метод check  возращает true в случае если число простое
     * @param num -
     * @return
     */
    public boolean check(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}