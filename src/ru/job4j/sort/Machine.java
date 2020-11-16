package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
            for (int j = 0; j < rsl.length; j++) {
                while (money > 0) {
                    if (money >= 10) {
                        money -= coins[0];
                        rsl[j] = coins[0];
                        j++;
                    }
                    if (money >= 5 && money < 10) {
                        money -= coins[1];
                        rsl[j] = coins[1];
                        j++;
                    }
                    if (money >= 2 && money < 5) {
                        money -= coins[2];
                        rsl[j] = coins[2];
                        j++;
                    }
                    if (money == 1) {
                        money -= coins[3];
                        rsl[j] = coins[3];
                        j++;
                    }
                    size = j;
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}