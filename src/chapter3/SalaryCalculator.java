package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]) {
        // init known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // get values for the unknown
        System.out.println("How many sales did the employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int employeeSales = scanner.nextInt();
        scanner.close();
        // quick detour for bounus earners
        if (employeeSales > quota) {
            salary += bonus;
        }
        // ouput
        System.out.println("The employee's salary for this week is: $" + salary);
    }
}
