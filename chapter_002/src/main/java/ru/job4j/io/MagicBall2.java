package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall2 {
    public static void main(String[] args) {
        System.out.println("Что ты хочешь узнать?, спрашивай...");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}