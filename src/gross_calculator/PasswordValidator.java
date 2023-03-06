package gross_calculator;

import java.util.Scanner;

public class PasswordValidator {
    String givenUsername = "johndoe";
    String givenPassword = "ABC_1234";

    public String validatePassword(String password) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter new password!");
        String newPassword = scanner.next();
        scanner.close();
        if(newPassword.length() < 8) {
            System.out.println("Password needs to be atleast 8 characters");
            newPassword = scanner.next();
        };
        return "Dummy testing program";
    }
}
