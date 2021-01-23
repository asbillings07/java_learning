package chapter3;

/*
* All Salespeople are expected to make at least 10 sales each week.
* For those who do, they receive a congrats message.
* For those who don't, they are informed of how many sales they were short
* */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]) {
        int quota = 10;

        System.out.println("How many sales did you make this week? ");
        Scanner scanner = new Scanner(System.in);
        int employeeSales = scanner.nextInt();
        scanner.close();

        if (employeeSales >= quota) {
            System.out.println("Congrats you've met your quota!");
        } else {
            int salesShort = quota - employeeSales;
            System.out.println("You did not make your quota. You were " + salesShort + " short of the quota." );
        }

    }


}
