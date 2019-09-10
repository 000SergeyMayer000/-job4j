package ru.job4j.tracker;

import java.util.Date;

public class StartUI {
    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINFBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";

    private final Input input;
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALL.equals(answer)) {
                tracker.findAll();
            } else if (EDIT.equals(answer)) {
tracker.replace(input.ask("Введите ID"),input.ask("Введите имя заявки", input.ask("Введите описание заявки"), 10 );
//            } else if (DELETE.equals(answer)) {
//tracker.delete();
//            } else if (FINFBYID.equals(answer)) {
//tracker.findById():
//            } else if (FINDBYNAME.equals(answer)) {
//tracker.findByName()
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void showMenu() {
        System.out.println("------------Меню------------.");
        System.out.println("Добавить заявку - 0");
        System.out.println("Показать все заявки - 1");
        System.out.println("Редактировать заявку - 2");
        System.out.println("Удалить заявку - 3");
        System.out.println("Поиск по ID - 4");
        System.out.println("Поиск по имени - 5");
        System.out.println("Выход из прогроаммы - 6");
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        long time= System.currentTimeMillis();
        Item item = new Item(name, desc,time);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }


    public static void main(String[] args) {
        new StartUI(new ConsolInput(), new Tracker()).init();
    }
}



