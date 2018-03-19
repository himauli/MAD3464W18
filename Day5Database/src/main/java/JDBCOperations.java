
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 725975
 */
public class JDBCOperations {
    
    static Connection conn;
    static PreparedStatement stmt;
    static ResultSet rs;
    static String USER = "root";
    static String PASS = "";
    
    public static void main(String [] args)
    {
        connectDB();
        selectDB();
        
        insertDB();
        selectDB();
        
        updateDB();
        selectDB();
        
        deletDB();
        selectDB();
    }
    
    static void connectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/MADWinter18", USER, PASS);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
      static void insertDB()
    {
        try
        {
            stmt = conn.prepareStatement("insert into orderInfo values(?, ?, ?, ?)");
            stmt.setInt(1, 101); //1 Apecifies the first parameter in the query
            stmt.setString(2, "Mouse");
            stmt.setInt(3, 12);
            stmt.setString(4, "Apple");
            
            int i = stmt.executeUpdate();
            System.out.println(i+ "records inserted");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        try
        {
            stmt = conn.prepareStatement("insert into person values(?, ?, ?, ?)");
            stmt.setInt(1, 102); //1 Apecifies the first parameter in the query
            stmt.setString(2, "Foram");
            stmt.setString(3, "Patel");
            stmt.setInt(4, 12);
            
            int nrec = stmt.executeUpdate();
            System.out.println(nrec+ " records inserted");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
    }
      
      static void selectDB()
      {
          try
          {
              stmt = conn.prepareStatement("Select * from person");
              
              rs = stmt.executeQuery();
              
              while(rs.next())
              {
                  System.out.println("ID : "+rs.getInt(1)+"\n FirstName : "+rs.getString("FirstName")+"\n LastName : "+rs.getString("LastName")+"\n Age : "+rs.getInt("Age"));
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }
         
      }
      
      static void deletDB()
      {
          try
        {
            stmt = conn.prepareStatement("delete from person where ID = (?)");
            stmt.setInt(1, 102); //1 Apecifies the first parameter in the query
          
            
            int i = stmt.executeUpdate();
            System.out.println(i+ " records deleted");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
          
      }
      
      static void updateDB()
      {
          try{
            stmt = conn.prepareStatement("UPDATE Person SET FirstName = ?, LastName = ?, Age = ? WHERE Id = ?");
            
            stmt.setString(1, "Foram");
            stmt.setString(2, "Panchal");
            stmt.setInt(3, 22);
            stmt.setInt(4, 102);
            
            int nrec = stmt.executeUpdate();
            System.out.println(nrec+ " records updated");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
      }
      
      static void closeDB()
      {
          try
          {
              if(conn != null)
              {
                  conn.close();
              }
          }
          catch(SQLException e)
          {
              e.printStackTrace();
          }        
      }
}
