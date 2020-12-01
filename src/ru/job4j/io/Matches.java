package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        int selectFirst;
        int selectSecond;
        while (count > 0) {
            do {
                System.out.println("Игрок 1: берите спички.");
                selectFirst = Integer.parseInt(input.nextLine());
            } while (selectFirst < 1 || selectFirst > 3);
            count -= selectFirst;
            if (count > 0) {
                System.out.println("Количество спичек на столе " + count);
            } else {
                System.out.println("Игрок 1 выйграл");
                break;
            }
            do {
                System.out.println("Игрок 2: берите спички.");
                selectSecond = Integer.parseInt(input.nextLine());
            } while (selectSecond < 1 || selectSecond > 3);
            count -= selectSecond;
            if (count > 0) {
                System.out.println("Количество спичек на столе " + count);
            } else {
                System.out.println("Игрок 2 выйграл");
            }
        }
    }
}
