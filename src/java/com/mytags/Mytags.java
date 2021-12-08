package com.mytags;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JOJO
 */
public class Mytags extends SimpleTagSupport {

    private String table;
    private String values;
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            try{
                //loading the Driver
                Class.forName("com.mysql.jdbc.Driver");
                //connecting to DB
                try{
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccineadmintracker", "root", "");
                 
                Statement st = co.createStatement();
                out.println(values);
                String [] newValues = values.split(",");
                
                st.executeUpdate("insert into users set first_name='"+newValues[0]+"',last_name='"+newValues[1]+"',email='"+newValues[2]+"',username='"+newValues[3]+"',password='"+newValues[4]+"',role='"+newValues[5]+"'");
                //out.println("successfully inserted, to view click<a href=''>View product</a>");
                out.print(newValues);
                }catch(SQLException z){
                      out.println("error :"+z.getMessage());
                }
                
                
            }catch(ClassNotFoundException z){
                out.println("error :"+z.getMessage());
                        
            }
            
             
            
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Mytags tag", ex);
        }
    }
    public void setTable(String table){
        this.table = table;
    
    }
     public void setValues(String values){
        this.values = values;
    
    }
    
}
