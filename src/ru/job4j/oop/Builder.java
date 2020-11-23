package ru.job4j.oop;

public class Builder extends Engineer {

    private String typeOfBuilding;

    public Builder construction(Builder building) {
        return building;
    }
}
