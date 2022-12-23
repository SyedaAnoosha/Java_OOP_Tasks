package lab_3_tasks;//Generate series of table of any number byy entering number

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter starting value= ");
        int a= sc.nextInt();
        System.out.print("enter ending value= ");
        int b=sc.nextInt();
        System.out.print("enter table no= ");
        int c=sc.nextInt();

        for(int i=a;i<=b;i++){
            System.out.println(c +"*" + i+ "=" + c*i );
        }

    }
}