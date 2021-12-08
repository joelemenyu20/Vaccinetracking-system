<%-- 
    Document   : index
    Created on : Dec 2, 2021, 4:28:20 AM
    Author     : Apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="healthcentretld" uri="/WEB-INF/tlds/healthcentretld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Centre</title>
    </head>
    <body>
        <h1>Register Centre</h1>
       <table>
       <form action='RegisterCentreServlet' method='post' >
           <tr>
               <td>Name:</td> 
               <td><input type='text' name='name'></td>
           </tr>
           <tr>
               <td>Location</td> 
               <td> <input type='text' name='location'></td>
           </tr>
            <tr>
               <td></td> 
               <td> <input type='submit' value='save'></td>
           </tr>
            

            </form>
           
        
        </table>
        
        <a href="selectcentre.jsp">select</a>
    </body>
</html>
