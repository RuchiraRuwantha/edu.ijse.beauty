/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository;

import edu.ijse.absd.beauty.model.ItemModel;
import java.util.ArrayList;

/**
 *
 * @author Ruchira
 */
public interface ItemDao extends SuperDao<ItemModel> {

    public ArrayList<String> viewItemSCM(String mcm, String scm);

}
