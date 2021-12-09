<%-- 
    Document   : Userdata
    Created on : Dec 5, 2021, 6:43:35 AM
    Author     : JOJO
--%>
<%
            String f = request.getParameter("fname");
            String l = request.getParameter("lname");
            String e = request.getParameter("email");
            String u = request.getParameter("username");
            String p = request.getParameter("password");
            String r = request.getParameter("role");
%>
<%@taglib prefix="mytags" uri="/WEB-INF/tlds/Mytags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Save User</title>
    </head>
    
    <body>
        <h1>Successful</h1>
        
    </body>
    <mytags:Mytags table="users" values="${f},${l},${e},${u},${p},${r}"/>
</html>
