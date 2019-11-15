package ru.job4j.array;

/**
 * Класс MatrixCheck проверяет все ли элемента массива true или false по диаганалям
 */
public class MatrixCheck {
    /**
     * @param data
     * @return
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int n = data.length; // размер массива
        int k = 0; // необходимое колличество проверок
        for (int i = 0; i < n - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
                break;
            }
            if (data[i][n - 1 - i] != data[i + 1][n - i - 2]) {
                result = false;
                break;
            }
        }
        return result;
    }
}