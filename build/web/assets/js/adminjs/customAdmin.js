/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$('.addItemForm').hide();
$('.addBrandForm').hide();
$('.addOfferForm').hide();
$('.mainCat').hide();
$('.subCat').hide();

$('.addItem').click(function () {
    $('.addItemForm').toggle();
});

$('.addOffer').click(function () {
    $('.addOfferForm').toggle();
});

$('.addBrand').click(function () {
    $('.addBrandForm').toggle();
});

$('.addMainCategory').click(function () {
    $('.mainCat').toggle();
});

$('.addSubCategory').click(function () {
    $('.subCat').toggle();
});

function getMCData() {
    var ajaxConfigure = {
        type: "GET",
        url: "../maincategory/getMCData",
        async: true,
        data: ""
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                if (response != "emptyList") {
                    console.log("get data ok");
                    var_mcm = JSON.parse(response);
                }
            });
}