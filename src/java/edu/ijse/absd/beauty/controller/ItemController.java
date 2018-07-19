/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.controller;

import edu.ijse.absd.beauty.model.ItemModel;
import edu.ijse.absd.beauty.service.ItemService;
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
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public void addItem(@ModelAttribute("model") ItemModel itemModel, HttpServletResponse response) throws IOException {
        boolean isAdded = itemService.addItem(itemModel);
        if (isAdded) {
            response.getWriter().write("Item is successfully added.");
        } else {
            response.getWriter().write("Error.");
        }
    }

    @RequestMapping(value = "/viewItems", method = RequestMethod.GET)
    public void viewItems(@RequestParam("mcm") String mcm, @RequestParam("scm") String scm, HttpServletResponse response) throws IOException {
        String items = itemService.viewItems(mcm, scm);
        response.getWriter().write(items);
    }
}
