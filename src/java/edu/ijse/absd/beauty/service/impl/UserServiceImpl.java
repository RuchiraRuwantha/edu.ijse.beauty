/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service.impl;

import edu.ijse.absd.beauty.model.UserModel;
import edu.ijse.absd.beauty.repository.UserDao;
import edu.ijse.absd.beauty.repository.impl.UserDaoImpl;
import edu.ijse.absd.beauty.service.UserService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ruchira
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean registerUser(UserModel userModel) {

        Serializable add = userDao.add(userModel);
        return null != add;
    }

    public String loginUser(UserModel userModel) {
        List<UserModel> userModels = userDao.viewAll();
        if (userModels.isEmpty()) {
            return "first user";
        } else if (!userModels.isEmpty()) {
            UserModel model = userDao.search(userModel);
            if (null != model) {
                return "valid user";
            }
        }
        return "invalid user";
    }
}
