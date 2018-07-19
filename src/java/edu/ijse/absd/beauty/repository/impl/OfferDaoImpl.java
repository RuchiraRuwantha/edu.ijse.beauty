/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository.impl;

import edu.ijse.absd.beauty.model.OfferModel;
import edu.ijse.absd.beauty.repository.OfferDao;
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

public class OfferDaoImpl implements OfferDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(OfferModel model) {

        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(OfferModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OfferModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<OfferModel> viewAll() {
        Query q = factory.getCurrentSession().createQuery("from offermodel");
        ArrayList<OfferModel> arrayList = (ArrayList<OfferModel>) q.list();
        return arrayList;
    }

    public OfferModel search(OfferModel offerModel) {
        Query q = factory.getCurrentSession().createQuery("from offermodel where offer_Name=:x");
        q.setParameter("x", offerModel.getOffer_Name());
        return (OfferModel) q.uniqueResult();
    }
}
