package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < rsl.length; i++) {
            money = money - price;
            size = i;

        }
       /*while () {
        }*/
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] rsl = Machine.change(50, 35);
    }
}