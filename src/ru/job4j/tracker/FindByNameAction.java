package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;

    }
    @Override
    public String name() {
        return "=== Search for a Item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter the name item: ");
        List<Item> findItem = tracker.findByName(name);
        if (findItem.size() > 0) {
            for (Item item : findItem) {
                out.println(item);
            }
        } else {
            out.println("The item with this Id number was not found");
        }
        return true;
    }
}
