package lab_9_tasks;/*
Write a program with a mother class and an inherited daugther class. Both of them should have a method void display ()that prints a message (different for mother and daugther). In the main define a daughter and call the display() method on it
 */

class Mother{
    public void display(){
        System.out.println("This is mother class");
    }
}
class Daughter extends  Mother{
    public void display(){
        System.out.println("This is daughter class");
    }
}
public class Task2{
    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.display();
    }
}