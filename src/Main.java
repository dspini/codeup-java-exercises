public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//1.
    int myFavoriteNumber = 27;
        System.out.println(myFavoriteNumber);
//2.
    String myString = "Donnie Spini";
        System.out.println(myString);
//3.
//    String myString = 12345;
//        System.out.println(myString);
//        FAILED
//4.
//    String myString = 3.14159;
//        System.out.println(myString);
//        FAILED
//5.
//    long myNumber = ;
//        System.out.println(myNumber);
//        FAILED
//6.
//    long myNumber = 3.14;
//        System.out.println(myNumber);
//        FAILED
//7.
    long myNumber = 123L;
        System.out.println(myNumber);
//8.
//    long myNumber = 123;
//        System.out.println(myNumber);
//        FAILED
//9.
//    float myNumber = 3.14;
//        System.out.println(myNumber);

    float pi = 3.14F;
        System.out.println(pi);
//10.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//        RETURNS 5 AND 6

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        FAILED
//11.
//    class myFavoriteNumber = 27;
//        System.out.println(myFavoriteNumber);
//        FAILED
//12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        CANNOT BE CAST TO CLASS

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//        STRING CANNOT BE CONVERTED TO INT
//13.
    myNumber = x += 5;
        System.out.println(myNumber);

    myNumber = 3 * 4;
        System.out.println(myNumber);

    myNumber = 10 / 2;
        System.out.println(myNumber);

    myNumber = 2 - 10;
        System.out.println(myNumber);
//14.
//        long maxLong = Long.MAX_VALUE;
//        int myNumber = (int) maxLong;
//        System.out.println(myNumber);
    }
}



