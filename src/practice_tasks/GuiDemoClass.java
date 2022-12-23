package practice_tasks;

import javax.swing.*;
import java.awt.*;

public class GuiDemoClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\anush\\Downloads\\tictactoe.jpeg"));
        frame.setLayout( new BorderLayout(5,5));
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        JPanel P3 = new JPanel();

        frame.add(P1,BorderLayout.NORTH);
        frame.add(P2,BorderLayout.CENTER);
        frame.add(P3,BorderLayout.SOUTH);

        P1.setLayout( new BorderLayout(2,2));
        JLabel L1 = new JLabel("Welcome to the Game!");
        JLabel L2 = new JLabel("Player 1 : X");
        JLabel L3 = new JLabel("Player 2 : O");
        JLabel Turn= new JLabel("Player 1 Turn");

        P1.add(L1,BorderLayout.CENTER);
        P1.add(L2,BorderLayout.WEST);
        P1.add(L3,BorderLayout.EAST);

        P2.setLayout( new GridLayout(3,3,4,4));
        P2.setPreferredSize(new Dimension(5,5));
        JButton B1=new JButton();
        JButton B2=new JButton();
        JButton B3=new JButton();
        JButton B4=new JButton();
        JButton B5=new JButton();
        JButton B6=new JButton();
        JButton B7=new JButton();
        JButton B8=new JButton();
        JButton B9=new JButton();


        P2.add(B1);P2.add(B2);P2.add(B3);
        P2.add(B4);P2.add(B5);P2.add(B6);
        P2.add(B7);P2.add(B8);P2.add(B9);

        P3.setLayout( new FlowLayout());
        JButton reset = new JButton("Reset");
        frame.setVisible(true);
    }
}
