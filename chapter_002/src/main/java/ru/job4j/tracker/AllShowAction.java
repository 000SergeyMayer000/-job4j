package ru.job4j.tracker;

import java.util.List;

/**
 * класс AllShowAction реализует интерфейс UserAction
 * @autor SergeyMayer
 * @since
 * @version
 */
public class AllShowAction implements UserAction {
    /**
     *
     * @return - метод name возращает строку с именем пункта меню
     */
    @Override
    public String name() {
        return "==Показать все заявки ===";
    }

    /**
     * метод execute выводит заявку в консоль
     * @param input  -
     * @param tracker -
     * @return
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> allitems = tracker.findAll();
        for (Item item : allitems) {
            System.out.println("Заявка с именем " + item.getName());
            System.out.println("ID заявки: " + item.getId());
            System.out.println("Дата создания: " + item.getTime());
            System.out.println("Описание: " + item.getDecs());
        }
        return true;
    }
}
