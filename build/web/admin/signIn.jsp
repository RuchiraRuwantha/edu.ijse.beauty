<%-- 
    Document   : index
    Created on : Oct 19, 2017, 4:07:08 PM
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
        <ul>
            <li><a>Home</a></li>
            <li><a>Eyes</a>
                <ul>
                    <li><a>All Eyes</a></li>
                    <li><a>Eyeshadow</a></li>
                    <li><a>Eyeliner</a></li>
                    <li><a>Eyebrows</a></li>
                </ul>
            </li>
            <li><a>Lips</a>
                <ul>
                    <li><a>All Lips</a></li>
                    <li><a>Lipstick</a></li>
                    <li><a>Lip Gloss</a></li>
                    <li><a>Lip Liner</a></li>
                </ul>
            </li>
            <li><a>Face</a>
                <ul>
                    <li><a>All Face</a></li>
                    <li><a>Foundation</a></li>
                    <li><a>Primer</a></li>
                    <li><a>Shimmer</a></li>
                    <li><a>Powder</a></li>
                </ul>
            </li>
            <li><a>Skin Care</a>
                <ul>
                    <li><a>All Skin Care</a></li>
                    <li><a>Moisturizer</a></li>
                    <li><a>Cleanser</a></li>
                    <li><a>Face Masks</a></li>
                </ul>
            </li>
            <li><a>Brushes</a>
                <ul>
                    <li><a>All Brushes</a></li>
                    <li><a>Face Brushes</a></li>
                    <li><a>Lip Brushes</a></li>
                    <li><a>Eye Brushes</a></li>
                </ul>
            </li>
        </ul>



        <form action="../user/login" method="POST">
            <table>
                <tr><td>
                        User Name : </td>
                    <td><input type="text" name="user_Name" placeholder="User Name">
                    </td>
                </tr>
                <tr>
                    <td>
                        Role :  
                    </td>
                    <td><select name="user_role">
                            <option>Administrator</option>
                            <option>Client</option>
                        </select></td>
                </tr>
                <tr>
                    <td>
                        Password : </td>
                    <td>
                        <input type="password" name="password" placeholder="Password"></td>
                </tr>
                <tr><td>
                        <input type="submit" name="signin" value="SignIn">
                    </td>
                </tr>
            </table>
        </form>


    </body>
</html>
