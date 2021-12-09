<%-- 
    Document   : registrationdata
    Created on : Dec 8, 2021, 11:51:38 PM
    Author     : istech
--%>
<%@taglib uri="/tlds/RegisterVaccine" prefix="registervaccine"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
            
            String V=request.getParameter("Vaccine");
            String D=request.getParameter("Doses");
            String T=request.getParameter("date");
   %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <registervaccine:Register table="vaccine" values="${V},${D},${T}"/>
    </body>
</html>
