import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.println("ConsoleExercises");

// 1. Exercises

//        double pi = 3.14159;
//        System.out.print("\n\nThe value of pi is approximately 3.14.\n\n");

// 1. Explore the SCANNER Class

        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter an integer: ");
//        int userInt = input.nextInt();
//        System.out.println(userInt);

// 2.
//        System.out.println("Please enter 3 words");
//
//        String word1 = input.next();
//        String word2 = input.next();
//        String word3 = input.next();
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

// 3.
//        System.out.println("please enter a sentence");
//        String sentence = input.next();
//        System.out.println(sentence);

// 4.
//        System.out.println("please enter a sentence");
//        String sentence = input.nextLine();
//        System.out.println(sentence);


// 1. Calculate the perimeter and area of Codeup's classrooms.

//        System.out.println("Please enter a length");
//        String lengthInput = input.nextLine();
//
//        System.out.println("Please enter a width");
//        String widthInput = input.nextLine();
//
//        int length = Integer.parseInt(lengthInput);
//        int width = Integer.parseInt(widthInput);
//
//        int area = length * width;
//        int perimeter = (2*width) + (2*length);
//
//        System.out.println("perimeter = " + perimeter);
//        System.out.println("area = " + area);
// 2.
        System.out.println("Please enter a length");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("Please enter a width");
        int width = Integer.parseInt(input.nextLine());

        int area = length * width;
        int perimeter = (2*width) + (2*length);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}