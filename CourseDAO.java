/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class CourseDAO {

    public static void save(Course c, String uname) {

        try
        {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseregistration?useSSL=true", "root", "shyam");
        Statement stmt = conn.createStatement();
        String sql = " insert into enrolldetails(studentid,coursename,courseid,department,credits)"
                + " values ('" + uname + "','" + c.getName() + "','" + c.getCredits()+ "','" + c.getCode() + "','" +c.getDepartment()  + "')";
        stmt.executeUpdate(sql);
        
        }catch(Exception e) {
          e.printStackTrace();
            System.out.println(e);
        }
    }
    
    public static void delelte(Course s, String uname){
         try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseregistration?useSSL=true", "root", "shyam");
      Statement myStmt =conn.createStatement();
    
      
    
        String sql = "delete from enrolldetails where (courseid='"+s.getCredits()+"')";
           myStmt.executeUpdate(sql);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
