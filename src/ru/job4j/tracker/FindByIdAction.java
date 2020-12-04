package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Search for a Item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the number Id: ");
        Item findItem = tracker.findById(id);
        if (findItem != null) {
            out.println("Found item: " + findItem.toString());
        } else {
            out.println("The item with this Id number was not found");
        }
        return true;
    }
}
