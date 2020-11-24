package ru.job4j.inheritance;

public class Builder extends Engineer {

    private Building building;

    public Builder(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Building construction(Project project) {
        return building;
    }
}
