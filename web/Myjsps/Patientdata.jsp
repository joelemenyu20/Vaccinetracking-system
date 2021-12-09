<%-- 
    Document   : Patientdata
    Created on : Dec 8, 2021, 6:48:21 PM
    Author     : JOJO
--%>

<%
            String N = request.getParameter("NIN");
            String pname = request.getParameter("patientname");
            String admindate = request.getParameter("administrtiondate");
            String bnumber = request.getParameter("batchnumber");
            String vaccine = request.getParameter("vaccine");
%>

<%@taglib prefix="patient" uri="/WEB-INF/tlds/Patient" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <patient:Patient table="users" values="${N},${pname},${admindate},${bnumber},${vaccine}"/>
    </body>
</html>
