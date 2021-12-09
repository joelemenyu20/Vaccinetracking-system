/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.health.vaccine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author istech
 */
public class Distributer extends SimpleTagSupport {

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
        try{
        try {
            Class.forName("com.mysql.jdbc.Driver");
           // Driver started successfully
           
           try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccineadmintarker","root","");
               
                Statement st = conn.createStatement();
                
               String[] newValues = values.split(",");
               
               st.executeUpdate("insert into vaccine set date="+newValues[0]+",Vaccine="+newValues[1]+",status="+newValues[2]+",Amount="+newValues[3]+"');");
         
               out.println(newValues);
                 }catch(SQLException e){
                    out.println("<br>There is an error: "+ e.getMessage());
                }
              }catch(ClassNotFoundException e){          
                out.println("<br><br>loading the driver has result to an error: "+e.getMessage());
            }
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
            } catch (java.io.IOException ex) {
            throw new JspException("Error in Distributer tag", ex);
        }
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setValues(String values) {
        this.values = values;
    }
    
}
