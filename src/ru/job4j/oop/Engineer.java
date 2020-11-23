package ru.job4j.oop;

public class Engineer extends Profession  {

    private String engineeringDirection;
    private String engineeringSpeciality;

    public Engineer development(Engineer project) {
        return project;
    }

    public Engineer technicalSpecification(Engineer project) {
        return project;
    }
}
