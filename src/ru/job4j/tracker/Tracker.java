package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findByAll() {
        Item[] rsl = new Item[items.length];
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                rsl[size] = items[index];
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
               rsl = findByAll();
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}