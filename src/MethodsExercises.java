import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        // Test 1
            System.out.println(add(7, 5));
            System.out.println(subtract(3, 3));
            System.out.println(multiply(4, 4));
            System.out.println(divide(3, 9));
            System.out.println(modulus(50, 5));

        // Test 2
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = getInteger(1, 10);
            System.out.println("Your entered integer is: " + userInput);

        // Test 3
            Scanner sc = new Scanner(System.in);
            userInteractionFactorial(sc);

        // Test 4
            rollDiceGame(sc);
    }

// 1.

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

// 2.

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
        System.out.println("NaN!");
        return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
        return userInput;
        } else {
        System.out.println("Num not between 1 and 10!");
        return getInteger(min, max);
        }
    }

// 3.

    public static long calculateFactorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i += 1) {
        output *= i;
        }
        return output;
    }
    public static void userInteractionFactorial(Scanner sc) {
        boolean willContinue;
        String userChoice;
        do {
        System.out.println("Please enter an number from 1 to 10");
        int userInt = getInteger(1, 10);
        System.out.println(calculateFactorial(userInt));
        do {
        System.out.println("Do you wish to continue? [y/n]: ");
        userChoice = sc.next().trim();
        } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        willContinue = userChoice.equalsIgnoreCase("y");
        } while (willContinue);
    }

// 4.

    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Enter the number of sides for the dice: ");
        int numSides = getInteger(1, 20);
        do {
        System.out.println("You have rolled a " + randomWithRange(1, numSides) + " and a " + randomWithRange(1, numSides));
        do {
        System.out.println("Would you like to roll again? [y/n]");
        userChoice = sc.next().trim();
        } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }
}