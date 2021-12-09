<%--   Document   : inventorystatus
    Created on : Dec 7, 2021, 11:36:53 PM
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
        
        
       
         <h1 style="text-align: center ">Inventory Status</h1>
         
         
         
    <div class="container">  
   <form id ="contact" action="Inventory" method ="post">
    <h4>Showing the Vaccine Inventory</h4>
    <table>
        <tr>
            <td>Date:</td>
            <td>
    <fieldset>
      <input placeholder="Date" type='date' name='date' tabindex="1" required autofocus>
    </fieldset>
       </td>    
    </tr>
    
    
    <tr>
        <td>Vaccine Name:</td>
        <td>
    <fieldset>
     <input placeholder="Vaccine name" type='text' name='Vaccine' tabindex="2" required>
    </fieldset>
    </td>
    </tr>
    
    
    <tr>
        <td>Number of Doses:</td>
        
        <td>
     <fieldset>
      <input placeholder="Doze Amount" type='number' name='Doses' tabindex="3" required>
    </fieldset>
        </td>
    </tr>
    <tr>
        <td>Save:</td>
        <td>
    <fieldset>
      <input type='submit' value='Register vaccine'id="contact-submit" >
    </fieldset>
        </td>
    </tr>
    </table>
  </form>
</div>
             
  
  
           
         
    
        
 
    </body>
</html>
