package chapter3;

/*
To Qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]) {
        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("Enter your annual salary: ");
        Scanner scanner = new Scanner(System.in);
        double customerSalary = scanner.nextDouble();

        System.out.println("How many years have you been employed at your current job? ");
        double customerYearsEmployed = scanner.nextDouble();

        if (customerSalary >= requiredSalary && customerYearsEmployed >= requiredYears) {
            System.out.println("Congrats! You qualify for the loan!");
        } else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for this loan.");
        }
    }
}
