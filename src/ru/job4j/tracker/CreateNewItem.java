package ru.job4j.tracker;

public class CreateNewItem implements UserAction {

    private final Output out;

    public CreateNewItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("--- Creat a new item ---");
        String nameItem = input.askStr("Enter name:");
        Item item = new Item(nameItem);
        tracker.add(item);
        return true;
    }
}
