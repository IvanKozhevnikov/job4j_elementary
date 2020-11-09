package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number; i++) {
            if (number % number == 0 && number % 2 != 0 || number == 2) {
                return prime;
            }
        }
        return false;
    }
}