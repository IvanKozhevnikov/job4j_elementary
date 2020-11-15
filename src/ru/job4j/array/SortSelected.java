package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length); // findMin ищет min в указаном диапазоне и записывает в переменную min
            int index = FindLoop.indexOf(data, min, i, data.length); // indexOf ищет указанное число в указаном диапазоне
            SwitchArray.swap(data, i, index);  // swap меняет местами значения из указанных ячеек
            /* swap(...) */
        }
        return data;
    }
}