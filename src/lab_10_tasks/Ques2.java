package lab_10_tasks;/*
Write a java program based on filing. Perform Create, Read and Write operations on text
file using BufferedReader and BufferedWriter Class.
 */
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ques2 {
    public static void main(String[] args) throws IOException {
        // Write and creating a file
        FileWriter fw = new FileWriter("C:\\Users\\Desktop\\TestFile.txt");
        BufferedWriter WriteFile = new BufferedWriter(fw);
        WriteFile.write("Hello");
        WriteFile.newLine();
        WriteFile.write("Hi");
        WriteFile.newLine();
        WriteFile.write("Wassup");
        WriteFile.newLine();
        WriteFile.close();
        
        FileReader fr = new FileReader("C:\\Users\\Desktop\\TestFile.txt");
        BufferedReader ReadFile = new BufferedReader(fr);
        System.out.println(ReadFile.readLine());
        System.out.println(ReadFile.readLine());
        System.out.println(ReadFile.readLine());
        ReadFile.close();
    }
}
