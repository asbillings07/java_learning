package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items you would like to scan: ");
        int quantity = scanner.nextInt();


        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item number: " + (i + 1));
            double price = scanner.nextDouble();

            total = total + price;
        }

        System.out.println("The total price of all of the items is: $" + total);
        scanner.close();

    }
}
