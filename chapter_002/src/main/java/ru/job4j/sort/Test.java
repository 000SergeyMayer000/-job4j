package ru.job4j.sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final int[] COINS = {10, 5, 2, 1};
        int money = 100;
        int price = 35;
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (change >= COINS[i]) {
                change -= COINS[i];
                rsl[size++] = COINS[i];
                System.out.println(COINS[i]);
            }
        }

        System.out.print(Arrays.toString(Arrays.copyOf(rsl, size)));

        int sdacha = 0;
        for (int i : rsl) {
            sdacha = sdacha + i;
        }
        System.out.println(sdacha);
    }
}

