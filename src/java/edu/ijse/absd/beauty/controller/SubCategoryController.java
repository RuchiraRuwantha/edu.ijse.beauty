/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.controller;

import edu.ijse.absd.beauty.model.SubCatagoryModel;
import edu.ijse.absd.beauty.service.SubCategoryService;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ruchira
 */
@Controller
@RequestMapping("subcategory")
public class SubCategoryController {

    @Autowired
    private SubCategoryService categoryService;

    @RequestMapping(value = "/addSubCategory", method = RequestMethod.POST)
    public void addSubCategory(@ModelAttribute("model") SubCatagoryModel subCatagoryModel, HttpServletResponse response) throws IOException {
        boolean isAdded = categoryService.addSubCategory(subCatagoryModel);
        if (isAdded) {
            response.getWriter().write("Sub Category is successfully added.");
        } else {
            response.getWriter().write("Error.");
        }
    }

    @RequestMapping(value = "/getSubCategory", method = RequestMethod.GET)
    public void viewSubCategory(@RequestParam("mcm") String mcm, HttpServletResponse response) throws IOException {
        String subcat = categoryService.getSubCategory(mcm);
        response.getWriter().write(subcat);
    }
}