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

/**
 *
 * @author Apple
 */
public class Assessment extends SimpleTagSupport {
    DBConnect conn = new DBConnect();

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
            
            try {
              Connection newConn = conn.getMyConnection();
              Statement st= newConn.createStatement();
              //vaccination data
              //ResultSet visits
              ResultSet patients =st.executeQuery("SELECT COUNT(healthcentre) FROM vaccinated where healthcentre='"+value+"'");
                int entries = 0;
                //int visitors = 0;
                while(patients.next()){
                   //out.println(patients.getString(1));
                    entries = Integer.parseInt(patients.getString(1)); 
                }
                out.println(entries+(double)entries/2+"doses recommended");
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Assessment.class.getName()).log(Level.SEVERE, null, ex);
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
            throw new JspException("Error in assessment tag", ex);
        }
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
