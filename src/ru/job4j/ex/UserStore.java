package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getUsername());
            if (users[i].getUsername().equals(login)) {
                rsl = users[i];
                return rsl;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("there is no such element in the array");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("invalid input");
        }

        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}