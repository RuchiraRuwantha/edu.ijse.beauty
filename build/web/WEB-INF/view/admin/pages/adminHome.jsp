<%-- 
    Document   : home
    Created on : Oct 13, 2017, 10:42:50 PM
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
                    <li><a class="allFace" href="#">All Face</a></li>
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

        <button class="addItem">Add Item</button>
        <button class="addOffer">Add Offer</button>
        <button class="addBrand">Add Brand</button>
        <button class="addMainCategory">Add Main Category</button>
        <button class="addSubCategory">Add Sub Category</button>

        <div class="addItemForm" style="display: block">
            <h3>Item Details</h3>
            <form action="../item/addItem" method="POST">
                <table>
                    <tr>
                        <td>Item Name : </td>
                        <td><input type="text" name="item_Name" placeholder="Item Name"</td>
                    </tr>
                    <tr>
                        <td>Item Price : </td>
                        <td><input type="text" name="item_Price" placeholder="Item Price"</td>
                    </tr>
                    <tr>
                        <td>Brand Id : </td>
                        <td><input type="text" name="brand_Id" placeholder="Brand Id"</td>
                    </tr>
                    <tr>
                        <td>Sub Category Id : </td>
                        <td><input type="text" name="scat_Id" placeholder="Sub Category Id"</td>
                    </tr>
                    <tr>
                        <td>Offer Id : </td>
                        <td><input type="text" name="offer_Id" placeholder="Offer Id"</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="addItem" value="Add"</td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="addOfferForm" style="display: block">
            <h3>Offer Details</h3>
            <form action="../offer/addOffer" method="POST">
                <table>
                    <tr>
                        <td>Offer Name : </td>
                        <td><input type="text" name="offer_Name" placeholder="Offer Name"</td>
                    </tr>
                    <tr>
                        <td>Start Date : </td>
                        <td><input type="text" name="start_date" placeholder="Start Date"</td>
                    </tr>
                    <tr>
                        <td>End Date : </td>
                        <td><input type="text" name="end_date" placeholder="End Date"</td>
                    </tr>
                    <tr>
                        <td>Offer Value : </td>
                        <td><input type="text" name="offer_value" placeholder="Offer Value"</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="addOffer" value="Add"</td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="addBrandForm">
            <form action="../brand/addBrand" method="POST">
                <table>
                    <tr>
                        <td>Brand Name :</td>
                        <td><input type="text" name="brand_Name" placeholder="Brand Name"</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="addBrand" value="Add"></td>
                    </tr>
                </table>
            </form>
        </div>

        <div class="mainCat container-fluid">
            <form action="../maincategory/addMainCategory" method="POST">
                Main Category Name : <input type="text" name="cat_Name"><br>
                <input type="submit" name="addCat" value="Add">
            </form>
        </div>

        <div class="subCat container-fluid">
            <form action="../subcategory/addSubCategory" method="POST">
                Sub Category Name : <input type="text" name="scat_name"><br><br>
                Main Category Id : <input type="text" name="cat_Id"><br><br>
                <input type="submit" name="addSubCat" value="Add">
            </form>
        </div>
        <script src="../assets/js/adminjs/jquery-2.1.4.js"></script>
        <script src="../assets/js/adminjs/customAdmin.js"></script>
    </body>
</html>
