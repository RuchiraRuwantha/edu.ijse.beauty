/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.controller;

import edu.ijse.absd.beauty.model.UserModel;
import edu.ijse.absd.beauty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ruchira
 */
@Controller
//@SessionAttributes("logedUser")
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("model") UserModel userModel) {
        if (userService.registerUser(userModel)) {
            return "admin/pages/adminHome";
        }
        return "client/pages/clientHome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginUser(@ModelAttribute("model") UserModel userModel) {
        String loginUser = userService.loginUser(userModel);
        ModelAndView mav = new ModelAndView();
        if (loginUser.equals("first user")) {
            mav.setViewName("admin/pages/createNewUser");
            return mav;
        } else if (loginUser.equals("valid user")) {
            mav.addObject("loggedUser", userModel);
            mav.setViewName("admin/pages/adminHome");
            return mav;
        } else {
            mav.setViewName("../../index");
            return mav;
        }
    }
}
