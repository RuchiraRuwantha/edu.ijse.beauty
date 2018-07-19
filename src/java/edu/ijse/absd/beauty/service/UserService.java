/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service;

import edu.ijse.absd.beauty.model.UserModel;

/**
 *
 * @author Ruchira
 */
public interface UserService {
    
    public boolean registerUser(UserModel userModel);

    public String loginUser(UserModel userModel);
}
