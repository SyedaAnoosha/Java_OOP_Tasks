package practice_tasks;

class CountryCapital{
    public void display(){
        System.out.println("Capital of Pakistan is: ");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Islamabad");
        }
        System.out.println("Capital of Iran is: ");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Tehran");
        }
    }
}
class MyThread extends Thread{
    CountryCapital countryCapital;
    public void setValue(CountryCapital countryCapital){
        this.countryCapital=countryCapital;
    }

    @Override
    public void run() {
        synchronized (countryCapital){
            countryCapital.display();
        }
    }
}
public class DemoSynchronizationClass {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        MyThread t2 = new MyThread();

        CountryCapital countryCapital= new CountryCapital();
        t1.setValue(countryCapital);
        t2.setValue(countryCapital);
        t1.start();
        t2.start();
    }
}
