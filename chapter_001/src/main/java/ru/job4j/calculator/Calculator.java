package ru.job4j.calculator;

/**
 * Класс Calculator выполняет сложение,
 * вычитание, деление у умножение двух чисел
 *
 * @author Sergey Mayer
 */
public class Calculator {
    /**
     * Сложение
     *
     * @param first  первое значение
     * @param second второе значение
     * @return результат
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * вычитание
     *
     * @param first  первое значение
     * @param second второе знвачение
     * @return результат
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * деление
     *
     * @param first  первое значение
     * @param second второе знвачение
     * @return результат
     */

    public double div(double first, double second) {
        return first / second;
    }

    /**
     * умножение
     *
     * @param first  первое значение
     * @param second второе знвачение
     * @return результат
     */

    public double multiple(double first, double second) {
        return first * second;
    }
}
