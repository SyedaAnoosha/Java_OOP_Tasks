package lab_6_tasks;/*
02.	Write a java program to demonstrate the concept of java runtime arguments.
Input your name and roll number and print it on the console.
 */

public class Task2{
    public static void main(String[] args) {

        String name = args[0];
        String rollNumber = args[1];
        System.out.println("My name is : "+name);
        System.out.println("Roll number is : "+rollNumber);
    }
}
