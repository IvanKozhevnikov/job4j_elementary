package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        int id = 0;
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        System.out.println(tracker.findById(id));
        }
    }


