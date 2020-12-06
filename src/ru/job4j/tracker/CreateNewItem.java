package ru.job4j.tracker;

public class CreateNewItem implements UserAction {
    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("--- Creat a new item ---");
        String nameItem = input.askStr("Enter name:");
        Item item = new Item(nameItem);
        tracker.add(item);
        return true;
    }
}
