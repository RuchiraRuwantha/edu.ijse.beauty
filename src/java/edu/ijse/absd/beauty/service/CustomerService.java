/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service;

import edu.ijse.absd.beauty.model.CustomerModel;

/**
 *
 * @author Ruchira
 */
public interface CustomerService {

    public int registerCustomer(CustomerModel customerModel);

    public String loginCustomer(CustomerModel customerModel);
    
}
