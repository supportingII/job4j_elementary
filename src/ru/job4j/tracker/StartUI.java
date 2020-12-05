package ru.job4j.tracker;

public class StartUI {

    public static void createNewItem(Input input, Tracker tracker) {
        System.out.println("--- Creat a new item ---");
        String nameItem = input.askStr("Enter name:");
        Item item = new Item(nameItem);
        tracker.add(item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("--- All items ---");
        for (Item item : tracker.findAll()) {
            System.out.println(item);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("--- Replace item ---");
        int id = StartUI.getEnterIdItem(input);
        String nameItem = StartUI.getEnterNameItem(input);
        Item newItem = new Item(nameItem);
        if (tracker.replace(id, newItem)) {
            System.out.println("Replace complete.");
        } else {
            System.out.println("Replace not complete. Maybe item 'id' not exist.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("--- Delete item ---");
        int id = StartUI.getEnterIdItem(input);
        if (tracker.delete(id)) {
            System.out.println("Item delete.");
        } else {
            System.out.println("Item not delete. Maybe item 'id' not exist.");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("--- Find item by Id ---");
        int id = StartUI.getEnterIdItem(input);
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item not found.");
        } else {
            System.out.println(item);
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("--- Find item by name ---");
        String nameItem = getEnterNameItem(input);
        Item[] itemList = tracker.findByName(nameItem);
        if (itemList.length == 0) {
            System.out.println("Item not found.");
        } else {
            for (Item item : itemList) {
                System.out.println(item);
            }
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-");
            this.showMenu();
            int numberMenu = input.askInt("Select: ");
            if (numberMenu == 0) {
                StartUI.createNewItem(input, tracker);
            } else if (numberMenu == 1) {
                StartUI.showAllItems(tracker);
            } else if (numberMenu == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (numberMenu == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (numberMenu == 4) {
                StartUI.findById(input, tracker);
            } else if (numberMenu == 5) {
                StartUI.findByName(input, tracker);
            } else if (numberMenu == 6) {
                run = false;
            } else {
                System.out.println("Number is not correct.");
            }
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-");
        }
    }

    private static int getEnterIdItem(Input input) {
        return input.askInt("Enter id: ");
    }

    private static String getEnterNameItem(Input input) {
        return input.askStr("Enter name:");
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}