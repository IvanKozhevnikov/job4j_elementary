package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        while (true) {
            System.out.println("Игрок 1: берите спички.");
            int selectFirst = Integer.valueOf(input.nextLine());
            if (count > 0) {
                count -= selectFirst;
                if (count > 0) {
                    System.out.println("Количество спичек на столе " + count);
                    System.out.println();
                }
            }
            if (count <= 0) {
                System.out.println("Игрок 1 выйграл");
                break;
            }
            System.out.println("Игрок 2: берите спички.");
            int selectSecond = Integer.valueOf(input.nextLine());
            if (count > 0) {
                count -= selectSecond;
                if (count > 0) {
                    System.out.println("Количество спичек на столе " + count);
                    System.out.println();
                }
            }
            if (count <= 0) {
                System.out.println("Игрок 1 выйграл");
                break;
            }
        }
    }
}
