import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("MethodsExercises");

// 1.     Basic Arithmetic

//     a. Create four separate methods. Each will perform an arithmetic operation:

//        Addition
//        public static double add(double num1, double num2) {
//            return num1 + num2;
//        }
////        Subtraction
//        public static double subtract(double num1, double num2) {
//            return num1 - num2;
//        }
////        Multiplication
//        public static double multiply(double num1, double num2) {
//            return num1 * num2;
//        }
////        Division
//        public static double divide(double num1, double num2) {
//            return num1 / num2;
//        }
//     b. Each function needs to take two parameters/arguments so that the operation can be performed.

//     c. Test your methods and verify the output.

//     d. Add a modulus method that finds the modulus of two numbers.

//        Food for thought: What happens if we try to divide by zero? What should happen?

// **     Bonus

//     a. Create your multiplication method without the * operator (Hint: a loop might be helpful).

//        public static double modulus(double num1, double num2) {
//            return num1 % num2;
//        }
//     b. Do the above with recursion.


// 2.     Create a method that validates that user input is in a certain range
//        The method signature should look like this:

//        public static int getInteger(int min, int max);

//        and is used like this:

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

//        If the input is invalid, prompt the user again.

//        Hint: recursion might be helpful here!

//        public static int getInteger(int min, int max) {
//            Scanner sc = new Scanner(System.in);
//            if (!sc.hasNextInt()) {
//                System.out.println("Not a number!");
//                return getInteger(min, max);
//            }
//            int userInput = sc.nextInt();
//            if (userInput >= min && userInput <= max) {
//                return userInput;
//            } else {
//                System.out.println("Number not in range!");
//                return getInteger(min, max);
//            }
//        }


// 3.     Calculate the factorial of a number.

//        Prompt the user to enter an integer from 1 to 10.

//        Display the factorial of the number entered by the user.

//        Ask if the user wants to continue.

//        Use a for loop to calculate the factorial.

//        Assume that the user will enter an integer, but verify it’s between 1 and 10.

//        Use the long type to store the factorial.

//        Continue only if the user agrees to.

//        A factorial is a number multiplied by each of the numbers before it.

//         Factorials are denoted by the exclamation point (n!). Ex:

//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24

//        public static long calculateFactorial(int num) {
//            int output = 1;
//            for (int i = 1; i <= num; i += 1) {
//                output *= i;
//            }
//            return output;
//        }
//
//        public static void userInteractionFactorial(Scanner sc) {
//            boolean willContinue;
//            String userChoice;
//            do {
//                System.out.println("Please enter an integer from 1 to 12");
//                int userInt = getInteger(1, 12);
//                System.out.println(calculateFactorial(userInt));
//                do {
//                    System.out.println("Do you wish to continue? [y/n]: ");
//                    userChoice = sc.next().trim();
//                } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//                willContinue = userChoice.equalsIgnoreCase("y");
//            } while (willContinue);
//        }

// **     Bonus

//        Test the application and find the integer for the highest factorial that can be accurately calculated
//        by this application, then modify the prompt so that it prompts the user for a number
//        "from 1 to {the highest integer that returns accurate factorial calculation}".
//        Don’t forget to change your verification too!

//        Use recursion to implement the factorial.


// 4.     Create an application that simulates dice rolling.

//        Ask the user to enter the number of sides for a pair of dice.

//        Prompt the user to roll the dice.

//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll
//        the dice again.

//        Use static methods to implement the method(s) that generate the random numbers.

//        Use the .random method of the java.lang.Math class to generate random numbers.

//        public static int randomWithRange(int min, int max)
//        {
//            int range = (max - min) + 1;
//            return (int)(Math.random() * range) + min;
//        }
//
//        public static void rollDiceGame(Scanner sc) {
//            String userChoice;
//            System.out.print("Please enter the number of sides for the dice: ");
//            int nSides = getInteger(1, 20);
//            do {
//                System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
//                do {
//                    System.out.println("Would you like to roll again? [y/n]");
//                    userChoice = sc.next().trim();
//                } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//            } while (!userChoice.equals("n"));
//        }


// 5.     Game Development 101

//        Welcome to the world of game development!

//        You are going to build a high-low guessing game. Create a class named HighLow inside of src.

//        The specs for the game are:

//        Game picks a random number between 1 and 100.

//        Prompts user to guess the number.

//        All user inputs are validated.

//        If user's guess is less than the number, it outputs "HIGHER".

//        If user's guess is more than the number, it outputs "LOWER".

//        If a user guesses the number, the game should declare "GOOD GUESS!"

//        Hints

//        Use the random method of the java.lang.Math class to generate a random number.

//        import java.util.Scanner;
//
//        public class HighLow {
//
//            public static int numberOfGuesses;
//            public static int gameNumber;
//
//            public static void main(String[] args) {
//                initGame();
//            }
//
//            public static void initGame() {
//                boolean programRunning;
//                boolean gameRunning = true;
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Welcome to the High / Low Guessing Game!");
//                do {
//                    gameNumber = randomWithRange(1, 100);
//                    System.out.println("The random number is: " + gameNumber);
//                    do {
//                        gameRunning = runRound(sc);
//                    } while (gameRunning);
//                    programRunning = getYesOrNo(sc).equals("y");
//                } while (programRunning);
//                System.out.println("Good bye!");
//            }
//
//            public static boolean runRound(Scanner sc) {
//                boolean gameNotWon = false;
//                System.out.print("Please enter a guess: ");
//                int playerGuess = getInteger(1, 100, sc);
//                if (playerGuess == gameNumber) {
//                    System.out.println("GOOD GUESS!");
//                    gameNotWon = false;
//                } else if (playerGuess > gameNumber) {
//                    System.out.println("LOWER");
//                    numberOfGuesses++;
//                    gameNotWon = true;
//                    System.out.println("Number of guesses made: " + numberOfGuesses);
//                } else {
//                    System.out.println("HIGHER");
//                    gameNotWon = true;
//                    numberOfGuesses++;
//                    System.out.println("Number of guesses made: " + numberOfGuesses);
//                }
//                return gameNotWon;
//            }
//
//            public static int randomWithRange(int min, int max)
//            {
//                int range = (max - min) + 1;
//                return (int)(Math.random() * range) + min;
//            }
//
//
//            public static int getInteger(int min, int max, Scanner sc) {
//                if (!sc.hasNextInt()) {
//                    System.out.println("Not a number!");
//                    return getInteger(min, max, sc);
//                }
//                int userInput = sc.nextInt();
//                if (userInput >= min && userInput <= max) {
//                    return userInput;
//                } else {
//                    System.out.println("Number not in range!");
//                    return getInteger(min, max, sc);
//                }
//            }
//
//            public static String getYesOrNo(Scanner sc) {
//                String userChoice;
//                do {
//                    System.out.println("Do you wish to play again? [y/n]: ");
//                    userChoice = sc.next().trim();
//                } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
//                return userChoice;
//            }

// **     Bonus

//        Keep track of how many guesses a user makes.

//        Set an upper limit on the number of guesses.

    }
}