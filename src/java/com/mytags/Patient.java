/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mytags;

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
public class Patient extends SimpleTagSupport {

    private String table;
    private String values;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
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
                String [] myValues = values.split(",");
                
                st.executeUpdate("insert into patients set NIN ='"+myValues[0]+"',patient_name = '"+myValues[1]+"',date_of_admin='"+myValues[2]+"',batch_number='"+myValues[3]+"',vaccine_administered='"+myValues[4]+"'");
                //out.println("successfully inserted, to view click<a href=''>View product</a>");
                out.print(myValues);
                }catch(SQLException z){
                      out.println("error :"+z.getMessage());
                }
                
                
            }catch(ClassNotFoundException z){
                out.println("error :"+z.getMessage());
                        
            }
            
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Patient tag", ex);
        }
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setValues(String values) {
        this.values = values;
    }
    
}
