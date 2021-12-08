/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.health.health;

import java.sql.Connection;
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
public class Update extends SimpleTagSupport {

    DBConnect conn = new DBConnect();
    private String table;
    private String newvalue;
    private String where;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {

            Connection newConn;
            
                newConn = conn.getMyConnection();
                Statement st= newConn.createStatement();
                String [] value= newvalue.split(",");
                if(value.length!=0){
                  st.executeQuery("UPDATE 'hospitals' SET Location='"+value[0]+"',Name='"+value[1]+"' WHERE Id='"+where+"'");  
                }else{
                    out.println("nothing to update");
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
            throw new JspException("Error in update tag", ex);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setNewvalue(String newvalue) {
        this.newvalue = newvalue;
    }

    public void setWhere(String where) {
        this.where = where;
    }
    
}
