package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private Tooth tooth;

    public Tooth pullOut(Patient patient) {
        return tooth;
    }
}
