package exercises;

import java.util.Scanner;

// chapter 2 exercise

public class ChangeForADollarGame {
    public static void main(String args[]) {

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;
        String message;

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter number of pennies: ");
        Scanner scanner = new Scanner(System.in);
        int pennyInput = scanner.nextInt();

        System.out.println("Enter number of nickels: ");
        int nickelInput = scanner.nextInt();

        System.out.println("Enter number of dimes: ");
        int dimeInput = scanner.nextInt();

        System.out.println("Enter number of quarters: ");
        int quarterInput = scanner.nextInt();
        scanner.close();

        double userPennies = pennyInput * penny;
        double userNickels = nickelInput * nickel;
        double userDimes = dimeInput * dime;
        double userQuarters = quarterInput * quarter;

        double userGuess = userPennies + userNickels + userDimes + userQuarters;

        if (userGuess > dollar) {
            double amountOver = userGuess - dollar;
            message = "Sorry! You lost you were over a guess of dollar by: $" + String.format("%.2f", amountOver);
        } else if (userGuess < dollar) {
            double amountUnder = dollar - userGuess;
            message = "Sorry! You lost you were under the guess of dollar by: $" + String.format("%.2f", amountUnder);
        } else {
            message = "You won! Your amount totaled $1.00!";
        }

        System.out.println(message);
    }
}
