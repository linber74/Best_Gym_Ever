package Assigment_2;

import java.util.Scanner;

public class UserInputHandler {
    private final Scanner scanner;

    public UserInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readRequiredLine(String prompt) {
        while (true) {
            System.out.println(prompt);
            String line = scanner.nextLine().trim();

            if (!line.isEmpty()) {
                return line;
            }
            System.out.println("Ogiltig inmatning. Försök igen");
        }
    }

    public String readNameOrPersonNr(String prompt) {
        while (true) {
            String input = readRequiredLine(prompt);

            if (readValidPersonNumber(input)) {
                return input;
            }
            if (readValidName(input)) {
                return input;
            }
            System.out.println("Ange förnamn och efternamn eller personnummer (YYMMDD-XXXX): ");
        }
    }

    public boolean readValidPersonNumber(String input) {
        String personNr = input.trim();

        if (personNr.length() == 11 && personNr.charAt(6) =='-'){
            for (int i = 0; i < personNr.length(); i++) {
                if (i == 6) {
                    continue;
                }
                if (!Character.isDigit(personNr.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        if (personNr.length() == 10) {
            for (int i = 0; i < personNr.length(); i++) {
                if (!Character.isDigit(personNr.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean readValidName(String input) {
        boolean validName = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                validName = true;
            }
            if (Character.isDigit(ch)) {
                return false;
            }
        }
        return validName && input.length() >= 2;
    }
}
