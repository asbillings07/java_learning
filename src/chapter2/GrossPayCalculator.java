package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
     public static void main(String arg[]) {
         // 1. Get the number of hours worked
         System.out.println("Enter the number of hours the employee worked:");
         Scanner scanner = new Scanner(System.in);
         int hoursWorked = scanner.nextInt();

         // 2. Get the hourly rate
         System.out.println("Enter the employee's pay rate.");
         double payRate = scanner.nextDouble();
         scanner.close();
         // 3. Multiply hours and pay rate
         double grossPay = hoursWorked * payRate;

         // 4. Display the result
         System.out.println("The Employee's gross pay is $" + grossPay);
     }
}
