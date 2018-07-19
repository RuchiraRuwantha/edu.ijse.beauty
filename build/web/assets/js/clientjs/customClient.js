/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var var_scm;
var var_item;
$(document).ready(function () {
    alert("0000");
    console.log("ready");
});
$('.registerForm').hide();
$('.loginForm').hide();
$('.filterItemForm').hide();
$('.register').click(function () {
    $('.registerForm').toggle();
});
$('.login').click(function () {
    $('.loginForm').toggle();
});
$('.filterItems').click(function () {
    $('.filterItemForm').toggle();
});
//$('.maincategory').click(function () {
//    var queryString = ""
//    var ajaxConfigure = {
//        type: "GET",
//        url: "../subcategory/getSubCategory?" + queryString,
//        async: true,
//        data: ""
//    };
//    $.ajax(ajaxConfigure)
//            .done(function (response) {
//                if (response != "emptylist") {
//                    var_scm = JSON.parse(response);
//                }
//            });
//});

$("#main_category_combo").on("change", function () {
    console.log($("#main_category_combo").val());
    if ($("#main_category_combo").val() != "") {
        $("#sub_category_combo").empty();
        var queryString = "mcm=" + encodeURIComponent($("#main_category_combo").val());
        var ajaxConfigure = {
            type: "GET",
            url: "../subcategory/getSubCategory?" + queryString,
            async: true,
            data: ""
        };
        $.ajax(ajaxConfigure)
                .done(function (response) {
                    console.log(response);
                    var subList = JSON.parse(response);
                    console.log(subList);
                    var html = "";
                    for (var i = 0; i < subList.length; i++) {
                        html += "<option>" + subList[i] + "</option>";
                    }
                    $("#sub_category_combo").append(html);
                });
    }
});
//$('#filterItems').click(function getItem() {
//
//    var queryString = "mcm=" + encodeURIComponent($("#main_category_combo").val()) + "&" + "scm=" + encodeURIComponent($("#sub_category_combo").val());
//    var ajaxConfigure = {
//        type: "GET",
//        url: "../item/viewItems?" + queryString,
//        async: true,
//        data: ""
//    };
//    $.ajax(ajaxConfigure)
//            .done(function (response) {
//                if (response != "emptylist") {
//                    console.log(response);
//                    var itemList = JSON.parse(response);
//                    console.log(itemList);
//                    $("#item-table tbody").empty();
//                    var html;
//                    if (itemList != undefined) {
//                        for (var i = 0; i < itemList.length; i++) {
//                            html += "<tr class='info'><td>" + itemList[i].item_Name + "</td> <td>" + itemList[i].item_Price + "</td></tr>";
//                        }
//                    }
//                    $("#item-table tbody").append(html);
//                    $("#item-table").DataTable();
//                }
//            });
$(document).ready(function () {
    alert("0000");
});
$("#btn_submit").click(function customer_register() {
    $('#customermodel').submit(function (e) {

        var frm = $('#customermodel');
        e.preventDefault();
        var data = {};
        var Form = this;
        //Gather Data also remove undefined keys(buttons)
        $.each(this, function (i, v) {
            var input = $(v);
            data[input.attr("name")] = input.val();
            delete data["undefined"];
        });
        $.ajax({
        contentType: 'application/json; charset=utf-8',
                type: 'POST',
                url: '../customer/register',
                dataType: 'json',
                data: JSON.stringify(data),
                success: function (callback) {
                    console.log("success");
                    alert("success");
                }
        },
//                error: function () {
//                console.log("Error");
//                $(this).html("Error!");
//                }
    );
});
});
//        });
//});
//function fillItem() {
//    $("#item-table tbody").empty();
//    var html;
//    if (var_item != undefined) {
//        for (var i = 0; i < var_item.length; i++) {
//            html += "<tr class='info'><td>" + var_item[i].item_Name + "</td> <td>" + var_item[i].item_Price + "</td></tr>";
//        }
//    }
//    $("#item-table tbody").append(html);
//    $("#item-table").DataTable();
//}
//    $('.subCategory').empty();
//
//    var html;
//    var option;
//    if (var_mcm != undefined) {
//        for (var i = 0; i < var_scm.length; i++) {
//            option += "<option>" + var_scm[i].scat_name + "</option>";
//            //html += "<tr class='info'><td>" + var_scm[i].scat_name + "</td></tr>";
//        }
//    }
//
//    $('.subCategory').append(option);