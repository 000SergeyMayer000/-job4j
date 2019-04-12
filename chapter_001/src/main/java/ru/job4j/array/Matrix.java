package ru.job4j.array;

/**
 * Класс Matrix реализует двухмерный массив "таблица умножения"
 */
public class Matrix {
    /**
     * @param size
     * @return
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i != size; i++) {
            for (int j = 0; j != size; j++) {
                table[i][j] = (1 + i) * (1 + j);

            }
        }
        return table;
    }

}