package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "==Создание новой заявки==";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Введите имя заявки: ");
        String name = input.askStr("");
        System.out.println("Введите описание: ");
        String desc = input.askStr("");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        tracker.add(item);
        return true;
    }
}