package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter description: ");
                String desc = scanner.nextLine();
                long time = System.currentTimeMillis();
                Item item = new Item(name, desc, time);
                tracker.add(item);
            } else if (select == 1) {
                Item[] ai = tracker.findAll();
                for (Item item : ai) {
                    System.out.println("------------Заявка с именем " + item.getName());
                    System.out.println("------------ID заявки: " + item.getId());
                    System.out.println("------------Дата создания: " + item.getTime());
                    System.out.println("------------Описание: " + item.getDecs());
                    System.out.println();
                }
            } else if (select == 2) {
                System.out.println("------------Введите ID заявки, которую хотите изменить : ");
                String id = scanner.nextLine();
                System.out.println("------------ Изменений заявки --------------");
                System.out.println("Введите новое имя заявки :");
                String name = scanner.nextLine();
                System.out.println("Введите новое описание заявки :");
                String desc = scanner.nextLine();
                long time = System.currentTimeMillis();
                Item itemnew = new Item(name, desc, time);
                if (tracker.replace(id, itemnew)) {
                    System.out.println("----------Заявка с ID:" + id + " изменена");
                } else {
                    System.out.println("----------Заявка с ID:" + id + " не найдена");
                }
            } else if (select == 3) {
                System.out.println("------------Введите ID заявки, которую хотите удалить : ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("----------Заявка с ID:" + id + " удалена");
                } else {
                    System.out.println("----------Заявка с ID:" + id + " не найдена");
                }
            } else if (select == 4) {
                System.out.println("------------Введите ID заявки: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.println("------------Заявка с именем " + item.getName());
                System.out.println("------------ID заявки: " + item.getId());
                System.out.println("------------Дата создания: " + item.getTime());
                System.out.println("------------Описание: " + item.getDecs());
                System.out.println();
            } else if (select == 5) {

                System.out.println("------------Введите имя заявки: ");
                String name = scanner.nextLine();
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
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

}
