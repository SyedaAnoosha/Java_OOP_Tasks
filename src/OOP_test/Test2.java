package OOP_test;

class Num extends Thread{
    public void run(){
        for(int i =1; i<=100 ; i++){
            System.out.println(i +" sqaure: "+ i*i);

        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        Num n1= new Num();
        n1.start();
    }
}
