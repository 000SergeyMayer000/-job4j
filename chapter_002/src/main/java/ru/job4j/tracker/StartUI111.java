package ru.job4j.tracker;

public class StartUI111 {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Выберите пункт меню: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("           Меню.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new AllShowAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindIDAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI111().init(input, tracker, actions);
    }
}
