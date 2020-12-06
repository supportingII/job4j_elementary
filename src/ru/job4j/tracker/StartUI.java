package ru.job4j.tracker;

public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

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
        out.println("Menu.");
        for (int i = 0; i < actions.length; i++) {
            out.println(i + ". " + actions[i].name() + ".");
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateNewItem(output),
                new ShowAllItems(output),
                new ReplaceItem(output),
                new DeleteItem(output),
                new FindById(output),
                new FindByName(output),
                new ExitTracker()
        };
        new StartUI(output).init(input, tracker, actions);
    }

}
