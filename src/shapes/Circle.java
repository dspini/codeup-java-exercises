package shapes;

public class Circle {
    private static int circlesCreated = 0;

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        circlesCreated++;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * this.radius * Math.PI;
    }

    public static int getCirclesCreated() {
        return circlesCreated;
    }
}