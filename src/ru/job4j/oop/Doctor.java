package ru.job4j.oop;

public class Doctor extends Profession {

    private String medicalDirection;
    private String medicalSpeciality;

    public Doctor diagnosis(Doctor patient) {
        return patient;
    }

    public Doctor listOfMedications(Doctor patient) {
        return patient;
    }
}
