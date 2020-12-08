package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int count = 0;
        for (String i : value) {
            count++;
            if (i.equals(key)) {
                rsl = count - 1;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("there is no such element in the array");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"Ivan", "Alexander","Vasiliy"};
        String key = "Vasiliy";
        try {
            System.out.println(indexOf(array, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
  /*  int rsl = -1;
        for (int i = 0; i < value.length; i++) {
        if (value[i].equals(key)) {
        rsl = i;
        }
        }
        if (rsl == -1) {
        throw new ElementNotFoundException("there is no such element in the array");
        }
        return rsl;
        }*/