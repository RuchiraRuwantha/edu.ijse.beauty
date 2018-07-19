/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.controller;

import edu.ijse.absd.beauty.model.CustomerModel;
import edu.ijse.absd.beauty.service.CustomerService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ruchira
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    //@ResponseBody
    public String customerRegister(Model model,@ModelAttribute("customer") CustomerModel customerModel, HttpServletResponse response) throws IOException {

        if (customerService.registerCustomer(customerModel) > 0) {
            response.getWriter().write("client/pages/clientHome");
        }
        response.getWriter().write("../client/index");
        model.addAttribute("customerModel", new CustomerModel());
        return "../../client/index";
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model, HttpServletRequest request){
        model.addAttribute("customerModel", new CustomerModel());
        return "../../client/index";
    }
    

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginUser(@ModelAttribute("model") CustomerModel customerModel) {
        String loginUser = customerService.loginCustomer(customerModel);
        ModelAndView mav = new ModelAndView();
        if (loginUser.equals("first customer")) {
            mav.setViewName("client/pages/clientHome");
            return mav;
        } else if (loginUser.equals("valid customer")) {
            mav.addObject("loggedUser", customerModel);
            mav.setViewName("client/pages/clientHome");
            return mav;
        } else {
            mav.setViewName("../../client/index");
            return mav;
        }
    }
}
