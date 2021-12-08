/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.user.login;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JOJO
 */
public class loginValidation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String role = request.getParameter("role");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginValidation</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                try{
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccineadmintracker", "root", "");
                 PreparedStatement ps = co.prepareStatement("select * from users where email=? password=? and role=?");
                ps.setString(1,email);
                ps.setString(2, password);
                ps.setString(3, role);
                
                ResultSet rs = ps.executeQuery();
                RequestDispatcher rd;
                while(rs.next()){
                    if(rs.getString(1).equals(email)&&rs.getString(2).equals(password)&&rs.equals(role)){
                rd=request.getRequestDispatcher("");
                rd.forward(request, response);
                
                }
                
                }
                rd=request.getRequestDispatcher("");
                out.print("The credentials are incorrect ");
                rd.include(request, response);
                
                }catch(SQLException z){
                      out.println("error :"+z.getMessage());
                }
                
                
            }catch(ClassNotFoundException z){
                out.println("error :"+z.getMessage());
                        
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
