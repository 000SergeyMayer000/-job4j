package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "==Поиск заявки по имени==";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------Введите имя заявки: ");
        String name = input.askStr("");
        Item[] item = tracker.findByName(name);
        System.out.println("------------Найдено " + item.length + " заявок c таким именем:");
        int count = 1;
        for (Item item1 : item) {
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
