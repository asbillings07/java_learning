package chapter6;

public class Rectangle {

/*
private - only methods within this class can access the variable
protected - only classes within the same package can access the variable. (similar to having no access modifier at all)
public (access modifier) - need to have it on your methods to call them outside the package.
*/

   private double length;
   private double width;

   // two constructors that allow the user to either set private vars to 0 or set them to something different;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calcPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calcArea() {
        return length * width;
    }
}
