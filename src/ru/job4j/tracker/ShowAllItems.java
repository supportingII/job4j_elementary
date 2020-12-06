package ru.job4j.tracker;

public class ShowAllItems implements UserAction {

    private final Output out;

    public ShowAllItems(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("--- All items ---");
        for (Item item : tracker.findAll()) {
            out.println(item);
        }
        return true;
    }
}
