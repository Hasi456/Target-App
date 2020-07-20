/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.industrialmaster.tms.control;

import com.industrialmaster.tms.model.Target; 
import com.industrialmaster.tms.util.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nadun Shyn
 */
public class TargetController {
    
    
    static public boolean save(Target target){
        try {
            //2. Generate Non Fillables
        
        
            //3.Create SQL Statement
            String sql = "INSERT INTO target "+
                            " (name, amount, target_date,start_date, status) "+
                            " VALUES (?,?,?,NOW(),0)";

            //4. Create a database Connection
            String url = "jdbc:mysql://localhost:3306/dbtms";
            String userName = "root";
            String password = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName, password);
            
            //5. Create a Prepared Statement
            PreparedStatement ps = con.prepareStatement(sql);
            
            //6. Fill Prepared Statement
            ps.setString(1, target.getName());
            ps.setDouble(2, target.getAmount());
            java.sql.Date targetDate = new java.sql.Date(target.getTargetDate().getTime());
            ps.setDate(3, targetDate);
            
            //7. Execute Statement
            ps.executeUpdate();
            
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static List<Target> list(){
        try {
            List<Target> list = new ArrayList<Target>();
            //1. SQL
            String sql = "SELECT * FROM target";
            //2. DB Connection
            Connection con = DB.getConnection();
            
            //3. Create PS
            PreparedStatement ps = con.prepareStatement(sql);
            //4. Set PS Parameter
            //5.Execute SQL
            ResultSet rs =  ps.executeQuery();
            //6. Create Target Objects and add to the List
            while(rs.next()){
                String name = rs.getString("name");
                double amount = rs.getDouble("amount");
                Date targetDate = rs.getDate("target_date");
                
                Target target = new Target();
                target.setName(name);
                target.setAmount(amount);
                target.setTargetDate(targetDate);
                
                list.add(target);
            }
             
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
