package ru.job4j.io;

import java.util.Scanner;

public class Matches2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int gamer1;
        int gamer2;
        boolean a = true;
        while (matches > 0) {
            System.out.println("Игрок 1 выберите колличество спичек от 1 до 3");
            gamer1 = input.nextInt();
            matches = matches - gamer1;
            if (matches <= 0) {
                System.out.println("Игрок 1 проиграл");
                a = false;
            } else {
                System.out.println("На столе осталось " + matches + " спичек");
                System.out.println("Игрок 2 выберите колличество спичек от 1 до 3");
                gamer2 = input.nextInt();
                matches = matches - gamer2;
                if (matches <= 0) {
                    System.out.println("Игрок 2 проиграл");
                    a = false;
                }
            }
            System.out.println("На столе осталось " + matches + " спичек");
        }
    }
}
