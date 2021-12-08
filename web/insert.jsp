<%-- 
    Document   : insert
    Created on : Dec 3, 2021, 4:53:58 AM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="healthcentretld" uri="/WEB-INF/tlds/healthcentretld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insert JSP Page</title>
    </head>
    <body>
       
        <%
            
            String name = request.getParameter("name");
            String location  = request.getParameter("loc");
           
        %>

        <healthcentretld:insert table="hospitals" values="${name} , ${location}"/>
       
        
        <% out.println("Success..."); %>

    </body>
</html>
