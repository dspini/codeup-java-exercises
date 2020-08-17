package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle noSquare = new Rectangle(5, 4);
            System.out.println("The Perimeter of the Rectangle is: " + noSquare.getPerimeter() + " inches");
            System.out.println("The Area of the Rectangle is: " + noSquare.getArea() + " square inches");

        Rectangle plusSquare = new Square(5);
            System.out.println("The Perimeter of the Rectangle plus the Square is: " +  plusSquare.getPerimeter()+ " inches" );
            System.out.println("The Area of the Rectangle plus the Square is: " + plusSquare.getArea() + " square inches");
    }
}