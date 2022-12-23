package practice_tasks;

import javax.swing.*;
import java.util.Scanner;
class Calc{
    int i;
    private JButton button1;

    int square(int k) {
        this.i=k;
        for (int j = 1; j < k; j++) {
            this.i += k;
        }
        return i;
    }
}
public class Task {
    public static void main(String[] args) {
        Calc c = new Calc();
        Scanner sc  = new Scanner(System.in);
        int k= sc.nextInt();
        System.out.println(c.square(k));
    }
}