package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl += array[row][cell];
            }
        }
        return rsl;
    }
}
/* for (int[] ints : array) {
         for (int cell = 0; cell < ints.length; cell++) {
        rsl += ints[cell];
        }
        }*/