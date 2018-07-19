/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service.impl;

import com.google.gson.Gson;
import edu.ijse.absd.beauty.model.BrandModel;
import edu.ijse.absd.beauty.model.ItemModel;
import edu.ijse.absd.beauty.repository.BrandDao;
import edu.ijse.absd.beauty.service.BrandService;
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
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    public boolean addBrand(BrandModel brandModel) {

        Serializable s = brandDao.add(brandModel);
        return null != s;
    }

    public String viewAll(){
        ArrayList<BrandModel> model = (ArrayList<BrandModel>) brandDao.viewAll();
        if (!model.isEmpty()) {
            String jsonArray = new Gson().toJson(model);
            return jsonArray;
        }
        return "List is Empty";
    }
}
