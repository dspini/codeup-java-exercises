package shapes;
//Change your existing Square class to extend Quadrilateral.
public class Square extends Quadrilateral {
    //methods for setting the length and the width should set both protected properties.
    protected Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return Math.pow(super.width, 2);
    }

    @Override
    public void setLength(double length) {
    }

    @Override
    public void setWidth(double width) {
    }
}