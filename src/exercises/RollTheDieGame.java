package exercises;

import java.util.Random;
import java.util.Scanner;

// chapter 3 exercise

public class RollTheDieGame {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int die = 0;
        int spaces = 20;
        int maxRolls = 5;
        int currentSpace = 0;
        int currentRoll = 0;

        System.out.println("Welcome to the Roll The Die Game!");
        System.out.println("The goal of the game to land on space 20 before your rolls are up!");
        System.out.println("Let's get started!");


        for (int i = 0; i < maxRolls; i++) {
            die = random.nextInt(6) + 1;
            currentSpace += die;
            currentRoll += 1;

            if (currentSpace == spaces) {
                System.out.println("You've rolled a " + die + ". You are now on space 20. Congrats, you win!");
                break;
            } else if ( currentSpace > spaces) {
                System.out.println("You've rolled a " + die + ". You passed space 20 on the board. You lose!");
                break;
            } else {
                System.out.println("You've rolled a " + die + ". You are now on space " + currentSpace + " and have " + (spaces - currentSpace) + " more to go.");
            }
        }

        if (currentSpace < spaces && currentRoll == maxRolls) {
            System.out.println("You've rolled a " + die + ". You are now on space " + currentSpace + " and have reach the max number of rolls. You lose!");
        }
    }
}
