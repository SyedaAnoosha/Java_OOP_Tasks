package lab_4_tasks;//Write a program to check whether a character is Vowel or consonant

import java.util.Scanner;

public class lab4iii {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'U', 'O' : {
                System.out.println("Vowel");
                break;
            }
            default : {
                System.out.println("Consonant");
            }
        }
    }
}
