package ru.job4j.tracker.singleton.one;

import ru.job4j.tracker.Item;

public enum Tracker {
    INSTANCE; /* здесь мы указываем перечисления. */

    /* Конструкторы и методы. */
    Tracker() {
    }
    public Item add(Item model) {
        return model;
    }
}