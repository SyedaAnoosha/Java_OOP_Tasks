package lab_6_tasks;/*
01.	Write java code that takes a value at runtime and searches it in the array. If the value appears in
the array then it prints the position of the value or else prints a message that value is not found.
 */

public class Main {
    public static void main(String[] arg){
        int[] array = {2 ,4 , 67 , 34, 6, 78, 23, 45,124, 45};
        int size = array.length;
        int input = Integer.parseInt(arg [0]);

        for (int i = 0 ; i <= size ; i++){
            if (input == array[i]){
                System.out.println("The value is found\nThe index of the value is : " + i);
            }
            else{
                System.out.println("Not found");
            }
            break;
        }

    }
}
