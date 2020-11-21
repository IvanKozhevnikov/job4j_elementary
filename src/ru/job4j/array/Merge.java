package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (count1 < left.length) {
                if (count2 < right.length) {
                    if (left[count1] < right[count2]) {
                        rsl[i] = left[count1++];
                    } else {
                        rsl[i] = right[count2++];
                    }
                } else {
                    rsl[i] = left[count1++];
                }
            } else {
                rsl[i] = right[count2++];
            }
        }
        return rsl;
    }
}