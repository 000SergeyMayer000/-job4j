package ru.job4j.loop;

/**
 * Класс Mortgage считает колличество лет на погашение кредита
 */
public class Mortgage {
    /**
     * Метод year  возращает целлое кол-во лет для погашения кредита.
     * @param amount - сумма взятая в кредит, руб
     * @param monthly - ежемесячный платеж, руб
     * @param percent - процентная ставка, %
     * @return -
     */
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        double debt = amount * (1 + (percent / 100));
        while (debt > 0) {
            year++;
            debt = debt - 12 * monthly;
        }
        return year;
    }
}
