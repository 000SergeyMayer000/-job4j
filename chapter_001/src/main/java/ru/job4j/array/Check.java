
package ru.job4j.array;

/**
 * Класс Check проверяет все ли элементы массива   являются true или false
 */

public class Check {
    /**
     * @param data
     * @return
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] == data[index + 1]) {
                result = true;
            } else {
                result = false;
            }

        }
        return result;
    }

}