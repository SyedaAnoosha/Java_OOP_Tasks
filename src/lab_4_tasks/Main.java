package lab_4_tasks;//Write a java program that takes five subject numbers from user and then calculate percentage and print the grade

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of first subject: ");
        float a= sc.nextFloat();
        System.out.println("Enter marks of second subject: ");
        float b= sc.nextFloat();
        System.out.println("Enter marks of third subject: ");
        float c= sc.nextFloat();
        System.out.println("Enter marks of forth subject: ");
        float d= sc.nextFloat();
        System.out.println("Enter marks of fifth subject: ");
        float e= sc.nextFloat();

        float sum=a+b+c+d+e;
        double perc =(sum/500)*100;

        System.out.println("Percentage is: "+perc);

        if(perc>90){
            System.out.println("A+ grade");
        }
        else if(perc<=90 && perc>=83){
            System.out.println("A grade");
        }
        else if(perc<=82 && perc>=75){
            System.out.println("B+ grade");
        }
        else if(perc<75 && perc>=65){
            System.out.println("B grade");
        }
        else if(perc<65 && perc>=60){
            System.out.println("C+ grade");
        }
        else if(perc<60 && perc>=50){
            System.out.println("C grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}