package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    //init what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        // get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        // check if the user if qualified
        boolean isQualified = isUserQualifed(salary, creditScore);
        //notify the user
        String message = notifyUser(isQualified);

        System.out.println(message);

    }

    public static String notifyUser(boolean isQualified) {
        if (isQualified) {
            return "Congrats! You've been approved!";
        }
            return "Sorry. You've been declined";

    }

    public static Boolean isUserQualifed(double salary, int creditScore) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        }
            return false;
    }

    public static double getSalary() {
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }


}
