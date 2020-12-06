package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-");
            this.showMenu(actions);
            int numberMenu = input.askInt("Select: ");
            run = actions[numberMenu].execute(input, tracker);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-");
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name() + ".");
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateNewItem(),
                new ShowAllItems(),
                new ReplaceItem(),
                new DeleteItem(),
                new FindById(),
                new FindByName(),
                new ExitTracker()
        };
        new StartUI().init(input, tracker, actions);
    }

}
