package ru.job4j.tracker;


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
                this.allItemsshow();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINFBYID.equals(answer)) {
                this.findID();
            } else if (FINDBYNAME.equals(answer)) {
                this.findName();
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
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с Id : " + item.getId() + "-----------");
    }

    private void allItemsshow() {
        Item[] ai = this.tracker.findAll();
        for (Item item : ai) {
            System.out.println("------------Заявка с именем " + item.getName());
            System.out.println("------------ID заявки: " + item.getId());
            System.out.println("------------Дата создания: " + item.getTime());
            System.out.println("------------Описание: " + item.getDecs());
            System.out.println();
        }
    }

    private void editItem() {
        Item[] ai = this.tracker.findAll();
        String id = this.input.ask("------------Введите ID заявки, которую хотите изменить : ");
        Item item = this.tracker.findById(id);
        System.out.println("------------ Изменений заявки --------------");
        String name = this.input.ask("Введите новое имя заявки :");
        String desc = this.input.ask("Введите новое описание заявки :");
        long time = System.currentTimeMillis();
        Item itemnew = new Item(name, desc, time);
        item=itemnew;
//        if (this.tracker.replace(id, item)) {
//            System.out.println("----------Заявка с ID:" + id + " изменена");
//        } else {
//            System.out.println("----------Заявка с ID:" + id + " не найдена");
//        }
    }


    private void deleteItem() {
        Item[] ai = this.tracker.findAll();
        String id = this.input.ask("------------Введите ID заявки, которую хотите удалить : ");
        Item item = this.tracker.findById(id);
        if (this.tracker.delete(id)) {
            System.out.println("----------Заявка с ID:" + id + " удалена");
        } else {
            System.out.println("----------Заявка с ID:" + id + " не найдена");
        }
    }


    private void findID() {
        Item[] ai = this.tracker.findAll();
        String id = this.input.ask("------------Введите ID заявки: ");
        Item item = this.tracker.findById(id);
        System.out.println("------------Заявка с именем " + item.getName());
        System.out.println("------------ID заявки: " + item.getId());
        System.out.println("------------Дата создания: " + item.getTime());
        System.out.println("------------Описание: " + item.getDecs());
        System.out.println();
    }

    private void findName() {
        Item[] ai = this.tracker.findAll();
        String name = this.input.ask("------------Введите имя заявки: ");
        Item[] item = this.tracker.findByName(name);
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
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}



