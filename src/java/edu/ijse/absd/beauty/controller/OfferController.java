/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.controller;

import edu.ijse.absd.beauty.model.OfferModel;
import edu.ijse.absd.beauty.service.OfferService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ruchira
 */
@Controller
@RequestMapping("offer")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @RequestMapping(value = "/addOffer", method = RequestMethod.POST)
    public void addOffer(@ModelAttribute("model") OfferModel offerModel, HttpServletResponse response) throws IOException {
        boolean isAdded = offerService.addOffer(offerModel);
        if (isAdded) {
            response.getWriter().write("Offer is successfully added.");
        } else {
            response.getWriter().write("Error.");
        }
    }
}
