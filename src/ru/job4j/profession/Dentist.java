package ru.job4j.profession;

public class Dentist extends Doctor {

    private Tooth tooth;

    public Dentist(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Tooth pullOut(Patient patient) {
        return tooth;
    }
}
