<%-- 
    Document   : createNew
    Created on : Oct 20, 2017, 1:16:22 AM
    Author     : Ruchira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../assets/css/admincss/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="../assets/css/admincss/customAdmin.css" rel="stylesheet" type="text/css">
        
        <title>Beauty</title>
    </head>
    <body>
        <form action="../user/register" method="POST">
            User Name : <input type="text" name="user_Name"><br>
            Email : <input type="text" name="email"><br>
            User Role : <input type="text" name="user_role"><br>
            Password : <input type="password" name="password"><br>
            <input type="submit" name="register" value="Register">
        </form>
    </body>
</html>
