package ru.job4j.tracker;

public class PrintAction implements UserAction {
    private final Output out;

    public PrintAction(Output out) {
        this.out = out;

    }
    @Override
    public String name() {
        return "=== Printing a list of Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("The entire list of items");
        Item[] allListTracker = tracker.findAll();
        for (Item item : allListTracker) {
            out.println(item);
        }
        return true;
    }
}
