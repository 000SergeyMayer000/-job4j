package ru.job4j.loop;

public class Board {
    /**
     * Класс Board выполняет построение шахматной доски
     * заданных размеров
     *
     * @author Sergey Mayer
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        int i;
        int j;
        for (j = 0; j < height; j++) {
            for (i = 0; i < width; i++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (((i + j) % 2 == 0)) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }    // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}