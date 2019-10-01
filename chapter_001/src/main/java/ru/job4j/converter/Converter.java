package ru.job4j.converter;

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
    public static double rubleToEuro(double value) {
        return (double) value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */

    public static double rubleToDollar(double value) {
        return (double) value / 60;
    }

    /**
     * онвертируем евро в рубли.
     *
     * @param value евро
     * @return рубли
     */

    public static double evroToRubli(double value) {
        return (double) value * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     *
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
//    public static void main(String[] args) {
//        Converter cur = new Converter();
//        double dollar = cur.rubleToDollar(120);
//        System.out.println(dollar);
//        double evro = cur.rubleToEuro(140);
//        System.out.println(evro);
//        double rubfromdollar = cur.rubleToDollar(600);
//        System.out.println(rubfromdollar);
//        double rubfromevro = cur.rubleToEuro(1400);
//        System.out.println(rubfromevro);
  //  }
    public static void main(String[] args) {
        double in = 140;
        double expected = 2;
        double out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
