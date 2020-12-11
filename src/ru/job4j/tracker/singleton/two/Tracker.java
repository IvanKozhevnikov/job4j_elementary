package ru.job4j.tracker.singleton.two;

import ru.job4j.tracker.Item;

public class Tracker {

    private static Tracker instance;

    private Tracker() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return item;
    }
}

