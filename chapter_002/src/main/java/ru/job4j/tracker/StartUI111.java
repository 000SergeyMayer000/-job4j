package ru.job4j.tracker;

public class StartUI111 {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                String desc = input.askStr("Enter description: ");
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
                String id = input.askStr("------------Введите ID заявки, которую хотите изменить : ");
                System.out.println("------------ Изменений заявки --------------");
                String name = input.askStr("Введите новое имя заявки :");
                String desc = input.askStr("Введите новое описание заявки :");
                long time = System.currentTimeMillis();
                Item itemnew = new Item(name, desc, time);
                if (tracker.replace(id, itemnew)) {
                    System.out.println("----------Заявка с ID:" + id + " изменена");
                } else {
                    System.out.println("----------Заявка с ID:" + id + " не найдена");
                }
            } else if (select == 3) {
                String id = input.askStr("------------Введите ID заявки, которую хотите удалить : ");
                if (tracker.delete(id)) {
                    System.out.println("----------Заявка с ID:" + id + " удалена");
                } else {
                    System.out.println("----------Заявка с ID:" + id + " не найдена");
                }
            } else if (select == 4) {
                String id = input.askStr("------------Введите ID заявки: ");
                Item item = tracker.findById(id);
                System.out.println("------------Заявка с именем " + item.getName());
                System.out.println("------------ID заявки: " + item.getId());
                System.out.println("------------Дата создания: " + item.getTime());
                System.out.println("------------Описание: " + item.getDecs());
                System.out.println();
            } else if (select == 5) {
                String name = input.askStr("------------Введите имя заявки: ");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI111().init(input, tracker);
    }
}
