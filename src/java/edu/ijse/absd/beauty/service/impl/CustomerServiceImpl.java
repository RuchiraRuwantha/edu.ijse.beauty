/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.service.impl;

import edu.ijse.absd.beauty.model.CustomerModel;
import edu.ijse.absd.beauty.model.UserModel;
import edu.ijse.absd.beauty.repository.CustomerDao;
import edu.ijse.absd.beauty.service.CustomerService;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public int registerCustomer(CustomerModel customerModel) {

        Serializable s = customerDao.add(customerModel);
        if (null != s) {
            return 1;
        }
        return 0;
    }

    public String loginCustomer(CustomerModel customerModel) {

        List<CustomerModel> customerModels = customerDao.viewAll();
        if (customerModels.isEmpty()) {
            return "first customer";
        } else if (!customerModels.isEmpty()) {
            CustomerModel model = customerDao.search(customerModel);
            if (null != model) {
                return "valid customer";
            }
        }
        return "invalid customer";

    }

}
