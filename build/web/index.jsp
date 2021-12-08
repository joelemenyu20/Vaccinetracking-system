<%-- 
    Document   : index
    Created on : Dec 4, 2021, 4:15:14 AM
    Author     : JOJO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
         <style>
            *{
                font-family: 'Poppins', sans-serif;
            }
            
            .form-container{
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
                width:60%;
                margin-left:auto;
                margin-right:auto;
                display:flex;
                justify-content: center;
                border-radius: 20px;
            }
            
            .field-container{
                margin:2em;
                justify-content: center;

            }
            
            .inpttxt{
                border:0px solid black;
                padding:1.5em;
                border-radius:9px;
                background:#e6ecf5;
                width:200px;
            }
            
            .field-container-btn{
                display:flex;
                justify-content: center;
            }
            
            .btn{
                background-color:#ed5d15;
                padding:1em;
                border-radius: 20px;
                border:0px;
                color:white;
            }
        </style>
    </head>
    <body style="background-color:">
        <h1 style="text-align: center ">LOGIN</h1>
      <div class="form-container" >
          <div>
                
            <form action="/Vaccine-Administration-tracker/Registration" method="post">
                   <div class="field-container">
                       Email:
                       <input class="inpttxt" type="email" name="email">
                   </div>
                   <div class="field-container">
                       Password:
                       <input class="inpttxt" type="password" name="password">
                   </div>
                   <div class="field-container-btn">
                      <input class="btn" type="submit" name="sub" value="Login">
                   </div>
                  <a href="/Vaccine-Administration-tracker/Myjsps/UserRegistration.jsp">Register</a>
            </form>  
          </div>
            
      </div>
        
    </body>
</html>




