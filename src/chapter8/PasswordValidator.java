package chapter8;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private String username;
    private String password;
    private String newPassword;
    private boolean valid;
    private String errorMessage;
    private Scanner scanner = new Scanner(System.in);


    public PasswordValidator(String username, String password, String newPassword) {
        setPassword(password);
        setUsername(username);
        setNewPassword(newPassword);
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public boolean isValid() {
        return valid;
    }

    private String getErrorMessage() {
        return errorMessage;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private boolean isPasswordEightCharsLong() {
        if (newPassword.length() >= 8) {
            return true;
        }
            return false;
    }

    private boolean containsUpperCaseLetter() {
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isUpperCase(newPassword.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    private boolean containsSpecialChar() {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(newPassword);
        boolean isStringContainsSpecialCharacter = matcher.find();
        if(isStringContainsSpecialCharacter) {
            return true;
        }
            return false;
    }

    private boolean doesNotContainUsername() {
        if (!newPassword.contains(username)) {
            return true;
        }
            return false;
    }

    private boolean notSameAsCurrentPassword() {
        if (!password.equals(newPassword)) {
            return true;
        }
            return false;
    }

    public String currentPassword() {
        return this.password;
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public void isPasswordValid() {
        valid = true;
        errorMessage = "";

        if (!isPasswordEightCharsLong()) {
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters long";
        }

        if (!containsUpperCaseLetter()) {
            valid = false;
            errorMessage += "\n Your password must contain an uppercase letter";
        }

        if (!containsSpecialChar()) {
            valid = false;
            errorMessage += "\n Your password must contain a special character";
        }

        if (!doesNotContainUsername()) {
            valid = false;
            errorMessage += "\n Your password must not contain your username";
        }

        if (!notSameAsCurrentPassword()) {
            valid = false;
            errorMessage += "\n Your password must not be as same as your old password";
        }

        if (!isValid()) {
            System.out.println(getErrorMessage());
            System.out.println("Try again!");
            System.out.println("Enter new password: ");
            setNewPassword(scanner.next());
        } else {
            System.out.println("New Password has been set successfully!");
            scanner.close();
        }
    }


}
