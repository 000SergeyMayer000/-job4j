package ru.job4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * на примере класса PrintStream описывается возможное использывании ввода информации в какой-то поток.
 */
public class MainPrintStream {
    /**
     * в методе представлен пример реализации передачи потака в файл
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream filePrintStream = new PrintStream(new File("C:\\Users\\hil\\Desktop\\MyFile.txt")); //в конструктор передается адрес файла, куда будет записаны данные
        filePrintStream.println(222);
        filePrintStream.println("Hello world");
        filePrintStream.println(false);
    }
}