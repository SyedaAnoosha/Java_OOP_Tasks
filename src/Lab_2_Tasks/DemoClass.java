package Lab_2_Tasks;// Write a program that declares and initializes a double variable then retrieve fraction and integral part separately:
// like 50.25
// integral : 50
// decimal: 0.25

import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args) {
        System.out.println("Enter a floating number: ");
        Scanner scan= new Scanner(System.in);
        float n1= scan.nextFloat();
        int n2= (int) n1;
        System.out.println("integral: "+n2);
        float n3;
        n3=  (n1-n2);
        System.out.print("decimal: "+n3);
    }
}
