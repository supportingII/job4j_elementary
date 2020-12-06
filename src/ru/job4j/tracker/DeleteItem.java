package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    private final Output out;

    public DeleteItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("--- Delete item ---");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Item delete.");
        } else {
            out.println("Item not delete. Maybe item 'id' not exist.");
        }
        return true;
    }
}
