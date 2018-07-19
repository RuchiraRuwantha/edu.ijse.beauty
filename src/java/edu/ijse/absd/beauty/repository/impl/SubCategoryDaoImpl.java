/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository.impl;

import edu.ijse.absd.beauty.model.SubCatagoryModel;
import edu.ijse.absd.beauty.repository.SubCategoryDao;
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
public class SubCategoryDaoImpl implements SubCategoryDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(SubCatagoryModel model) {

        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(SubCatagoryModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SubCatagoryModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<SubCatagoryModel> viewAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<String> viewSubMCM(String mcm) {
        Query q = factory.getCurrentSession().createSQLQuery("SELECT scm.scat_name from SubCatagoryModel scm,MainCatagoryModel mcm WHERE scm.cat_Id=mcm.cat_Id and mcm.cat_Name=:x");
        q.setParameter("x", mcm);
        ArrayList<String> list = (ArrayList<String>) q.list();
        return list;
    }

}
