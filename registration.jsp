<%-- 
    Document   : registration
    Created on : Dec 8, 2021, 10:57:38 PM
    Author     : istech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="Vaccine" method="POST">
    <h2>Registering New Vaccines </h2>
   
    <table>
        <tr>
            <td>Name of Vaccine:</td>
            <td>
    <fieldset>
      <input type='text' name='vaccine' tabindex="1" required autofocus>
    </fieldset>
       </td>    
    </tr>
    
    
    <tr>
        <td>Number of doses:</td>
        <td>
    <fieldset>
     <input type='text' name='doses' tabindex="2" required>
    </fieldset>
    </td>
    </tr>
    
    <tr>
        <td>Date Vaccine is received:</td>
        
        <td>
     <fieldset>
      <input type='date' name='date' tabindex="3" required>
    </fieldset>
        </td>
    </tr>
    <tr>
        <td>Register:</td>
        <td>
    <fieldset>
      <input type='submit' value='Register'id='contact-submit' >
    </fieldset>
        </td>
    </tr>
    </table>
  </form>
    </body>
</html>
