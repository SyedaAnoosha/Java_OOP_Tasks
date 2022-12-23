package lab_4_tasks;//Write a program that takes an input number from user and state that it is prime or not

import java.util.Scanner;

public class lab4iv {
    public static void main(String[] args){
        boolean bool = false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int a=sc.nextInt();
        for(int i=2;i<=a/2;i++){
            if (a%i==0) {
                bool= true;
                break;
            }
        }
        if(bool){
            System.out.println("Not a Prime number");
        }
        else{
            System.out.println("Prime number");
        }

    }
}
