package ru.job4j.tracker;

public class FindIDAction implements  UserAction {
    @Override
    public String name() {
        return "==Поиск заявки по ID=====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------Введите ID заявки: ");
        String id = input.askStr("");
        Item item = tracker.findById(id);
        System.out.println("------------Заявка с именем " + item.getName());
        System.out.println("------------ID заявки: " + item.getId());
        System.out.println("------------Дата создания: " + item.getTime());
        System.out.println("------------Описание: " + item.getDecs());
        return true;
    }
}