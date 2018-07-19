<%-- 
    Document   : index
    Created on : Oct 18, 2017, 12:16:06 PM
    Author     : Ruchira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="../assets/css/clientcss/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="../assets/css/clientcss/customClient.css" rel="stylesheet" type="text/css">


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
        <a class="register" href="#">Register</a>
        <a class="login" href="#">LogIn</a>

        <br>
        <div class="col-lg-6 registerForm">
            <h2>Customer Registration</h2>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">Customer Name : </div>
                <div class="col-lg-8"><input type="text" name="customer_name"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">Street Address 1 : </div>
                <div class="col-lg-8"><input type="text" name="street_address1"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">Street Address 2 : </div>
                <div class="col-lg-8"><input type="text" name="street_address2"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">City : </div>
                <div class="col-lg-8"><input type="text" name="city"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">Tele No : </div>
                <div class="col-lg-8"><input type="text" name="tel_no"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">Email : </div>
                <div class="col-lg-8"><input type="text" name="email"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">Password : </div>
                <div class="col-lg-8"><input type="password" name="password"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <div class="col-lg-4 text-info">Date of Birth : </div>
                <div class="col-lg-8"><input type="text" name="dob"></div>
            </div>
            <div class="col-lg-12" style="padding: 3px">
                <input type="submit" name="btn_submit" value="Add Customer">
            </div>
                 
<!--            <form:form action="../customer/register" modelAttribute="customerModel">
                <form:input path="customer_name"/>
                <form:input path="street_address1"/>
                <form:input path="street_address2"/>
                <form:input path="city"/>
                <form:input path="tel_no"/>
                <form:input path="email"/>
                <form:input path="password"/>
                <form:input path="dob"/>
                <input type="submit" id="btn_submit">


            </form:form>-->

             

        </div>
        <div class="loginForm" style="display: block">
            <form action="../customer/login" method="POST" id="login">
                <table>
                    <tr>
                        <td>
                            <p>User Name : </p>
                        </td>
                        <td><input type="text" name="customer_name" placeholder="User Name">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p>Password : </p>
                        </td>
                        <td>
                            <input type="password" name="password" placeholder="Password">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" name="login" value="LogIn">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <script src="../assets/js/clientjs/jquery-2.1.4.js"></script>
        <script src="../assets/js/clientjs/customClient.js"></script>
    </body>
</html>
