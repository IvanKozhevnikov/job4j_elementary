package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Search for a Item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter the name item: ");
        Item[] findItem = tracker.findByName(name);
        if (findItem.length > 0) {
            for (Item item : findItem) {
                System.out.println(item);
            }
        } else {
            System.out.println("The item with this Id number was not found");
        }
        return true;
    }
}
