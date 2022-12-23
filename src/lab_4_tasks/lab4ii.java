package lab_4_tasks;//Write a java program that takes three runtime arguments 1st num, 2nd num, operator(+ - * / %) and calculate result

import java.util.Scanner;

public class lab4ii {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter operator(+ , - , * , / , %)");
        char ch=sc.next().charAt(0);
        System.out.print("Result: ");
        switch(ch) {
            case '+': {
                System.out.println(a + b);
                break;
            }
            case '-': {
                System.out.println(a - b);
                break;
            }
            case '*': {
                System.out.println(a * b);
                break;
            }
            case '/': {
                System.out.println(a / b);
                break;
            }
            case '%': {
                System.out.println(a % b);
                break;
            }
            default:{
                System.out.println("Invalid input");
            }
        }
    }
}
