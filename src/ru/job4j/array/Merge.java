package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            count++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[count++] = right[j];
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        for (int i : result) {
            System.out.println(i);
        }
    }
}