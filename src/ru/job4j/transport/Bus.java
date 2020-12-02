package ru.job4j.transport;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() + " двигается скоростью 100 км/ч");
    }
}
