package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells ;
        if (list.size() % rows == 0) {
            cells = list.size() / rows;
        } else {
            cells = (list.size() / rows) + 1;
        }
        int[][] array = new int[rows][cells];
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (list.size() > counter) {
                    array[i][j] = list.get(counter++);
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}

