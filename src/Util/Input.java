package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(String msg) {
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }

    // Catch cases when we run getString without params
    public String getString() {
        return getString("Write something: ");
    }

    public boolean yesNo(String prompt) {
        String input = getString("Type yes/no: ");
        return input.equals("yes") || input.equals("y");
    }

    public int getInt(int min, int max) {
        String prompt = "";
        int num = getInt(prompt);

        if (num < min || num > max) {
            System.out.println("Error outside of the boundaries");
            return getInt(min, max);
        }

        return num;
    }

    public int getInt(String prompt) {

        int number;

        try {
            number = Integer.parseInt(getString("Give me a number: "));
        } catch (NumberFormatException nfe) {
            System.out.println("Input is not valid, make sure it's a number");
            return getInt(prompt);
        }

        return number;
    }

    public double getDouble(String prompt) {
        double number;

        try {
            number = Double.parseDouble(getString("Give me a decimal: "));
        } catch (NumberFormatException nfe) {
            System.out.println("Input is not valid, make sure it's a decimal");
            return getDouble(prompt);
        }

        return number;
    }

    public double getDouble(double min, double max) {
        String prompt = "";
        double num = getDouble(prompt);

        if (num < min || num > max) {
            System.out.println("Error outside of the boundaries");
            return getDouble(min, max);
        }

        return num;
    }
}
//    private static Scanner scanner;
//
//    public Input(Scanner scanner) {
//        Input.scanner = scanner;
//    }
//
//    public Input() {
//        setScanner();
//    }
//
//    private static void setScanner() {
//        if (scanner == null) {
//            scanner = new Scanner(System.in);
//        }
//    }
////    String getString()
//    public String getString(String prompt) {
//        if (scanner == null) setScanner();
//        String string;
//
//        if (prompt != null) {
//            System.out.print(prompt);
//        } else {
//            prompt = "Enter string ";
//        }
//        string = scanner.nextLine();
//        if (string.length() == 0)
//            string = getString(prompt);
//        return string;
//    }
//
//    public String getString() {
//        return getString(null);
//    }
////    boolean yesNo()
//    public boolean yesNo(String prompt) {
//        if (scanner == null) setScanner();
//        boolean response;
//
//        if (prompt != null) {
//            System.out.print(prompt);
//        }
//        response = scanner.nextLine().toLowerCase().contains("y");
//        return response;
//    }
//
//    public boolean yesNo() {
//        return yesNo(null);
//    }
////    int getInt(int min, int max)
//    public int getInt(String prompt) {
//        if (scanner == null) setScanner();
//        String userInput;
//        int number;
//
//        if (prompt != null) {
//            System.out.print(prompt);
//        }
//        try {
//            userInput = scanner.nextLine();
//            number = Integer.parseInt(userInput);
//        } catch (Exception e) {
//            System.out.println("That is not an integer.");
//            if (prompt == null)
//                prompt = "Enter an integer: ";
//            number = getInt(prompt);
//        }
//        return number;
//    }
////    int getInt()
//    public int getInt() {
//        return getInt(null);
//    }
//
//    public int getInt(int min, int max, String prompt) {
//        if (scanner == null) setScanner();
//        int number = getInt(prompt);
//        if (number < min || number > max) {
//            System.out.printf("Number %d is not in range", number);
//            if (prompt == null)
//                prompt = String.format("Enter an integer between %d and %d ", min, max);
//            number = getInt(min, max, prompt);
//        }
//        return number;
//    }
//
//    public int getInt(int min, int max) {
//        return getInt(min, max, null);
//    }
//
//    public double getDouble(String prompt) {
//        if (scanner == null) setScanner();
//        String userInput;
//        double number;
//        if (prompt != null)
//            System.out.print(prompt);
//        try {
//            userInput = scanner.nextLine();
//            number = Double.parseDouble(userInput);
//        } catch (Exception e) {
//            System.out.println("Not a real number.");
//            if (prompt == null)
//                prompt = "Enter a real number. ";
//            number = getDouble(prompt);
//        }
//        return number;
//    }
////    double getDouble()
//    public double getDouble() {
//        return getDouble(null);
//    }
////    double getDouble(double min, double max)
//    public double getDouble(double min, double max, String prompt) {
//        if (scanner == null) setScanner();
//        double number;
//        number = getDouble(prompt);
//        if (number < min || number > max) {
//            System.out.printf("Number %d is not in range", number);
//            if (prompt == null)
//                prompt = String.format("Enter real number between %f and %f: ", min, max);
//            number = getDouble(min, max, prompt);
//        }
//        return number;
//    }
//
//    public double getDouble(double min, double max) {
//        return getDouble(min, max, null);
//    }
//}