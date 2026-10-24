package com.andreeastefan.homework;


public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        // User valid
        try {
            repository.addUser(new User("testuser", 25));
            System.out.println("User adaugat cu succes.");
        } catch (InvalidUserDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // AdminUser valid
        try {
            repository.addUser(
                    new AdminUser("admin", 30, "full_access")
            );
            System.out.println("User adaugat cu succes.");
        } catch (InvalidUserDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Username prea scurt
        try {
            repository.addUser(new User("ab", 22));
            System.out.println("User adaugat cu succes.");
        } catch (InvalidUserDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Age negativ
        try {
            repository.addUser(new User("baduser", -5));
            System.out.println("User adaugat cu succes.");
        } catch (InvalidUserDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUseri valizi:");

        for (User user : repository.getUsers()) {
            System.out.println(
                    user.getUsername() + ", varsta: " + user.getAge()
            );
        }
    }
}

