package lab_8_tasks;/*
Write a java program in which take an input from user. If its age is less than 18 then it must throw an
exception which says you are eligible or else you are eligible.
 */

import java.lang.Exception;
import java.util.Scanner;

class UserDefinedException extends Exception{
    void eligible(){
        System.out.println("You are eligible");
    }
    void ineligible(){
        System.out.println("You are ineligible");
    }
}
public class DemoEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            try {
                throw new UserDefinedException();
            } catch (UserDefinedException e) {
                e.eligible();
            } finally {
                System.out.println("Program executed");
            }
        } else {
            try {
                throw new UserDefinedException();
            } catch (UserDefinedException e) {
                e.ineligible();
            } finally {
                System.out.println("Program executed");
            }
        }
    }
}