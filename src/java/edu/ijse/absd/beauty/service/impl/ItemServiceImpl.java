/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service.impl;

import com.google.gson.Gson;
import edu.ijse.absd.beauty.model.ItemModel;
import edu.ijse.absd.beauty.repository.ItemDao;
import edu.ijse.absd.beauty.service.ItemService;
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
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    public boolean addItem(ItemModel itemModel) {

        Serializable s = itemDao.add(itemModel);
        return null != s;

    }

//    public String viewItem() {
//        ArrayList<ItemModel> model = (ArrayList<ItemModel>) itemDao.viewAll();
//        if (!model.isEmpty()) {
//            String jsonArray = new Gson().toJson(model);
//            return jsonArray;
//        }
//        return "List is Empty";
//    }

    public boolean deleteItem(String value) {
        return itemDao.delete(value);
    }

//    public boolean updateItem(ItemModel itemModel) {
//        return itemDao.update(itemModel);
//    }
    public String viewItems(String mcm, String scm) {

        try {
            ArrayList<String> list = itemDao.viewItemSCM(mcm, scm);
            ObjectMapper objectMapper = new ObjectMapper();
            String itemValues = objectMapper.writeValueAsString(list);
            return itemValues;
        } catch (IOException ex) {
            Logger.getLogger(ItemServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "emptylist";
    }
}
