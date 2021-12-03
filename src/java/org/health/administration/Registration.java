/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.health.administration;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author JOJO
 */
public class Registration extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>User Registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div align = center>");
            out.println("<h1>User Registration Form</h1>");
            out.println("</div>");
            String form="<form action=\"/Vaccine-Administration-tracker/User\" method=\"post\">\n" +
"               <table align=\"center\">\n" +
"                   <tr>\n" +
"                       <td>Firstname</td>\n" +
"                       <td><input type=\"text\" name=\"fname\"></td>\n" +
"                   </tr>\n" +
"                    <tr>\n" +
"                       <td>Lastname</td>\n" +
"                       <td><input type=\"text\" name=\"lname\"></td>\n" +
"                   </tr>\n" +
"                    <tr>\n" +
"                       <td>Email</td>\n" +
"                       <td><input type=\"text\" name=\"email\"></td>\n" +
"                   </tr>\n" +
"                   <tr>\n" +
"                       <td>Username</td>\n" +
"                       <td><input type=\"text\" name=\"username\"></td>\n" +
"                   </tr>\n" +
"                   <tr>\n" +
"                       <td>Password</td>\n" +
"                       <td><input type=\"password\" name=\"username\"></td>\n" +
"                   </tr>\n" +
"                   <tr>\n" +
"                       <td>Submit</td>\n" +
"                       <td><input type=\"submit\" name=\"sub\" value=\"save\"></td>\n" +
"                   </tr>\n" +
"               </table>\n" +
"        </form>";
            out.println(form);
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
