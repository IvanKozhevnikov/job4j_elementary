package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int j = 0; j < coins.length; j++) {
            while (money >= coins[j]) {
                money -= coins[j];
                rsl[size++] = coins[j];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}