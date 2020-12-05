package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        int a = 0;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int i = indexOf(id);
        boolean rsl = i != -1;
        if (rsl) {
            System.arraycopy(items, (i + 1), items, i, (size - i));
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

    public Item findById(int id) {
        int i = indexOf(id);
        return i != -1 ? items[i] : null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                rsl[count] = items[i];
                count++;
                break;
            }
        }
        return rsl;
    }
}