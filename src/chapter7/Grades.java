package chapter7;

/*
Create a program that allows a user to enter any number of
grades and provides them with their average score as well as the highest and lowest scores
 */

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter: ");
        grades = new int[scanner.nextInt()];
        getGrades(grades);
        printAverageGrades(grades);
        printHighestGrade(grades);
        printLowestGrade(grades);



    }

    public static void printLowestGrade(int[] grades) {
        int lowest = grades[0];

        for (int grade: grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("The lowest grade is: " + lowest);
    }

    public static void printHighestGrade(int[] grades) {
        int highest = grades[0];

        for (int grade: grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        System.out.println("The highest grade is: " + highest);
    }

    private static int calcGrades(int[] grades) {
        int total = 0;

        for (int grade: grades) {
            total += grade;
        }
            return total;
    }

    public static void printAverageGrades(int[] grades) {
        int totalGrades = calcGrades(grades);
        double avgGrades = totalGrades / grades.length;
        System.out.println("Average: " + String.format("%.2f", avgGrades));
    }


    public static int[] getGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1));
            grades[i] = scanner.nextInt();
        }

        return grades;
    }






}
