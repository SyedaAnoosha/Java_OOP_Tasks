package Temperature_Converter_using_Java_GUI_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame= new JFrame("Temperature Converter");
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel celc= new JLabel("Celsius");
        celc.setBounds(50,40,50,50);
        frame.add(celc);

        JTextField celc1= new JTextField();
        celc1.setBounds(200,60,150,20);
        frame.add(celc1);

        JLabel fahr= new JLabel("Fahrenheit");
        fahr.setBounds(50,90,100,50);
        frame.add(fahr);

        JTextField fahr1= new JTextField();
        fahr1.setBounds(200,110,150,20);
        frame.add(fahr1);

        JButton conCtoF = new JButton("C to F");
        conCtoF.setBounds(80,200,100,20);
        frame.add(conCtoF);

        JButton contFoC = new JButton("F to C");
        contFoC.setBounds(200,200,100,20);
        frame.add(contFoC);

        conCtoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= Double.parseDouble(celc1.getText());
                double result=(a * 9/5) + 32;
                String res= String.valueOf(result);
                fahr1.setText(res);
            }
        });

        contFoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= Double.parseDouble(fahr1.getText());
                float i = (float)5 / 9;
                double result=((a - 32) * i);
                String res= String.valueOf(result);
                celc1.setText(res);
            }
        });

        frame.setVisible(true);

    }
}