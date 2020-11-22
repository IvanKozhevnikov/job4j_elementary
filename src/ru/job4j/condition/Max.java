package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return second > first ? second : first;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }
}
