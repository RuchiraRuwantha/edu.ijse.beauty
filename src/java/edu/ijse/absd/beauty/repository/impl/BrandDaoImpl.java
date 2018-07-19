/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository.impl;

import edu.ijse.absd.beauty.model.BrandModel;
import edu.ijse.absd.beauty.repository.BrandDao;
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
public class BrandDaoImpl implements BrandDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(BrandModel model) {
        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(BrandModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BrandModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<BrandModel> viewAll() {
        Query q = factory.getCurrentSession().createQuery("from brandmodel");
        ArrayList<BrandModel> arrayList = (ArrayList<BrandModel>) q.list();
        return arrayList;
    }

    public BrandModel search(BrandModel brandModel) {
        Query q = factory.getCurrentSession().createQuery("from brandmodel where brand_Name=:x");
        q.setParameter("x", brandModel.getBrand_Name());
        return (BrandModel) q.uniqueResult();
    }
}
