package lab_7_tasks;/*
1.	Write a program based on threads. Perform multi-threading and print even and such that when the
 numbers reach at value 30 then give a delay of 5 seconds.After the delay, the program will continue
 to print the series at the same manner.
 */

public class Main implements Runnable{
    public static void main(String[] args) {
        Main obj=new Main();
        Thread thread=new Thread(obj);
        thread.start();
    }
    public void run(){
        for(int i=0; i<=50;i++){
            if(i%2==0) {
                System.out.print(i+"    ");
                if (i == 30) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}