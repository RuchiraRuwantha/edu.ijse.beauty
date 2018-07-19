/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.controller;

import edu.ijse.absd.beauty.model.MainCatagoryModel;
import edu.ijse.absd.beauty.service.MainCategoryService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ruchira
 */
@Controller
@RequestMapping("maincategory")
public class MainCategoryController {

    @Autowired
    private MainCategoryService mainCategoryService;

    @RequestMapping(value = "/addMainCategory", method = RequestMethod.POST)
    public void addMainCategory(@ModelAttribute("model") MainCatagoryModel mainCatagoryModel, HttpServletResponse response) throws IOException {
        boolean isAdded = mainCategoryService.addMainCategory(mainCatagoryModel);
        if (isAdded) {
            response.getWriter().write("Main Category is successfully added.");
        } else {
            response.getWriter().write("Error.");
        }
    }
    
    @RequestMapping(value = "/getMainCategory", method = RequestMethod.GET)
    public void viewMainCategory(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String msg = mainCategoryService.viewMainCategoty();
        response.getWriter().write(msg);
    }

    
}
