package lab_7_tasks;/*
2.	Create three classes, Storage, Counter, and Printer. The Storage class should store an integer.
The Counter class should create a thread that starts counting from 0 (i.e. 0,1, 2,3,4….) and stores
each value in the Storage class. The Printer class should create a new thread that keeps reading the
value in the Storage class and printing it.
 */

class Task2
{
    public static void main(String[] args)
    {
        Storage Store = new Storage();
        Counter Count= new Counter(Store);
        Printer Print= new Printer(Store);

        Print.start();
        Count.start();

    }
}
class Storage{
    int i=0;
    public synchronized void incI(int v)
    {
        i = v;
    }
    public synchronized int getI()
    {
        return i;
    }
}//storage class close

class Counter extends Thread{

    Storage Cstore;
    public Counter(Storage Cstore)
    {
        this.Cstore = Cstore;
    }
    public void run()
    {
        for(int i=0;i<=20;i++)
        {
            synchronized (Cstore) {
                Cstore.incI(i);
                Cstore.notify();
                try {
                    Cstore.wait();
                }
                catch(InterruptedException ie) { System.out.println("Exception is caught in first thread");}
            }
        }
    }
}//counter class close

class Printer extends Thread{
    Storage Pstore;
    public Printer(Storage Pstore)
    {
        this.Pstore = Pstore;
    }
    public void run() {
        int counter = 0;
        synchronized (Pstore) {
            while (counter <= 20) {
                try {
                    Pstore.wait();
                }
                catch(InterruptedException ie) { System.out.println("Exception is caught in second thread"); }
                System.out.println(counter=Pstore.getI());
                Pstore.notify();
            }
        }
    }
}//printer class close