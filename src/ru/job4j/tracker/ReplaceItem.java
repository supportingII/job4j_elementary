package ru.job4j.tracker;

public class ReplaceItem implements UserAction {

    private final Output out;

    public ReplaceItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("--- Replace item ---");
        int id = input.askInt("Enter id: ");
        String nameItem = input.askStr("Enter name:");
        Item newItem = new Item(nameItem);
        if (tracker.replace(id, newItem)) {
            out.println("Replace complete.");
        } else {
            out.println("Replace not complete. Maybe item 'id' not exist.");
        }
        return true;
    }
}
