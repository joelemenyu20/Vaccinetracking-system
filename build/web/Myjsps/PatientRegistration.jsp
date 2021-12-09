<%-- 
    Document   : PatientRegistration
    Created on : Dec 8, 2021, 6:47:02 PM
    Author     : JOJO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Registration</title>
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
                height:500px;
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
    <body style="background-color:#99ffff">
        
         <div class="form-data">
           <form action="User" method="post">
        <div align = "center">
        <h1>REGISTER PATIENT</h1>
        </div>
            <table>
                <tr>
                    <td>NIN:</td>
                       <td><input class="textinput" type="text" name="NIN"></td>
                 </tr>
                 <tr>
                     <td>Patient Name:</td>
                        <td><input class="textinput" type="text" name="patientname"></td>
                 </tr>
                   <tr>
                       <td>Date of Administration:</td>
                        <td><input class="textinput" type="text" name="administrationdate"></td>
                   </tr>
                   <tr>
                       <td>Batch Number:</td>
                       <td><input class="textinput" type="text" name="batchnumber"></td>
                   </tr>
                   <tr></tr>
                   <tr>
                       <td>Vaccine Administered:</td>
                       <td> <input class="textinput" type="text" name="vaccine"></td>
                   </tr>
                 <tr>
                     <td></td>
                     <td><input class="button" type="submit" name="sub" value="Register"></td>
                  </tr>
             </table>
        </form>
        </div>
    </body>
</html>
