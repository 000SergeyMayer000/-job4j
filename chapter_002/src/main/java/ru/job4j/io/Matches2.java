package ru.job4j.io;

import java.util.Scanner;

public class Matches2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean turn  = true;
        while (matches > 0) {
            System.out.println("Игрок 1 выберите колличество спичек от 1 до 3");
            matches = matches - input.nextInt();
            if (matches <= 0) {
                System.out.println("Игрок 1 проиграл");
                turn  = false;
            } else {
                System.out.println("На столе осталось " + matches + " спичек");
                System.out.println("Игрок 2 выберите колличество спичек от 1 до 3");
                matches = matches - input.nextInt();
                if (matches <= 0) {
                    System.out.println("Игрок 2 проиграл");
                    turn  = false;
                }
            }
            System.out.println("На столе осталось " + matches + " спичек");
        }
    }
}
