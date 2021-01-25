package exercises;

import java.util.Scanner;

// Chapter 1 exercise

public class MadLibExercise {

    public static void main (String args[]) {
        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter a whole number: ");
        int wholeNum = scanner.nextInt();

        System.out.println("Enter an adjective: ");
        String adj = scanner.next();
        scanner.close();

        String madLib = "On a " + adj + " " + season + " day, I drink a minimum of " + wholeNum + " cup of coffee.";

        System.out.println(madLib);
    }
}
