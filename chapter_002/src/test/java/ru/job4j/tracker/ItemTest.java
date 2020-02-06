package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;


import java.util.Comparator;
import java.util.List;

public class ItemTest {
    @Test
    public void whenSortByNameAscendingSort() {
        Comparator<Item> sbna = new SortByNameAscItem();
        int rsl = sbna.compare(
                new Item("Ivam"),
                new Item("Anton")
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSortByNameDescendingSort() {
        Comparator<Item> sbnd = new SortByNameDescItem();
        int rsl = sbnd.compare(
                new Item("Ivam"),
                new Item("Anton")
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void when() {
        Comparator<Item> sbna = new SortByNameAscItem();
        Comparator<Item> sbnd = new SortByNameDescItem();
        Tracker tracker = new Tracker();
        tracker.add(new Item("Ivan"));
        tracker.add(new Item("Andrey"));
        tracker.add(new Item("Sergey"));
        List<Item> allItem = tracker.findAll();
        System.out.println("Cписок без сортировки:");
        for (Item item : allItem) {
            System.out.println(item);
        }
        System.out.println();
        allItem.sort(sbna);
        System.out.println("Cписок отсортирован по возрастанию:");
        for (Item item : allItem) {
            System.out.println(item);
        }
        allItem.sort(sbnd);
        System.out.println();
        System.out.println("Cписок отсортирован по убыванию:");
        for (Item item : allItem) {
            System.out.println(item);
        }
    }
}
