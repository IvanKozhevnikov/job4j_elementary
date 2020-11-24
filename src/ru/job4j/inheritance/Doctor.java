package ru.job4j.inheritance;

public class Doctor extends Profession {

    private Diagnosis diagnosis;

    public Doctor(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnosis heal(Patient patient) {
        return diagnosis;
    }
}
