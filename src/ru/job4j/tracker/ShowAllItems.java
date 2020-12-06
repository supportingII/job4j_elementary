package ru.job4j.tracker;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("--- All items ---");
        for (Item item : tracker.findAll()) {
            System.out.println(item);
        }
        return true;
    }
}
