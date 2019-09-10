package ru.job4j.tracker;

import java.util.Scanner;

public class ConsolInput implements Input {
    private Scanner scanner = new Scanner(System.in);


    @Override
    public String ask(String queastion) {
        System.out.print(queastion);
        return scanner.nextLine();
    }
}
