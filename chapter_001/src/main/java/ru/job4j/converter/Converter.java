package ru.job4j.converter;

import java.sql.SQLOutput;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(double value) {
        return (double) value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */

    public double rubleToDollar(double value) {
        return (double) value / 60;
    }

    /**
     * онвертируем евро в рубли.
     * @param value евро
     * @return рубли
     */

    public double evroToRubli(double value) {
        return (double) value * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары
     * @return рубли
     */

    public double dollarToRubli(double value) {
        return (double) value * 60;
    }

    /**
     * метод main
     *
     * @param args args
     */
    public static void main(String[] args) {
        Converter cur = new Converter();
        double dollar = cur.rubleToDollar(120);
        System.out.println(dollar);
        double evro = cur.rubleToEuro(140);
        System.out.println(evro);
        double rubfromdollar = cur.rubleToDollar(600);
        System.out.println(rubfromdollar);
        double rubfromevro = cur.rubleToEuro(1400);
        System.out.println(rubfromevro);
    }

}
