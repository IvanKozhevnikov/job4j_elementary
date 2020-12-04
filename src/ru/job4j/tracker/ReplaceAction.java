package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
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
            System.out.println("The item was successfully modified");
        } else {
            System.out.println("runtime error");
        }
        return true;
    }
}
