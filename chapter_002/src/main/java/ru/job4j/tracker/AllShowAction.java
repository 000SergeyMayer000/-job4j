package ru.job4j.tracker;

public class AllShowAction implements UserAction {
    @Override
    public String name() {
        return "==Показать все заявки ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] ai = tracker.findAll();
        for (Item item : ai) {
            System.out.println("Заявка с именем " + item.getName());
            System.out.println("ID заявки: " + item.getId());
            System.out.println("Дата создания: " + item.getTime());
            System.out.println("Описание: " + item.getDecs());
        }
        return true;
    }
}
