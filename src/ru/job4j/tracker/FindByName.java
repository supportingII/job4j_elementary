package ru.job4j.tracker;

public class FindByName implements UserAction {

    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("--- Find item by name ---");
        String nameItem = input.askStr("Enter name:");
        Item[] itemList = tracker.findByName(nameItem);
        if (itemList.length == 0) {
            out.println("Item not found.");
        } else {
            for (Item item : itemList) {
                out.println(item);
            }
        }
        return true;
    }
}
