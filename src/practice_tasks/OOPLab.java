package practice_tasks;/*
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.*;

public class OOPLab{

    public static void main(String[] args) throws FileNotFoundException, IOException{
        Border emptyBorder = BorderFactory.createEmptyBorder();
        Border loweredBorderEtched = new EtchedBorder(EtchedBorder.LOWERED);
        String[] CountryList = {"Pakistan","UK","India","US","China","UAE"};

        final JFrame frame= new JFrame();
        frame.setLayout(null);
        frame.setBounds(300, 100,900, 600);
        frame.getContentPane().setBackground(Color.green);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Student Registrations");


        //name
        JLabel Name = new JLabel("Student Name");
        Name.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Name.setBounds(100, 50, 200, 20);


        final JTextField Namef = new JTextField();
        Namef.setBounds(400, 45, 150, 25);
        Namef.setFont((new Font("Open Sans", Font.PLAIN, 18)));



        final JLabel RegNo = new JLabel("Registration no");
        RegNo.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        RegNo.setBounds(100, 100, 400, 25);

        final	JTextField Regf = new JTextField();
        Regf.setBounds(400, 95, 150, 25);
        Regf.setFont((new Font("Open Sans", Font.PLAIN, 18)));


        final JLabel Gender = new JLabel("Gender");
        Gender.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Gender.setBounds(100, 150, 100, 20);

        final JRadioButton r1=new JRadioButton("male");
        final JRadioButton r2=new JRadioButton("female");
        final JRadioButton r3=new JRadioButton("Unspecified");

        r1.setBackground(Color.green);
        r2.setBackground(Color.green);
        r3.setBackground(Color.green);
        r1.setFont((new Font("Open Sans", Font.PLAIN, 14)));
        r2.setFont((new Font("Open Sans", Font.PLAIN, 14)));
        r3.setFont((new Font("Open Sans", Font.PLAIN, 14)));

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);bg.add(r3);

        r1.setBounds(400,145,100,30);
        r2.setBounds(500,145,100,30);
        r3.setBounds(600, 145, 400, 30);



        JLabel Batch = new JLabel("Batch");
        Batch.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Batch.setBounds(100, 250, 100, 20);

        final JTextField Batchf = new JTextField();
        Batchf.setBounds(400, 245, 150, 25);
        Batchf.setFont((new Font("Open Sans", Font.PLAIN, 18)));


        JLabel Section = new JLabel("Section");
        Section.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Section.setBounds(100, 200, 100, 20);


        final JTextField Sectionf = new JTextField();
        Sectionf.setBounds(400, 195, 150, 25);
        Sectionf.setFont((new Font("Open Sans", Font.PLAIN, 18)));



//qualification
        final JLabel Qualitfication = new JLabel("Qualitfication");
        Qualitfication.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Qualitfication.setBounds(100, 300, 150, 20);

        final JCheckBox checkBox1 = new JCheckBox("Matric");
        checkBox1.setBounds(400,295, 70,20);
        checkBox1.setBackground(Color.green);

        final JCheckBox checkBox2 = new JCheckBox("College");
        checkBox2.setBounds(470,295, 80,20);
        checkBox2.setBackground(Color.green);

        final JCheckBox checkBox3 = new JCheckBox("Undergraduate");
        checkBox3.setBounds(550,295, 130,20);
        checkBox3.setBackground(Color.green);

        final JCheckBox checkBox4 = new JCheckBox("graduate");
        checkBox4.setBounds(670,295, 100,20);
        checkBox4.setBackground(Color.green);

        checkBox1.setFont((new Font("Open Sans", Font.PLAIN, 14)));
        checkBox2.setFont((new Font("Open Sans", Font.PLAIN, 14)));
        checkBox3.setFont((new Font("Open Sans", Font.PLAIN, 14)));
        checkBox4.setFont((new Font("Open Sans", Font.PLAIN, 14)));


//Country		
        JLabel Country = new JLabel("Country");
        Country.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Country.setBounds(100, 350, 100, 20);

        final JComboBox Countries = new JComboBox(CountryList);
        Countries.setBounds(400, 345, 150, 25);
        Countries.setSelectedIndex(2);
        Countries.setFont((new Font("Open Sans", Font.PLAIN, 14)));

//address
        JLabel Address = new JLabel("Address");
        Address.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Address.setBounds(100, 400, 100, 20);

        final JTextArea Addressf= new JTextArea();
        Addressf.setBounds(400, 395, 300, 75);
        Addressf.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Addressf.setBorder(loweredBorderEtched);


        //buttons
        JButton exit = new JButton("Exit");
        exit.setBounds(100,500,100,20);
        exit.setFont((new Font("Open Sans", Font.PLAIN, 18)));

        JButton Print = new JButton("Display");
        Print.setBounds(600, 500, 100, 20);
        Print.setFont((new Font("Open Sans", Font.PLAIN, 18)));

        JButton Create = new JButton("Save");
        Create.setFont((new Font("Open Sans", Font.PLAIN, 18)));
        Create.setBounds(350, 500, 100, 20);

        frame.add(Name);
        frame.add(Namef);
        frame.add(RegNo);
        frame.add(Regf);
        frame.add(Batch);
        frame.add(Batchf);
        frame.add(Section);
        frame.add(Sectionf);
        frame.add(Gender);
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(Qualitfication);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);
        frame.add(Address);
        frame.add(Addressf);
        frame.add(Country);
        frame.add(Countries);
        frame.add(exit);
        frame.add(Print);
        frame.add(Create);

        //exit
        exit.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       // TODO Auto-generated method stub
                                       System.exit(0);
                                   }
                               }
        );

        //create
        Create.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {



                // TODO Auto-generated method stub
                String Name=Namef.getText();

                String Regno=Regf.getText();
                String Batch=Batchf.getText();
                String gender;
                if(r1.isSelected()) {
                    gender="Male";
                }
                else if(r2.isSelected()) {
                    gender="Female";
                }
                else{
                    gender="Prefer not to say";
                }
                String Section= Sectionf.getText();
                String Country=(String) Countries.getSelectedItem();
                String Address= Addressf.getText();
                String Quali = "";
                if(checkBox1.isSelected()) {
                    Quali+="  Matric";
                }
                if(checkBox2.isSelected()) {
                    Quali+=",  College";
                }if(checkBox3.isSelected()) {
                    Quali+="  undergraduate";
                }if(checkBox4.isSelected()) {
                    Quali+="  Graduate";
                }

                JSONObject obj = new JSONObject();
                obj.put("Name",Name);
                obj.put("Gender",gender);
                obj.put("Regno",Regno);
                obj.put("Batch",Batch);
                obj.put("Section",Section);
                obj.put("Qualification",Quali);
                obj.put("Country",Country);
                obj.put("Address",Address);
                try {
                    FileWriter file = new FileWriter("Student.json");
                    file.write(obj.toString());
                    file.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }


        });

        Print.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String Print;

                Object obj;
                try {
                    obj = new JSONParser().parse(new FileReader("Student.json"));
                    JSONObject read = (JSONObject) obj;




                    Print = "Name = "+read.get("Name")+"\nRegno = "+read.get("Regno")+"\nGender = "+read.get("Gender");
                    Print+="\nBatch = "+read.get("Batch")+"\nSection = "+read.get("Section")+"\nQualifciation = "+read.get("Qualification");
                    Print+="\nCountry = "+read.get("Country")+"\nAddress = "+read.get("Address");


                    JOptionPane.showMessageDialog(frame, Print);



                } catch (IOException | ParseException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }




            }

        });


        frame.setVisible(true);

    }

}
*/
