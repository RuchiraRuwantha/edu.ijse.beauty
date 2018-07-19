<%-- 
    Document   : home
    Created on : Oct 13, 2017, 10:43:27 PM
    Author     : Ruchira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../assets/css/clientcss/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="../assets/css/clientcss/customClient.css" rel="stylesheet" type="text/css">

        <title>Beauty</title>
    </head>
    <body>
        <div class="container-fluid">

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
                <li><a>Item Manage</a>
                    <ul>
                        <li><a class="filterItems" href="#">Filter Items</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="filterItemForm container-fluid">
            <form action="../item/viewItems" method="GET">
                <table>
                    <tr>
                        <td>
                            Main Category : 
                        <td/>
                        <td>
                            <select class="maincategory" id="main_category_combo">
                                <option>Eyes</option>
                                <option>Lips</option>
                                <option>Face</option>
                                <option>Skin</option>
                                <option>Brushes</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Sub Category : 
                        <td/>
                        <td>
                            <select class="subCategory" id="sub_category_combo">

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" name="submit" id="filterItems" value="Filter">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="itemTable container-fluid">
            <table id="item-table">
                <tbody>
                    
                </tbody>
            </table>
        </div>
        <script src="../assets/js/clientjs/jquery-2.1.4.js"></script>
        <script src="../assets/js/clientjs/customClient.js"></script>
    </body>
</html>
