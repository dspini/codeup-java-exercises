package Util;

public class InputTest {
    private static String prompt;
    private static final util.Input input = new util.Input();

    public static void main(String[] args) {
        testString();
        testYesNo();
        testInt();
        testIntRange();
        testDouble();
        testDoubleRange();
    }

    public static void testString() {
        System.out.println();
        prompt = "Enter String ";
        String s = input.getString(prompt);
        System.out.printf("getString(prompt) %s%n", s);
        System.out.println();
        System.out.print(prompt);
        s = input.getString();
        System.out.printf("getString() %s%n", s);
    }

    public static void testYesNo() {
        System.out.println();
        prompt = "Enter Yes or No ";
        boolean b = input.yesNo();
        System.out.printf("yesNo(prompt) %b%n", b);
        System.out.println();
        System.out.print(prompt);
        b = input.yesNo();
        System.out.printf("yesNo() no prompt %b%n", b);
        System.out.println();
    }

    public static void testInt() {
        System.out.println();
        prompt = "Enter Integer ";
        int anInt = input.getInt();
        System.out.printf("getInt(prompt) %d%n", anInt);
        System.out.println();
        System.out.print(prompt);
        anInt = input.getInt();
        System.out.printf("getInt() %d%n", anInt);
        System.out.println();
    }

    public static void testIntRange() {
        System.out.println();
        int iMin = 5, iMax = 12;
        prompt = String.format("Enter integer between %d and %d ", iMin, iMax);
        int anInt = input.getInt();
        System.out.printf("getInt(iMin, iMax, prompt) %d%n", anInt);
        System.out.println();
        System.out.print(prompt);
        anInt = input.getInt(iMin, iMax);
        System.out.printf("getInt(iMin, iMax) %d%n", anInt);
        System.out.println();
    }

    public static void testDouble() {
        System.out.println();
        prompt = "Enter real number ";
        double aDouble = input.getDouble();
        System.out.printf("getDouble(prompt) %f%n", aDouble);
        System.out.println();
        System.out.print(prompt);
        aDouble = input.getDouble();
        System.out.printf("getDouble() %f%n", aDouble);
        System.out.println();
    }

    public static void testDoubleRange() {
        System.out.println();
        double dMin = 5.3, dMax = 12.7;
        prompt = String.format("Enter real number between %.2f and %.2f ", dMin, dMax);
        double aDouble = input.getDouble();
        System.out.printf("getDouble(dMin, dMax, prompt) %f%n", aDouble);
        System.out.println();
        System.out.print(prompt);
        aDouble = input.getDouble(dMin, dMax);
        System.out.printf("getDouble(dMin, dMax) %f%n", aDouble);
        System.out.println();

    }
}
//    public static void testYesNo() {
//        System.out.println();
//        prompt = "Enter Yes or No ";
//        boolean b = input.yesNo(prompt);
//        System.out.printf("yesNo(prompt) %b%n", b);
//        System.out.println();
//        System.out.print(prompt);
//        b = input.yesNo();
//        System.out.printf("yesNo() no prompt %b%n", b);
//        System.out.println();
//    }
//
//    public static void testInt() {
//        System.out.println();
//        prompt = "Enter Integer ";
//        int anInt = input.getInt(prompt);
//        System.out.printf("getInt(prompt) %d%n", anInt);
//        System.out.println();
//        System.out.print(prompt);
//        anInt = input.getInt();
//        System.out.printf("getInt() %d%n", anInt);
//        System.out.println();
//    }
//
//    public static void testIntRange() {
//        System.out.println();
//        int iMin = 5, iMax = 12;
//        prompt = String.format("Enter integer between %d and %d ", iMin, iMax);
//        int anInt = input.getInt(iMin, iMax, prompt);
//        System.out.printf("getInt(iMin, iMax, prompt) %d%n", anInt);
//        System.out.println();
//        System.out.print(prompt);
//        anInt = input.getInt(iMin, iMax);
//        System.out.printf("getInt(iMin, iMax) %d%n", anInt);
//        System.out.println();
//    }
//
//    public static void testDouble() {
//        System.out.println();
//        prompt = "Enter real number ";
//        double aDouble = input.getDouble(prompt);
//        System.out.printf("getDouble(prompt) %f%n", aDouble);
//        System.out.println();
//        System.out.print(prompt);
//        aDouble = input.getDouble();
//        System.out.printf("getDouble() %f%n", aDouble);
//        System.out.println();
//    }
//
//    public static void testDoubleRange() {
//        System.out.println();
//        double dMin = 5.3, dMax = 12.7;
//        prompt = String.format("Enter real number between %.2f and %.2f ", dMin, dMax);
//        double aDouble = input.getDouble(dMin, dMax, prompt);
//        System.out.printf("getDouble(dMin, dMax, prompt) %f%n", aDouble);
//        System.out.println();
//        System.out.print(prompt);
//        aDouble = input.getDouble(dMin, dMax);
//        System.out.printf("getDouble(dMin, dMax) %f%n", aDouble);
//        System.out.println();
//
//    }
//}