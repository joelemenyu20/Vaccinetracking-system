<%-- 
    Document   : UserREgistration
    Created on : Dec 4, 2021, 5:58:17 AM
    Author     : JOJO
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
        <style>
            *{
                font-family: 'Poppins', sans-serif;
            }
            
            .form-data{
                box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
                width:50%;
                margin-left:auto;
                margin-right:auto;
                display:flex;
                justify-content: center;
                border-radius: 15px;
                height:500px;            }
            
           
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
    <body style="background-color:#ffcccc">
        <div class="form-data">
        <form action="User" method="post">
            <div align = "center">
        <h1>REGISTER USER</h1>
        </div>
            <table>
                   <tr>
                       <td>First name:&nbsp;</td>
                       <td><input class="textinput" type="text" name="fname"></td>
                   </tr>
                    <tr>
                        <td>Last name:&nbsp;</td>
                        <td><input class="textinput" type="text" name="lname"></td>
                   </tr>
                    <tr>
                        <td>Email:&nbsp;</td>
                        <td><input class="textinput" type="text" name="email"></td>
                   </tr>
                   <tr>
                       <td> Username:&nbsp;</td>
                       <td><input class="textinput" type="text" name="username"></td>
                   </tr>
                   <tr>
                       <td>Password:&nbsp;</td>
                       <td> <input class="textinput" type="password" name="password"></td>
                   </tr>
                 <tr>
                     <td></td>
                     <td><input class="button" type="submit" name="sub" value="save"></td>
                  </tr>
            </table>    
        </form>
        </div>
       </body>
</html>


