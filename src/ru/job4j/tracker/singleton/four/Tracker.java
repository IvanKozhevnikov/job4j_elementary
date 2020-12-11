package ru.job4j.tracker.singleton.four;

import ru.job4j.tracker.Item;

public class Tracker {
    private Tracker() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item item) {
        return item;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static void main(String[] args) {
        Tracker tracker = Tracker.getInstance();
    }
}