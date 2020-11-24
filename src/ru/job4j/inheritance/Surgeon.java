package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private Organ organ;

    public Surgeon(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Organ operate(Patient patient) {
        return organ;
    }
}
