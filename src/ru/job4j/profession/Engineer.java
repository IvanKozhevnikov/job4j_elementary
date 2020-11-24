package ru.job4j.profession;

public class Engineer extends Profession {

    private Task task;

    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Task solve(Project project) {
        return task;
    }
}
