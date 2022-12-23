package Lab_2_Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write a program that takes an integer e.g 5843 and print no of currency notes and coins and output should be like
        // 5000   1
        //1000  0

        System.out.print("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int result = n%5000;
        System.out.println("5000  :"+n/5000);
        int result1 = result%1000;
        System.out.println("1000 :"+ result/1000);
        int result2 = result1%500;
        System.out.println("500 :"+ result1/500);
        int result3 = result2%100;
        System.out.println("100 :"+ result2/100);
        int result4 = result3%50;
        System.out.println("50 :"+ result3/50);
        int result5 = result4%20;
        System.out.println("20 :"+ result4/20);
        int result6 = result5%10;
        System.out.println("10:"+ result5/10);
        int result7 = result6%5;
        System.out.println("5 :"+ result6/5);
        int result8 = result7%2;
        System.out.println("2 :"+ result7/2);
        int result9 = result8%1;
        System.out.println("1 :"+ result8/1);
    }
}

