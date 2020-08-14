package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            double radius = input.getDouble("Provide the radius of the circle.");
            Circle circle = new Circle(radius);
            System.out.println("Area of circle is " + circle.getArea());
            System.out.println("Circumference of circle is " + circle.getCircumference());
        } while (input.yesNo("Do you want to make another circle?"));
        System.out.println(Circle.getCirclesCreated() + " circles you created.");
    }
}