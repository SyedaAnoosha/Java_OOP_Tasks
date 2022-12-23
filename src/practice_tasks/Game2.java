package practice_tasks;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Game2 extends JFrame implements ActionListener{

    static boolean Check=true;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,Reset,Forfit;
    JLabel Winner,Turn;

    Game2() {

        //frame
        setTitle("TIC TAC TOE");
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\SW Lecturer\\1st Subject Summer Semester OOP\\Eclipse Data\\E Workspace\\MyProj\\src\\Tic_tac_toe.png"));
        setSize(400,500);
        setLayout(new BorderLayout());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(false);
        setLocationRelativeTo(null);

        //Panel1
        JPanel p1=new JPanel();
        p1.setLayout(new BorderLayout());

        JLabel l1=new JLabel("Welcome to game");
        JLabel l2=new JLabel("  Player 1 > X");
        JLabel l3=new JLabel("Player 2 > O  ");
        Turn = new JLabel("Player 1 turn");

        p1.add(l1,BorderLayout.NORTH);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        p1.add(l2,BorderLayout.WEST);
        p1.add(l3,BorderLayout.EAST);
        p1.add(Turn,BorderLayout.CENTER);
        Turn.setHorizontalAlignment(SwingConstants.CENTER);

        add(p1,BorderLayout.NORTH);

        //Panel2
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(3,3,6,6));

        b1=new JButton();
        b1.addActionListener(this);
        b2=new JButton();
        b2.addActionListener(this);
        b3=new JButton();
        b3.addActionListener(this);
        b4=new JButton();
        b4.addActionListener(this);
        b5=new JButton();
        b5.addActionListener(this);
        b6=new JButton();
        b6.addActionListener(this);
        b7=new JButton();
        b7.addActionListener(this);
        b8=new JButton();
        b8.addActionListener(this);
        b9=new JButton();
        b9.addActionListener(this);

        p2.add(b1); p2.add(b2); p2.add(b3);
        p2.add(b4); p2.add(b5); p2.add(b6);
        p2.add(b7); p2.add(b8); p2.add(b9);

        add(p2,BorderLayout.CENTER);

        //Panel3
        JPanel p3=new JPanel();
        p3.setLayout(new FlowLayout());

        Forfit = new JButton("FORFIT");
        Forfit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Check) {
                    Winner.setText("Player 2 Wins");
                    Reset.setEnabled(true);
                }
                else {
                    Winner.setText("Player 1 Wins");
                    Reset.setEnabled(true);
                }
                Forfit.setEnabled(false);
            }
        });
        Reset = new JButton("RESET");
        Reset.setEnabled(false);
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setText(""); b1.setEnabled(true);
                b2.setText(""); b2.setEnabled(true);
                b3.setText(""); b3.setEnabled(true);
                b4.setText(""); b4.setEnabled(true);
                b5.setText(""); b5.setEnabled(true);
                b6.setText(""); b6.setEnabled(true);
                b7.setText(""); b7.setEnabled(true);
                b8.setText(""); b8.setEnabled(true);
                b9.setText(""); b9.setEnabled(true);
                Winner.setText("");
                Turn.setText("Player 1 turn");
                Check=true;
                Reset.setEnabled(false);
                Forfit.setEnabled(true);
            }});
        Winner = new JLabel();

        p3.add(Forfit); p3.add(Reset); p3.add(Winner);

        add(p3,BorderLayout.SOUTH);

        //frame
        setVisible(true);
    }
    public static void main(String[] args) {
        new Game2();
    }

    public void Win() {
        if((b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X")||
                (b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X")||
                (b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X")||
                (b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X")||
                (b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X")||
                (b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X")||
                (b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X")||
                (b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X")) {
            Winner.setText("PLAYER 1 WINS");
            Reset.setEnabled(true);
            Forfit.setEnabled(false);
        }
        else if((b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O")||
                (b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O")||
                (b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O")||
                (b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O")||
                (b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O")||
                (b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O")||
                (b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O")||
                (b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O")) {
            Winner.setText("PLAYER 2 WINS");
            Reset.setEnabled(true);
            Forfit.setEnabled(false);
        }
        else if((!b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() &&
                !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() &&
                !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled())) {
            Winner.setText("GAME DRAW");
            Reset.setEnabled(true);
            Forfit.setEnabled(false);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(Check) {
            ((JButton) e.getSource()).setText("X");
            ((JButton) e.getSource()).setEnabled(false);
            Turn.setText("Player 2 turn");
            Check=false;
        }
        else {
            ((JButton) e.getSource()).setText("O");
            ((JButton) e.getSource()).setEnabled(false);
            Turn.setText("Player 1 turn");
            Check=true;
        }
        Win();
    }

}
