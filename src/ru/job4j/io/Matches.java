package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        while (count > 0) {
            do {
                System.out.println("Игрок 1: берите спички.");
                int selectFirst = Integer.valueOf(input.nextLine());
                count -= selectFirst;

                if (count > 0) {
                    System.out.println("Количество спичек на столе " + count);
                    System.out.println();
                }
                if (count <= 0) {
                    System.out.println("Игрок 1 выйграл");
                    break;
                }
                System.out.println("Игрок 2: берите спички.");
                int selectSecond = Integer.valueOf(input.nextLine());
                count -= selectSecond;
                if (count > 0) {
                    System.out.println("Количество спичек на столе " + count);
                    System.out.println();
                }
                if (count <= 0) {
                    System.out.println("Игрок 1 выйграл");
                    break;
                }
            } while (count > 0);
        }
    }
}
