/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository.impl;

import edu.ijse.absd.beauty.model.UserModel;
import edu.ijse.absd.beauty.repository.UserDao;
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
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(UserModel userModel) {

        return factory.getCurrentSession().save(userModel);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(UserModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UserModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<UserModel> viewAll() {
        Query q = factory.getCurrentSession().createQuery("from UserModel");
        ArrayList<UserModel> arrayList = (ArrayList<UserModel>) q.list();
        return arrayList;
    }

    public UserModel search(UserModel userModel) {
        Query q = factory.getCurrentSession().createQuery("from UserModel where user_role=:x and user_Name=:y");
        q.setParameter("x", userModel.getRole());
        q.setParameter("y", userModel.getUser_Name());
        UserModel model = (UserModel) q.uniqueResult();
        return model;
    }

}
