package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return ((height - 100) * 1.15);
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return ((height - 110) * 1.15);
    }

    /**
     * метод main
     * @param args
     */
    public static void main(String[] args) {
        Fit ves = new Fit();
        double man = ves.manWeight(184);
        System.out.println(man);
        double women = ves.womanWeight(165);
        System.out.println(women);
    }
}


