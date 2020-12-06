package ru.job4j.tracker;

public class ReplaceItem implements UserAction {

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("--- Replace item ---");
        int id = input.askInt("Enter id: ");
        String nameItem = input.askStr("Enter name:");
        Item newItem = new Item(nameItem);
        if (tracker.replace(id, newItem)) {
            System.out.println("Replace complete.");
        } else {
            System.out.println("Replace not complete. Maybe item 'id' not exist.");
        }
        return true;
    }
}
