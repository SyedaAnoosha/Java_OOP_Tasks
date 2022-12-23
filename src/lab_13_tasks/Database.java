package lab_13_tasks;

import java.sql.*;

public class Database {
    Database(String name, String roll, String batch, String section, String Gender, String Qualification, String Address, String Country){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db1","root","");
            String query = "INSERT INTO studentdata VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement myStmt = con.prepareStatement(query);
            myStmt.setString(1, name);
            myStmt.setString(2, roll);
            myStmt.setString(3, batch);
            myStmt.setString(4, section);
            myStmt.setString(5, Gender);
            myStmt.setString(6, Qualification);
            myStmt.setString(7, Address);
            myStmt.setString(8, Country);

            int res = myStmt.executeUpdate();
            System.out.println("Records updated");

            con.close();
        }catch(Exception e){ System.out.println(e);}

    }}
