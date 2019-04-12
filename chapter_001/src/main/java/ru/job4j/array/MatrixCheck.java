package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = false;
        int n = data.length;// размер массива
        int k = 0;// необходимое колличество проверок
        for (int i = 0; i < n - 1; i++) {
            if (data[i][i] == data[i + 1][i + 1]) {
                if (data[i][n - 1 - i] == data[i + 1][n - i - 2]) {
                    result = true;
                    k += 1;

                }
            }
            if (k == n - 1) {
                break;


            }

        }
        return result;
    }
}


