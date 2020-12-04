package ru.job4j.tracker;

public class PrintAction implements UserAction {
    @Override
    public String name() {
        return "=== Printing a list of Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("The entire list of items");
        Item[] allListTracker = tracker.findAll();
        for (Item item : allListTracker) {
            System.out.println(item);
        }
        return true;
    }
}
