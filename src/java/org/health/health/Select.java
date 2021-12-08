/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.health.health;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import static jakarta.servlet.jsp.tagext.TagAttributeInfo.ID;

/**
 *
 * @author Apple
 */
public class Select extends SimpleTagSupport {
    DBConnect conn = new DBConnect();

    private String table;
    private String values;

    /**
     * Called by the container to invoke this tag.The implementation of this
 method is provided by the tag library developer, and handles all tag
 processing, body iteration, etc.
     * @throws jakarta.servlet.jsp.JspException
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            
          
            try {
                Connection newConn = conn.getMyConnection();
                
                Statement st= newConn.createStatement();
                ResultSet centre =st.executeQuery("select * from healthcentres");
                
                    out.println("<table border='1'>");
                    out.println("<tr>");
                    out.println("<td>ID</td>");
                    out.println("<td>Name</td>");
                    out.println("<td>Location</td>");
                    out.println("<td>Action</td>");
                    out.println("</tr>");
                    out.println("</table>");
      
                while(centre.next()){
                    out.println("<table border='1'>");
                    out.println("<tr>");
                    out.println("<td >" +centre.getString(1) +"</td>");
                    out.println("<td>" +centre.getString(2) +"</td>");
                    out.println("<td>" +centre.getString(3) +"</td>");
                    out.println("<td><a href='CentreUpdate.jsp'>Edit</a></td>");
                    out.println("</tr>");
                    out.println("</table>");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
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
            throw new JspException("Error in Select tag", ex);
        }
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setValues(String values) {
        this.values = values;
    }
    
}
