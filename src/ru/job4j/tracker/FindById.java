package ru.job4j.tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("--- Find item by Id ---");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item not found.");
        } else {
            System.out.println(item);
        }
        return true;
    }
}
