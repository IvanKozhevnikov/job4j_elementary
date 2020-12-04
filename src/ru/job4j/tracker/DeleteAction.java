package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete an Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("The item was deleted successfully");
        } else {
            System.out.println("The item with this Id number was not found");
        }
        return true;
    }
}
