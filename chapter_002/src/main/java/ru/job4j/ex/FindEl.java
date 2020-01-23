package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String str : value) {
            if (str.equals(key)) {
                rsl = index;
                break;
            }
            index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"111", "222", "333"}, "444"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("после обработки исключения программа продолжает работать");
    }
}
