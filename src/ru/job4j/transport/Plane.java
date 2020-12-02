package ru.job4j.transport;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит по воздуху");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() + " летит скоростью 900 км/ч");
    }
}
