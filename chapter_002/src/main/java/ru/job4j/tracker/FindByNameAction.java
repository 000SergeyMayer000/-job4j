package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==Поиск заявки по имени==";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------Введите имя заявки: ");
        String name = input.askStr("");
        List<Item> items = tracker.findByName(name);
        System.out.println("------------Найдено " + items.size() + " заявок c таким именем:");
        int count = 1;
        for (Item item1 : items) {
            System.out.println("------------#" + count + " заявка с именем " + item1.getName());
            System.out.println("------------ID заявки: " + item1.getId());
            System.out.println("------------Дата создания: " + item1.getTime());
            System.out.println("------------Описание: " + item1.getDecs());
            count++;
            System.out.println();
        }
        return true;
    }
}