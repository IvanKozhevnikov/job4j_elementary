package ru.job4j.ex;

import java.util.Arrays;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String i : value) {
            if (i.equals(key)) {
                rsl = Arrays.asList(value).indexOf(i);
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("there is no such element in the array");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"Ivan", "Alexander"};
        String key = "Alexander";
        try {
            System.out.println(indexOf(array, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
