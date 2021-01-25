package exercises;

import chapter6.PhoneBill;
import java.util.Scanner;

public class PhoneBillCalculator2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter minutes used: ");
        double overage = scanner.nextDouble();

        System.out.println("Enter base cost of the plan: ");
        double planCost = scanner.nextDouble();

        PhoneBill bill1 = new PhoneBill(2, planCost, 80, overage);
        bill1.printItemizedBill();

        scanner.close();
    }



}
