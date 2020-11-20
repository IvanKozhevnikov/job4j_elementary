package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);
        int in2 = 180;
        int expected2 = 3;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3. Test result : " + passed2);
    }
}
