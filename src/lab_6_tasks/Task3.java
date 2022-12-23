package lab_6_tasks;/*
Develop a java program that takes 5 floating numbers as runtime arguments and print their total sum and average.
 */

public class Task3 {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);
        float num3 = Float.parseFloat(args[2]);
        float num4 = Float.parseFloat(args[3]);
        float num5 = Float.parseFloat(args[4]);
        float sum = num1 + num2 + num3 + num4 + num5;
        float ave = num1 + num2 + num3 + num4 + num5 / 5;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + ave);
    }
}
