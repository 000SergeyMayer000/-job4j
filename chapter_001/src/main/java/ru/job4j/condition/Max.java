package ru.job4j.condition;

/**
 * Класс Max возращает большее число из двух.
 *
 * @author Sergey Mayer
 */

public class Max {
    public int max(int left, int right) {
        int result = left;
        return left > right ? left : right;
    }
}