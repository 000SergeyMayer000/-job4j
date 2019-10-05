package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "==Редактировать заявку===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Введите ID заявки, которую хотите изменить :");
        String id = input.askStr("");
        Item item = tracker.findById(id);
        System.out.println("Введите новое имя заявки :");
        String name = input.askStr("");
        System.out.println("Введите новое описание заявки :");
        String desc = input.askStr("");
        long time = System.currentTimeMillis();
        Item itemnew = new Item(name, desc, time);
        item = itemnew;
        if (tracker.replace(id, item)) {
            System.out.println("----------Заявка с ID:" + id + " изменена");
        } else {
            System.out.println("----------Заявка с ID:" + id + " не найдена");
        }
        return true;
    }
}
