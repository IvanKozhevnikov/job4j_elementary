package ru.job4j.tracker.singleton.three;

import ru.job4j.tracker.Item;

public class Tracker {
    private static final Tracker INSTANCE = new Tracker();

    private Tracker() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }

    public Item add(Item item) {
        return item;
    }

    public static void main(String[] args) {
        Tracker tracker = Tracker.getInstance();
    }
}