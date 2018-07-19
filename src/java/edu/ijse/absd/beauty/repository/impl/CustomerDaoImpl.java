/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository.impl;

import edu.ijse.absd.beauty.model.CustomerModel;
import edu.ijse.absd.beauty.repository.CustomerDao;
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
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(CustomerModel model) {
        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(CustomerModel model) {
        factory.getCurrentSession().update(model);
        return true;
    }

    public CustomerModel search(String value) {
        Query q = factory.getCurrentSession().createQuery("from CustomerModel where customer_name=:n");
        q.setParameter("n", value);
        CustomerModel model = (CustomerModel) q.uniqueResult();
        return model;
    }

    public List<CustomerModel> viewAll() {
        Query q = factory.getCurrentSession().createQuery("from CustomerModel");
        ArrayList<CustomerModel> arrayList = (ArrayList<CustomerModel>) q.list();
        return arrayList;
    }

    public CustomerModel search(CustomerModel customerModel) {
        Query q = factory.getCurrentSession().createQuery("from CustomerModel where customer_name=:x");
        q.setParameter("x", customerModel.getCustomer_name());
        CustomerModel model = (CustomerModel) q.uniqueResult();
        return model;
    }

}
