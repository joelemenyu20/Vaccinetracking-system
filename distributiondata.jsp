<%-- 
    Document   : distributiondata
    Created on : Dec 8, 2021, 9:59:50 PM
    Author     : istech
--%>
<%@taglib uri="/WEB-INF/tlds/vacxdistributer" prefix="vacxdistributer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <% 
            String N=request.getParameter("Healthcentre");
            String V=request.getParameter("Vaccine");
            String A=request.getParameter("Doses");
            String T=request.getParameter("date");
   %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <vacxdistributer:Distributer table="vaccine" values="${N},${V},${A},${T}"/>
    </body>
</html>
