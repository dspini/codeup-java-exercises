import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100);
        fizzBuzz(100);
    }

    private static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("fizz");
            else if ((i % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }
}