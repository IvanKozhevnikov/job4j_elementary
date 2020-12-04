package ru.job4j.tracker;

public class Exit implements UserAction {
    @Override
    public String name() {
        return "=== Exit the Tracker ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("The application is finished");
        return false;
    }
}
