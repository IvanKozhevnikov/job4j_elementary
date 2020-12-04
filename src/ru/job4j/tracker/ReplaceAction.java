package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;

    }
    @Override
    public String name() {
        return "=== Replacing an Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the number Id: ");
        String name = input.askStr("Enter a new name item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("The item was successfully modified");
        } else {
            out.println("runtime error");
        }
        return true;
    }
}
