package ru.job4j.list;

import java.util.List;

public class Test {

        public static int[][] toArray(List<Integer> list, int cells) {
            int groups = (int) Math.ceil((double) list.size() / cells);
            System.out.println(groups);
            int[][] array = new int[groups][cells];
            return array;
        }

        public static void main(String[] args) {
            List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
            int[][] rsl = toArray(list, 3);
            for (int[] row : rsl) {
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }
    }

