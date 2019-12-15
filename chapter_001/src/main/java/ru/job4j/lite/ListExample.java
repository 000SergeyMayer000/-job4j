package ru.job4j.lite;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(425);
        Integer value = list.get(0);
        System.out.println(value);
        list.add(1, 32);
        System.out.println(list.get(1));

        List<Integer> flats = new ArrayList<>();
        flats.add(4); // index=2
        flats.add(3); // index=3

        list.addAll(flats);

        System.out.println(String.format("find 4 index : %s", list.indexOf(4)));

        System.out.println(String.format("find 4 lastindex : %s", list.lastIndexOf(4))); // поиск с конца
        list.remove(2);

        System.out.println(String.format("find 4 index : %s", list.indexOf(4))); // поиск индекас элемента 4
        System.out.println(String.format("find 4 index : %s", list.indexOf(3))); //после удаления элемента 4
        // эемент 3 занял его позицию и его index = 2

    }
}
