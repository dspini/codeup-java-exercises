package shapes;
//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(double length) {
    }

    @Override
    public void setWidth(double width) {
    }
}