package ru.job4j.inheritance;

public class Doctor extends Profession {

    private Diagnosis diagnosis;

    public Diagnosis heal(Patient patient) {
        return diagnosis;
    }
}
