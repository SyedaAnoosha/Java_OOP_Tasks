package practice_tasks;

import java.util.Scanner;
class University {
    Student[] students= new Student[10];
    static class Student {
        String[] name = new String[10];
        String uniName;
        Scanner sc = new Scanner(System.in);
        void enterInfo() {
            System.out.println("Enter Students name: ");
            for (int i = 0; i < 10; i++) {
                name[i] = sc.nextLine();
            }
            sc.nextLine();
            System.out.println("Enter Uni name: ");
            uniName= sc.nextLine();
        }
        void display(){
            for (int i=0;i<10;i++){
                System.out.println(name[i]+"  "+uniName);
            }
        }
    }  //student class ends
    /*public void outerDisplay() {
        for (int i=0;i<10;i++){
            students[i].enterInfo();
            students[i].display();
        }
    }*/
}
public class Hw1 {
    public static void main(String[] args){
        University.Student student= new University.Student();
        student.enterInfo();
        student.display();

    }
}


/* when class is static you don't need to create its object
static class Student{
    static void display(){
        University U1= new University();
        String temp= U1.uniName;
        System.out.println("Displaying uni name from inner class: ");
        System.out.println("Uni name: "+temp);
    }
}
    public void outerDisplay(){
        System.out.println("Outer Display: ");
        Student.display(); // just use dot operator with Student class


    }


    Student[] students= new Student[10];
         String[] name = new String[10];
         String[] uniName = new String[10];
         void enterInfo() {
            System.out.println("Enter Students name: ");
            for (int i = 0; i < 10; i++) {
                Scanner sc = new Scanner(System.in);
                name[i] = sc.nextLine();
            }
            System.out.println("Enter Uni name: ");
            for (int i = 0; i < 10; i++) {
                Scanner sc = new Scanner(System.in);
                uniName[i] = sc.nextLine();
            }
        }
         void display(){
             String[] temp= new String[10];
            for (int i=0;i<10;i++){
                temp[i]=name[i]+uniName[i];
                System.out.println(temp[i]);
            }
        }*/

