package ru.job4j.tracker.singleton.two;

import ru.job4j.tracker.Item;

public class TrackerSingleTwo {

    private static TrackerSingleTwo instance;


    private TrackerSingleTwo() {
    }

    public static TrackerSingleTwo getInstance() {
        if (instance == null) {
            instance = new TrackerSingleTwo();
        }
        return instance;
    }

    public Item add(Item item) {
        return item;
    }
}