package shapes;
//Modify your ShapesTest class.
public class ShapesTest {

    public static void main(String[] args) {

        //declare a variable of the type Measurable named myShape.
        Measurable myShape = new Square(2);
        System.out.println("myShape.getPerimeter is " + myShape.getPerimeter() + " inches");
        System.out.println("myShape.getArea is " + myShape.getArea() + " square inches");

        myShape = new Rectangle(2, 4);
        System.out.println("myShape.getPerimeter is " + myShape.getPerimeter() + " inches");
        System.out.println("myShape.getArea is " + myShape.getArea() + " square inches");
    }
}