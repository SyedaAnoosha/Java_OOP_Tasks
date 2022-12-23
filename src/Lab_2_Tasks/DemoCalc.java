package Lab_2_Tasks;//Take radius of three circles and calculate their circumference,diameter and area.


import java.util.Scanner;

public class DemoCalc {
    public static void main(String[] args) {
        float n1,n2,n3;
        System.out.print("Enter radius of first circle: ");
        Scanner sc1= new Scanner(System.in);
        n1=sc1.nextFloat();
        System.out.print("Enter radius of first circle: ");
        Scanner sc2= new Scanner(System.in);
        n2=sc2.nextFloat();
        System.out.print("Enter radius of first circle: ");
        Scanner sc3= new Scanner(System.in);
        n3=sc3.nextFloat();

        double cf1= 2*3.14*n1;
        double cf2= 2*3.14*n2;
        double cf3= 2*3.14*n3;
        float d1= 2*n1;
        float d2= 2*n2;
        float d3= 2*n3;
        double a1=3.14*n1*n1;
        double a2=3.14*n2*n2;
        double a3=3.14*n3*n3;

        System.out.println("Circumference  of first circle: "+ cf1);
        System.out.println("Circumference  of second circle: "+cf2);
        System.out.println("Circumference  of third circle:: "+cf3);
        System.out.println("Diameter  of first circle: "+d1);
        System.out.println("Diameter  of second circle: "+d2);
        System.out.println("Diameter  of third circle: "+d3);
        System.out.println("Area of first circle: "+a1);
        System.out.println("Area of second circle: "+a2);
        System.out.println("Area of third circle: "+a3);


    }
}
