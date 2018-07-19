/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service;

import edu.ijse.absd.beauty.model.ItemModel;

/**
 *
 * @author Ruchira
 */
public interface ItemService {

    public boolean addItem(ItemModel itemModel);

    public String viewItems(String mcm, String scm);

    //public String viewItems(String mcm, String scm);
    
}
