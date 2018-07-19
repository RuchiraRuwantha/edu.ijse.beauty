/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.controller;

import edu.ijse.absd.beauty.model.BrandModel;
import edu.ijse.absd.beauty.service.BrandService;
import java.io.IOException;
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
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "/addBrand", method = RequestMethod.POST)
    public void addBrand(@ModelAttribute("model") BrandModel brandModel, HttpServletResponse response) throws IOException {

        boolean isAdded=brandService.addBrand(brandModel);
        
        if (isAdded) {
            response.getWriter().write("Brand is successfully added.");
        } else {
            response.getWriter().write("Error.");
        }
    }
}
