package lab_8_tasks;/*
Create a new InvalidPasswordFormatException class which throws an exception on following scenarios:
1. If a password is less than 8 characters
2. If a password contains asterisk (*)
3. If a password is less than 8 characters and contains asterisk (*)
 */

import java.util.Scanner;

class InvalidPasswordFormatException extends Exception{
    public void length(){
        System.out.println("Password must be at least 8 characters long");
    }
    public void asterisk(){
        System.out.println("Password must not contain asterisk (*)");
    }

}
public class DemoPassword {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        password = sc.next();
        int size = password.length();
        boolean z = password.contains("*");

        if (size < 8 && z == true) {
            try {
                throw new InvalidPasswordFormatException();
            } catch (InvalidPasswordFormatException e) {
                e.length();
                e.asterisk();
            }
        } else if (size < 8) {
            try {
                throw new InvalidPasswordFormatException();
            } catch (InvalidPasswordFormatException e) {
                e.length();
            }
        } else if (z == true) {
            try {
                throw new InvalidPasswordFormatException();
            } catch (InvalidPasswordFormatException e) {
                e.asterisk();
            }
        } else {
            System.out.println("Correct password");
        }
    }
}