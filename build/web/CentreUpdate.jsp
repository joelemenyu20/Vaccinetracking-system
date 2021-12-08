<%-- 
    Document   : CentreUpdate
    Created on : Dec 4, 2021, 5:20:38 PM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="healthcentretld" uri="/WEB-INF/tlds/healthcentretld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Centre</h1>
        
           <form action="UpdateServlet" method="post"> 
            <tr>
               
               <td>Name:</td> 
               <td><input type='text' name='nme'></td>
           </tr>
           <tr>
               <td>Location</td> 
               <td> <input type='text' name='lctn'></td>
           </tr>
            <tr>
               <td></td> 
               <td> <input type='submit' value='save'></td>
           </tr>
           </form> 
        <healthcentretld:update table="healthcentres" newvalue="${name},${location}" where="${id}"></healthcentretld:update>

    </body>
</html>
