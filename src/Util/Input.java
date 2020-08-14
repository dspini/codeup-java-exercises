package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input(Scanner scanner) {
        Input.scanner = scanner;
    }

    public Input() {
        setScanner();
    }

    private static void setScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }
//    String getString()
    public String getString(String prompt) {
        if (scanner == null) setScanner();
        String string;

        if (prompt != null) {
            System.out.print(prompt);
        } else {
            prompt = "Enter string ";
        }
        string = scanner.nextLine();
        if (string.length() == 0)
            string = getString(prompt);
        return string;
    }

    public String getString() {
        return getString(null);
    }
//    boolean yesNo()
    public boolean yesNo(String prompt) {
        if (scanner == null) setScanner();
        boolean response;

        if (prompt != null) {
            System.out.print(prompt);
        }
        response = scanner.nextLine().toLowerCase().contains("y");
        return response;
    }

    public boolean yesNo() {
        return yesNo(null);
    }
//    int getInt(int min, int max)
    public int getInt(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        int number;

        if (prompt != null) {
            System.out.print(prompt);
        }
        try {
            userInput = scanner.nextLine();
            number = Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("That is not an integer.");
            if (prompt == null)
                prompt = "Enter an integer: ";
            number = getInt(prompt);
        }
        return number;
    }
//    int getInt()
    public int getInt() {
        return getInt(null);
    }

    public int getInt(int min, int max, String prompt) {
        if (scanner == null) setScanner();
        int number = getInt(prompt);
        if (number < min || number > max) {
            System.out.printf("Number %d is not in range", number);
            if (prompt == null)
                prompt = String.format("Enter an integer between %d and %d ", min, max);
            number = getInt(min, max, prompt);
        }
        return number;
    }

    public int getInt(int min, int max) {
        return getInt(min, max, null);
    }

    public double getDouble(String prompt) {
        if (scanner == null) setScanner();
        String userInput;
        double number;
        if (prompt != null)
            System.out.print(prompt);
        try {
            userInput = scanner.nextLine();
            number = Double.parseDouble(userInput);
        } catch (Exception e) {
            System.out.println("Not a real number.");
            if (prompt == null)
                prompt = "Enter a real number. ";
            number = getDouble(prompt);
        }
        return number;
    }
//    double getDouble()
    public double getDouble() {
        return getDouble(null);
    }
//    double getDouble(double min, double max)
    public double getDouble(double min, double max, String prompt) {
        if (scanner == null) setScanner();
        double number;
        number = getDouble(prompt);
        if (number < min || number > max) {
            System.out.printf("Number %d is not in range", number);
            if (prompt == null)
                prompt = String.format("Enter real number between %f and %f: ", min, max);
            number = getDouble(min, max, prompt);
        }
        return number;
    }

    public double getDouble(double min, double max) {
        return getDouble(min, max, null);
    }
}