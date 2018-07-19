/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service.impl;

import com.google.gson.Gson;
import edu.ijse.absd.beauty.model.MainCatagoryModel;
import edu.ijse.absd.beauty.repository.MainCategoryDao;
import edu.ijse.absd.beauty.service.MainCategoryService;
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
public class MainCategoryServiceImpl implements MainCategoryService {

    @Autowired
    private MainCategoryDao mainCategoryDao;

    public String viewMainCategoty() {
        ArrayList<MainCatagoryModel> models = (ArrayList<MainCatagoryModel>) mainCategoryDao.viewAll();
        if (!models.isEmpty()) {
            String jsonArray = new Gson().toJson(models);
            return jsonArray;
        }
        return "emptylist";
    }

    public boolean addMainCategory(MainCatagoryModel mainCatagoryModel) {

        Serializable s = mainCategoryDao.add(mainCatagoryModel);
        return null != s;
    }

}
