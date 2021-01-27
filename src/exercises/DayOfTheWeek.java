package exercises;

import java.util.Scanner;

public class DayOfTheWeek {
    private static int myArr[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a Number 1-7: ");
        int userInput = scanner.nextInt();
        String dayOfWeek = getDayOfWeek(userInput - 1);
        printDay(dayOfWeek);
    }

    private static void printDay(String dayOfWeek) {
        System.out.println(dayOfWeek);
    }

    public static String getDayOfWeek(int userInput) {
        if (userInput < 0 || userInput > 7) {
            return "Input invalid not a number between 1 and 7";
        }

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return daysOfWeek[userInput];

    }


}
