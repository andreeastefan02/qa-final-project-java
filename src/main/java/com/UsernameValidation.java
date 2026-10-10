package com;
import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        do {
            System.out.println("Introdu un username: ");
            userName = scanner.nextLine();
        } while (checkText(userName));
        System.out.println("Username acceptat: " + userName);
    }


    public static boolean checkText(String userName) {
        boolean hasDigit = false;
        for (int i = 0; i < userName.length(); i++) {
            char text = userName.charAt(i);
            if (Character.isDigit(text)) {
                hasDigit = true;
            }
        }


        if (!(userName.length() >= 6 && userName.length() <= 12)) {
            System.out.println("Username-ul trebuie sa aibe intre 6 si 12 caractere.");
        } else if (userName.contains(" ")) {
            System.out.println("Username-ul nu poate contine spatii.");
        } else if (!hasDigit) {
            System.out.println("Username-ul trebuie sa contina cel putin o cifra.");
        } else {
            return false;
        }
        return true;
    }
}





