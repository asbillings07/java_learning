package exercises;

import java.util.Scanner;
import chapter8.PasswordValidator;


public class ValidatePasswordExercise {

    private static Scanner scanner = new Scanner(System.in);

    public static PasswordValidator login() {
        System.out.println("Enter initial username: ");
        String userName = scanner.next();

        System.out.println("Enter initial password: ");
        String password = scanner.next();

        System.out.println("Enter your new password: ");
        String newPassword = scanner.next();

        return new PasswordValidator(userName, password, newPassword);
    }

    public static void main(String[] args) {
        PasswordValidator user1 = login();
        do {
            user1.isPasswordValid();
        } while (!user1.isValid());
    }
}
