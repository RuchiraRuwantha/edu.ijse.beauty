/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service.impl;

import edu.ijse.absd.beauty.model.SubCatagoryModel;
import edu.ijse.absd.beauty.repository.SubCategoryDao;
import edu.ijse.absd.beauty.service.SubCategoryService;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ruchira
 */
@Transactional
@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryDao subCategoryDao;

    public boolean addSubCategory(SubCatagoryModel subCatagoryModel) {

        Serializable s = subCategoryDao.add(subCatagoryModel);
        return null != s;
    }

    public String getSubCategory(String mcm) {
        try {
            ArrayList<String> list = subCategoryDao.viewSubMCM(mcm);
            ObjectMapper mapper = new ObjectMapper();
            String subCategory = mapper.writeValueAsString(list);
            return subCategory;
        } catch (IOException ex) {
            Logger.getLogger(SubCategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "emptylist";
    }

}
