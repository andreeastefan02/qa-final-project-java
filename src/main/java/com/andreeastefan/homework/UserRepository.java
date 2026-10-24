package com.andreeastefan.homework;


import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) throws InvalidUserDataException {
        if (user == null) {
            throw new InvalidUserDataException(
                    "User nu poate fi null."
            );
        }

        if (user.getUsername() == null
                || user.getUsername().length() < 3) {
            throw new InvalidUserDataException(
                    "Usernameul trebuie sa aiba cel putin 3 caractere."
            );
        }

        if (user.getAge() < 0) {
            throw new InvalidUserDataException(
                    "Varta nu poate fi negativa."
            );
        }

        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}

