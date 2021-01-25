package chapter6;

import java.util.Scanner;

/*
static - is used when you don't want to create a new instance of that class
but you want to access the things inside of it. This is helpful if we don't
intend to set state inside the objects.

If you don't want to use static we would need to create an instance and then call the methods

*/

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // instantiation of this object allows us to use the getroom method and get the state that the user is passing in;
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calcTotalArea(kitchen, bathroom);
        calculator.scanner.close();
        System.out.println("The total area is: " + area);
    }

    public double calcTotalArea(Rectangle kitchen, Rectangle bathroom) {
        return kitchen.calcArea() + bathroom.calcArea();
    }

    public Rectangle getRoom() {

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }


}
