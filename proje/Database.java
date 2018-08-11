package proje;


import java.sql.*;

public class Database {
    
    Database() throws SQLException{
        this.runDb();
        this.st=con.createStatement();
    }
    
    
    
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    
    public static String url="jdbc:mysql://localhost:3306/proje";
    public static String user="eda";
    public static String password="123";
    
    public void runDb() throws SQLException{
        con=DriverManager.getConnection(url,user,password);
    }
    
}
