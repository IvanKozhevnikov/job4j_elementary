package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
            System.out.println("Go");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number);
    }

    @Override
    public int fill(int amountOfFuel) {
        int price = 75;
        price = price * amountOfFuel;
        return price;
    }
}