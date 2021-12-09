<%-- 
    Document   : vaccinestatus
    Created on : Dec 8, 2021, 12:38:20 AM
    Author     : RICHiEART
--%>
<%@taglib uri="/tlds/vaccineinventory" prefix="inventorystatus" %>
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
     
        <vaccineintentory:inventorystatus table="inventory" values="${V}, ${D}, ${T}"/>
        
       
    </body>
</html>
