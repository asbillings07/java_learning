package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]) {
        int rate = 15;
        int maxHours = 40;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours did you work this week?");
        double hoursWorked = scanner.nextDouble();

        // validate input

        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid Entry. Your hours must be between 1 and 40. Try again.");
            System.out.println("Let's try this again. How many hours did you work this week?");
            // sentinel - variable that gets updated in the loop
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        System.out.println("Your gross pay is $" + hoursWorked * rate);

    }
}

