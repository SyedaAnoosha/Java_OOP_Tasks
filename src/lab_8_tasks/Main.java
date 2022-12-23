package lab_8_tasks;/*
Write a program in which handle an exception if any number is divided by zero.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j=0;
        Scanner sc= new Scanner(System.in);
        int z=sc.nextInt();
        try{
            System.out.println(z/j);
        } catch (Exception e) {
            System.out.println("Number cannot be divided by zero");
        } finally {
            System.out.println("Program executed");
        }
    }
}