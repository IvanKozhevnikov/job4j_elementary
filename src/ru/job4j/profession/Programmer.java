package ru.job4j.profession;

public class Programmer extends Engineer {

    private Program program;

    public Programmer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Program develop(Project project) {
        return program;
    }
}
