package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {

        testMultiInheritance();

    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
    public static void testInheritance() {
                Employee employee = new Employee();
                employee.getEmployeeId();
        // employee will get all of the getters and setters from Person and from Employee
    }
    public static void testOverload() {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Square");

    }
    public static void testMultiInheritance() {
        Father dad = new Father();
        dad.setName("Aaron");

        System.out.println("The gender of " + dad.getName() + " is " + dad.getGender());
    }
}
