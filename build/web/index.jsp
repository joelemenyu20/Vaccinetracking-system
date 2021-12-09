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
            
            .form-data{
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
                width:40%;
                margin-left:auto;
                margin-right:auto;
                display:flex;
                justify-content: center;
                border-radius: 15px;
                height:300px;
            }
            
                        
            .textinput{
                border:0px solid black;
                padding:1.5em;
                border-radius:9px;
                background:#e6ecf5;
                width:200px;
            }
            
            .button{
                background-color:#6633ff;
                padding:1em;
                border-radius: 20px;
                border:0px;
                color:white;
            }
        </style>
    </head>
    <body style="background-color:#ccffcc">
        <h1 style="text-align: center ">LOGIN</h1>
      <div class="form-data" >
          <div>
                
            <form action="loginValidation" method="post">
                <table>
                   <tr>
                       <td>Username:</td>
                       <td><input class="textinput" type="email" name="email"></td>
                   </tr>
                   <tr>
                       <td>Password:</td>
                       <td><input class="textinput" type="password" name="password"></td>
                   </tr>
                   <tr>
                       <td>
                       <td><input class="button" type="submit" name="sub" value="Login"></td>
                   </tr>
                   <tr>
                       <td>Don't have an account? </td>
                       <td><a href="/Vaccine-Administration-tracker/Myjsps/UserRegistration.jsp">Register</a> </td>
                   </tr>
                </table>
            </form>  
              
          </div>
            
      </div>
        
    </body>
</html>




