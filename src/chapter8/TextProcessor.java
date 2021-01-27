package chapter8;

import java.util.Scanner;

public class TextProcessor {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        String userWord = scanner.nextLine();
//        printWord(userWord);
//        printReverseWord(userWord);
        addSpaces(userWord);
    }

    private static void addSpaces(String userWord) {
        var modifiedText = new StringBuilder(userWord);

        for (int i = 0; i < modifiedText.length(); i++) {
            var letter = modifiedText.charAt(i);

            if (i != 0 && Character.isUpperCase(letter)) {
                modifiedText.insert(i, " ");
                // so we move past the space we've just entered
                i++;
            }
        }

        System.out.println(modifiedText);

    }

    private static void printReverseWord(String userWord) {
        var words = userWord.split("");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
        }
    }

    private static void printWord(String userWord) {
        var words = userWord.split(" ");

        if (words.length > 1) {
            countWords(userWord);
        } else {
            countLetters(userWord);
        }

    }



    public static void countLetters(String text) {
        System.out.println("Your word contains " + text.length() + " letters");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    /**
     * Splits a String into an array by tokenizing it
     * Counts words and prints them
     * @param text Full string to be split
     */

    public static void countWords(String text) {
        var words = text.split(" ");

        System.out.println("Your text contains " + words.length + " words.");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }


}
