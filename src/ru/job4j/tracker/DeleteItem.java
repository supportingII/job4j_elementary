package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("--- Delete item ---");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item delete.");
        } else {
            System.out.println("Item not delete. Maybe item 'id' not exist.");
        }
        return true;
    }
}