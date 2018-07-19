/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository.impl;

import edu.ijse.absd.beauty.model.MainCatagoryModel;
import edu.ijse.absd.beauty.repository.MainCategoryDao;
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
public class MainCategoryDaoImpl implements MainCategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Serializable add(MainCatagoryModel model) {

        return sessionFactory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(MainCatagoryModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MainCatagoryModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<MainCatagoryModel> viewAll() {
        Query createQuery = sessionFactory.getCurrentSession().createQuery("from MainCategoryModel");
        ArrayList<MainCatagoryModel> list = (ArrayList<MainCatagoryModel>) createQuery.list();
        return list;
    }

}
