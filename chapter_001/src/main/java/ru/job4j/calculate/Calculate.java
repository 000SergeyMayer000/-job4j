package ru.job4j.calculate;

/**
 * Класс Calculate выводит текстовое сообщение "Hello world" в консоль
 * @author Sergey Mayer
 */
public class Calculate {
    /**
     *  Main method точка входа в программу.
     * @param  args - args.
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    /**
     * Method echo.
     * @param name Sergey Mayer.
     * @return Echo plus Sergey Mayer.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}