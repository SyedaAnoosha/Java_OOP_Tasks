package lab_10_tasks;/*
Write a program that opens a file in write mode(use file modes), takes name and roll no from the
students write it in the file and closes the file.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            File myFile=new File("C:\\Users\\Desktop\\myFile.txt");
            if(myFile.createNewFile()){
                System.out.println("File has been created : "+myFile.getName());
            }
            else{
                System.out.println("File already created");
            }
        } catch (IOException e) {
            System.out.println("An error occur.");
            e.printStackTrace();
        }
        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        System.out.println("Enter your roll number: ");
        String roll_number= sc.nextLine();
        try{
            FileWriter fileWriter=new FileWriter("C:\\Users\\Desktop\\myFile.txt");
            fileWriter.write(name+ "\n");
            fileWriter.write(roll_number);
            fileWriter.close();
            System.out.println("Successfully written in the file");
        } catch (IOException e) {
            System.out.println("An error occur.");
            e.printStackTrace();
        }
    }
}
