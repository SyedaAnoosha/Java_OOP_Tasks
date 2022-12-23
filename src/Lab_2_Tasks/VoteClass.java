package Lab_2_Tasks;

import java.util.Scanner;

public class VoteClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String word = sc.nextLine();
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Hello " + word);
        if (age >= 18) {
            System.out.println("You are eligible to vote ");
        } else {
            System.out.println("Sorry ,you can't vote. Try after your 18th birthday :)");
        }
    }
}