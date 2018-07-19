/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository.impl;

import edu.ijse.absd.beauty.model.ItemModel;
import edu.ijse.absd.beauty.repository.ItemDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ruchira
 */
@Repository
public class ItemDaoImpl implements ItemDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(ItemModel model) {
        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        Query q = factory.getCurrentSession().createQuery("delete from ItemModel where item_name n=:x");
        q.setParameter("x", value);
        return q.executeUpdate() > 0;
    }

    public boolean update(ItemModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ItemModel search(String value) {
        Query q = factory.getCurrentSession().createQuery("from ItemModel where item_name=:x");
        q.setParameter("x", value);
        return (ItemModel) q.uniqueResult();
    }

    public List<ItemModel> viewAll() {
        Query q = factory.getCurrentSession().createQuery("from ItemModel");
        ArrayList<ItemModel> list = (ArrayList<ItemModel>) q.list();
        return list;
    }

    public ArrayList<String> viewItemSCM(String mcm, String scm) {
        Query q = factory.getCurrentSession().createSQLQuery("SELECT im.item_Name,im.item_Price FROM ItemModel im,SubCatagoryModel scm,MainCatagoryModel mcm WHERE scm.scat_Id=im.scat_Id and mcm.cat_Name=:x and scm.scat_name=:y");
        q.setParameter("x", mcm);
        q.setParameter("y", scm);
        ArrayList<String> arrayList = (ArrayList<String>) q.list();
        return arrayList;
    }

}
