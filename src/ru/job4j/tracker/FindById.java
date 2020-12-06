package ru.job4j.tracker;

public class FindById implements UserAction {

    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("--- Find item by Id ---");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            out.println("Item not found.");
        } else {
            out.println(item);
        }
        return true;
    }
}
