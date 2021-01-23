package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String userText = scanner.next();
        scanner.close();
        String message = "Your text included did not include an A or a!";

        for(int i=0; i < userText.length(); i++) {
            char currentLetter = userText.charAt(i);
            if (currentLetter == 'A' || currentLetter ==  'a') {
                message = "Your text included an A or a!";
                break;
            }
        }

        System.out.println(message);


    }
}
