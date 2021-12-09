<%-- 
    Document   : distribution
    Created on : Dec 7, 2021, 10:43:57 PM
    Author     : RICHiEART
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     
    <form action="DistributeVaccine" method="POST">
    <h2>Distribution of Vaccines to Health Centers</h2>
   
    <table>
        <tr>
            <td>Name of Health Center:</td>
            <td>
    <fieldset>
      <input type='text' name='Healthcentre' tabindex="1" required autofocus>
    </fieldset>
       </td>    
    </tr>
    
    
    <tr>
        <td>Vaccine name:</td>
        <td>
    <fieldset>
     <input type='text' name='Vaccine' tabindex="2" required>
    </fieldset>
    </td>
    </tr>
    
    <tr>
        <td>Number of doses:</td>
        
        <td>
     <fieldset>
      <input type='number' name='Doses' tabindex="3" required>
    </fieldset>
        </td>
    </tr>
     <td>Date:</td>
        
        <td>
     <fieldset>
      <input type='date' name='date' tabindex="3" required>
    </fieldset>
        </td>
    </tr>
    <tr>
        <td>Distribute:</td>
        <td>
    <fieldset>
      <input type='submit' value='distribute'id='contact-submit' >
    </fieldset>
        </td>
    </tr>
    </table>
  </form>
</div>
             
          
        
        
                
  
    </body>
</html>
