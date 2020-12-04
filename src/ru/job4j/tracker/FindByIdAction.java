package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Search for a Item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the number Id: ");
        Item findItem = tracker.findById(id);
        if (findItem != null) {
            System.out.println("Found item: " + findItem.toString());
        } else {
            System.out.println("The item with this Id number was not found");
        }
        return true;
    }
}
