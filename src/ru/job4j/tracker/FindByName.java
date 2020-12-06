package ru.job4j.tracker;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("--- Find item by name ---");
        String nameItem = input.askStr("Enter name:");
        Item[] itemList = tracker.findByName(nameItem);
        if (itemList.length == 0) {
            System.out.println("Item not found.");
        } else {
            for (Item item : itemList) {
                System.out.println(item);
            }
        }
        return true;
    }
}
