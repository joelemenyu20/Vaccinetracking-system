/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.health.vaccine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class inventorystatus extends SimpleTagSupport {

    
    private String value;

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
            Class.forName("com.mysql.cj.jdbc.Driver");
           // Driver started successfully
             try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccineadmintarker","root","");
               
                Statement st = conn.createStatement();
                
                String Sum = "select sum(Amount) from vaccine";
                
               
               ResultSet rs = st.executeQuery(Sum);
               rs.next();
               
               int totalInventory = rs.getInt(1);
               out.println("Total Inventory:"+ totalInventory);
               
               out.println("</br>");
               out.println("</br>");
                
               ResultSet ret = st.executeQuery("select distinct from vaccine");
               out.println("<table>");
               
                while(ret.next()){
                   String vaccine = ret.getString("Vaccine");
                   String status = ret.getString("status");
                   String Amount = ret.getString("Amount");
                   out.println("<tr><td>"+vaccine+"</td>"+"<td> </td>"+"<td> </td>"+"<td>"+status+"</td>"+"<td> </td>"+"<td> </td>"+"<td>"+Amount+"</td></tr>");
//                
                 
               }
               out.println("</table>");
                }catch(SQLException e){
                    out.println("<br>There is an error:: "+ e.getMessage());
                }
              }catch(ClassNotFoundException e){          
                out.println("<br><br>loading the driver has result to an error:: "+e.getMessage());
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
            throw new JspException("Error in inventorystatus tag", ex);
        }
    }


    public void setValue(String value) {
        this.value = value;
    }
    
}
