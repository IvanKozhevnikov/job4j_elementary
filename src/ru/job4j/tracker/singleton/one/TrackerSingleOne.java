package ru.job4j.tracker.singleton.one;

import ru.job4j.tracker.Item;

public enum TrackerSingleOne {
    INSTANCE;

    TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}