import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        Test your methods and verify the output:

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

// 1. Basic Arithmetic
// Create four separate methods. Each will perform an arithmetic operation.
// Each function needs to take two parameters/arguments so that the operation can be performed.

//    Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

//    Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

//    Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

//    Division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

//    Modulus
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

// 2.Create a method that validates that user input is in a certain range.

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
        System.out.println("NaN!");
        return getInteger(min, max);
        }
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
        return userInput;
        } else {
        System.out.println("Num not between 1 and 10!");
        return getInteger(min, max);
        }
    }

// 3. Calculate the factorial of a number.
//    A factorial is a number multiplied by each of the numbers before it.

    public static long calculateFactorial(int num) { //Use the long type to store the factorial.
        int output = 1;
        for (int i = 1; i <= num; i += 1) { //Use a for loop to calculate the factorial.
        output *= i;
        }
        return output;
    }
    public static void userInteractionFactorial(Scanner sc) {
        boolean willContinue;
        String userChoice;
        do {
        System.out.println("Please enter an number from 1 to 10"); //Prompt the user to enter an integer from 1 to 10.
        int userInt = getInteger(1, 10); //Assume that the user will enter an integer, but verify it’s between 1 and 10.
        System.out.println(calculateFactorial(userInt)); //Display the factorial of the number entered by the user.
        do {
        System.out.println("Do you wish to continue? [y/n]: "); //Ask if the user wants to continue.
        userChoice = sc.next().trim();
        } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        willContinue = userChoice.equalsIgnoreCase("y"); //Continue only if the user agrees to.
        } while (willContinue);
    }

// 4. Create an application that simulates dice rolling.

    public static int randomWithRange(int min, int max) //Use static methods to implement the method(s) that generate the random numbers.
    {
        int range = (max - min) + 1; //Use the .random method of the java.lang.Math class to generate random numbers.
        return (int)(Math.random() * range) + min;
    }
    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Enter the number of sides for the dice: "); //Ask the user to enter the number of sides for a pair of dice.
        int numSides = getInteger(1, 20); //Prompt the user to roll the dice.
        do {
        System.out.println("You have rolled a " + randomWithRange(1, numSides) + " and a " + randomWithRange(1, numSides));
        do {
        System.out.println("Would you like to roll again? [y/n]"); //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        userChoice = sc.next().trim();
        } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }
// 5. Dice Game

        public static void highLow(Scanner scan){
            int range = 100 - 1 + 1;
            int numberToGuess = ((int)(Math.random() * range) + 1);

            while(true){
                System.out.println("Guess a number between 1 and 100: ");
                int userInput = Integer.parseInt(scan.nextLine());
                if ( userInput > numberToGuess) {
                    System.out.println("Lower");
                } else if ( userInput < numberToGuess){
                    System.out.println("Higher");
                } else {
                    System.out.println("Good guess");
                    break;
                }
            }
        }
    }