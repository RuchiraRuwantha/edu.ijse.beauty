/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service;

import edu.ijse.absd.beauty.model.SubCatagoryModel;

/**
 *
 * @author Ruchira
 */
public interface SubCategoryService {

    public boolean addSubCategory(SubCatagoryModel subCatagoryModel);

    public String getSubCategory(String mcm);

}
