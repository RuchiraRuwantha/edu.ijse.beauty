/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service.impl;

import com.google.gson.Gson;
import edu.ijse.absd.beauty.model.OfferModel;
import edu.ijse.absd.beauty.repository.OfferDao;
import edu.ijse.absd.beauty.service.OfferService;
import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ruchira
 */
@Transactional
@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    private OfferDao offerDao;

    public boolean addOffer(OfferModel offerModel) {

        Serializable s = offerDao.add(offerModel);
        return null != s;
    }

    public String viewItem() {
        ArrayList<OfferModel> arrayList = (ArrayList<OfferModel>) offerDao.viewAll();
        if (!arrayList.isEmpty()) {
            String jsonArray = new Gson().toJson(arrayList);
            return jsonArray;
        }
        return "List is Empty";
    }
}
