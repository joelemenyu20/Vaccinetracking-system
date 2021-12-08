<%-- 
    Document   : selectcentre
    Created on : Dec 3, 2021, 6:55:35 AM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="healthcentre" uri="/WEB-INF/tlds/healthcentretld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registered Centres</h1>
        <healthcentre:Select table="healthcentres" values=""></healthcentre:Select>
    </body>
</html>
