package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "==Удалить заявку=========";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Введите ID заявки, которую хотите удалить :");
        String id = input.askStr("");
        if (tracker.delete(id)) {
            System.out.println("----------Заявка с ID:" + id + " удалена");
        } else {
            System.out.println("----------Заявка с ID:" + id + " не найдена");
        }
        return true;
    }
}
