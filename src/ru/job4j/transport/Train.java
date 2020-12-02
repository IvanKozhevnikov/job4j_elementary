package ru.job4j.transport;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() + " передвигается со скоростью 150 км/ч");
    }
}
