package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double s = SqArea.square(p, k);
        System.out.println(" perimeter = " + p + ", coefficient = " + k + ", area = " + s);
    }
}
