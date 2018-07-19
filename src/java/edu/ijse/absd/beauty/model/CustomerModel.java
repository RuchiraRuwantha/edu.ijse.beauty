/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ruchira
 */
@Entity
public class CustomerModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cust_Id;

    @OneToMany(targetEntity = OrderModel.class, cascade = CascadeType.ALL, mappedBy = "customerModel")
    private List<OrderModel> orderModel = new ArrayList<OrderModel>();

    private String customer_name;
    private String street_address1;
    private String street_address2;
    private String city;
    private String tel_no;
    private String email;
    private String password;
    private String dob;

    public CustomerModel() {
    }

    public CustomerModel(Integer cust_Id, String customer_name, String street_address1, String street_address2, String city, String tel_no, String email, String password, String dob) {
        this.cust_Id = cust_Id;
        this.customer_name = customer_name;
        this.street_address1 = street_address1;
        this.street_address2 = street_address2;
        this.city = city;
        this.tel_no = tel_no;
        this.email = email;
        this.password = password;
        this.dob = dob;
    }

    public CustomerModel(Integer cust_Id, List<OrderModel> orderModel, String customer_name, String street_address1, String street_address2, String city, String tel_no, String email, String password, String dob) {
        this.cust_Id = cust_Id;
        this.orderModel = orderModel;
        this.customer_name = customer_name;
        this.street_address1 = street_address1;
        this.street_address2 = street_address2;
        this.city = city;
        this.tel_no = tel_no;
        this.email = email;
        this.password = password;
        this.dob = dob;
    }

    public Integer getCust_Id() {
        return cust_Id;
    }

    public void setCust_Id(Integer cust_Id) {
        this.cust_Id = cust_Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public List<OrderModel> getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(List<OrderModel> orderModel) {
        this.orderModel = orderModel;
    }

    public String getStreet_address1() {
        return street_address1;
    }

    public void setStreet_address1(String street_address1) {
        this.street_address1 = street_address1;
    }

    public String getStreet_address2() {
        return street_address2;
    }

    public void setStreet_address2(String street_address2) {
        this.street_address2 = street_address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

}
