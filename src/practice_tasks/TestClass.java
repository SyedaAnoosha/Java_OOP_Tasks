package practice_tasks;/*
class Numbers{
    private int count=0;
    public void display(){
        for(int i= 10000 ; i<=20000 ; i++){
            if(i%2==0 && count<=100) {
                System.out.println(i);
                System.out.println(i*i);
                count++;
                }
            }
        }
    }
}
class Square extends Thread{
    Numbers n1 ;
    Square(){
        n1 = new Numbers();
    }
    public void run() {
        synchronized (n1){
            n1.display();
        }
    }
}
public class TestClass {
    public static void main(String[] args) {
        Square sq=  new Square();
        sq.start();
    }
}
*/
