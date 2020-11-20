package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                for (int j = point; j < array.length; j++) {
                    if (array[j] != null) {
                        int word = j;
                        SwitchArray.swap(array, point, word);
                        break;
                    }
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }
}