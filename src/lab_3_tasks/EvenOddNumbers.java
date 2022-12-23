package lab_3_tasks;

//Generate series of odd and even numbers  using loops in java
public class EvenOddNumbers {
    public static void main(String[] args) {

        //Using for loop
        System.out.println("Odd:    Even: ");
        for(int i =1;i<=20;i++){
            if (i % 2 != 0) {
                System.out.print(i+"       ");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println();


        //Using while loop
        System.out.println("Odd:    Even: ");
        int x=1;
        while(x<=20){
            if (x % 2 != 0) {
                System.out.print(x+"       ");
                x++;
            }
            else{
                System.out.println(x);
                x++;
            }
        }
    }
}
