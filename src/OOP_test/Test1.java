package OOP_test;

class Number extends Thread{
    private int count =0;
    private long sum=0;
    public void run() {
        for (int i = 150001;i<=160000;i++){
            if(i%2!=0 && count<=150){
                System.out.println(i);
                count++;
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
public class Test1 {
    public static void main(String[] args) {
        Number sq= new Number();
        sq.start();

    }
}
