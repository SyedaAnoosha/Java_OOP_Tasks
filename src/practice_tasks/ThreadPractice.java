package practice_tasks;

class A extends Thread{
    @Override
    public void run() {
        for (int i = 0 ;i<10; i++){
            System.out.println("Thread A: "+i);
        }
    }
}
class B extends Thread{
    @Override
    public void run() {
        for (int i = 0 ;i<10; i++){
            System.out.println("Thread B: "+i);
        }
    }
}
class C implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ;i<10; i++){
            System.out.println("Thread C: "+i);
        }
    }
}
public class ThreadPractice {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread T1= new Thread(new C());
        a.setPriority(Thread.MAX_PRIORITY);
        b.start();
        a.start();
        T1.start();
    }
}
