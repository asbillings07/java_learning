package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 24;
        int numberOfTests = 4;

        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the test score for test #: " + (j+1));
                double testScore = scanner.nextDouble();

                total = total + testScore;
            }

            double testAvg = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is: " + testAvg);
        }

    }
}
