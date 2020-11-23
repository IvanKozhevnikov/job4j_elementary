package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private Organ organ;

    public Organ operate(Patient patient) {
        return organ;
    }
}
