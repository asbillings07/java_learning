package exercises;

import chapter6.PhoneBill;

import java.util.Scanner;

// chapter 4 exercise

public class PhoneBillCalculator {
    static double overageCharge = 0.25;
    static double planTax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
       double basePlanCost = getBasePlanCost();
       double overageFees = getOverageAmount(overageCharge);
       double phoneBillTax = calculateTax(planTax, basePlanCost, overageFees);
       double total = calculateTotal(basePlanCost, overageFees, phoneBillTax);
       scanner.close();

       printFinalTotal(basePlanCost, overageFees, phoneBillTax, total);
    }

    private static double calculateTotal(double basePlanCost, double overageFees, double phoneBillTax) {
        double total = basePlanCost + overageFees + phoneBillTax;
        return total;
    }

    private static double calculateTax(double planTax, double planCost, double overageFees) {
        double tax = (planCost + overageFees) * planTax;
        return tax;
    }

    private static void printFinalTotal(double basePlanCost, double overage, double tax, double total) {
        System.out.println("Phone Bill Statement: ");
        System.out.println("Plan: $" + String.format("%.2f", basePlanCost));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));

    }

    private static double getOverageAmount(double overageCharge) {
        System.out.println("Enter overage minutes: ");
        int overage = scanner.nextInt();
        return overage * overageCharge;
    }

    private static double getBasePlanCost() {
        System.out.println("Enter base cost of the plan: ");
        double planCost = scanner.nextDouble();
        return planCost;
    }

}
