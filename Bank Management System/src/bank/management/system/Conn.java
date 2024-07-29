package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn()  {
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","Patil@123"); //step 2
            s = c.createStatement();     //step 3

        }  catch (Exception e){
            System.out.println(e);
        }
    }
}
