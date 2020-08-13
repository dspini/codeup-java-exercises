import java.util.Scanner;

public class HighLow {
    public static int numberOfGuesses;
    public static int gameNumber;
    public static void main(String[] args) {
        initGame();
    }
    public static void initGame() {
        boolean programRunning;
        boolean gameRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the HighLow Game!");
        do {
        gameNumber = randomWithRange(1, 100);
        System.out.println("The random number is: " + gameNumber);
        do {
        gameRunning = runRound(sc);
    } while (gameRunning);
        programRunning = getYesOrNo(sc).equals("y");
    } while (programRunning);
        System.out.println("Good bye!");
    }
    public static boolean runRound(Scanner sc) {
        boolean gameNotWon = false;
        System.out.print("Please enter a guess: ");
        int playerGuess = getInteger(1, 100, sc);
        if (playerGuess == gameNumber) {
        System.out.println("Good Guess!");
        gameNotWon = false;
    } else if (playerGuess > gameNumber) {
        System.out.println("Lower");
        numberOfGuesses++;
        gameNotWon = true;
        System.out.println("Guesses made: " + numberOfGuesses);
    } else {
        System.out.println("Higher");
        gameNotWon = true;
        numberOfGuesses++;
        System.out.println("Guesses made: " + numberOfGuesses);
    }
        return gameNotWon;
    }
    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    public static int getInteger(int min, int max, Scanner sc) {
        if (!sc.hasNextInt()) {
        System.out.println("NaN!");
        return getInteger(min, max, sc);
    }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
        return userInput;
    } else {
        System.out.println("Num not in range!");
        return getInteger(min, max, sc);
        }
    }
    public static String getYesOrNo(Scanner sc) {
        String userChoice;
        do {
        System.out.println("Play again? [y/n]: ");
        userChoice = sc.next().trim();
    } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
        return userChoice;
    }
}