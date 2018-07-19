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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Ruchira
 */
@Entity
public class OrderModel extends SuperModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer order_Id;

    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private CustomerModel customerModel;

    @OneToOne(mappedBy = "orderModel", cascade = CascadeType.ALL)
    private PaymentModel paymentModel;

    @OneToMany(targetEntity = OrderDetailsModel.class, cascade = CascadeType.ALL, mappedBy = "orderModel")
    private List<OrderDetailsModel> orderDetailModel = new ArrayList<OrderDetailsModel>();

    private String date;
    private double amount;

    public Integer getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Integer order_Id) {
        this.order_Id = order_Id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CustomerModel getCustomerModel() {
        return customerModel;
    }

    public void setCustomerModel(CustomerModel customerModel) {
        this.customerModel = customerModel;
    }

    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    public List<OrderDetailsModel> getOrderDetailModel() {
        return orderDetailModel;
    }

    public void setOrderDetailModel(ArrayList<OrderDetailsModel> orderDetailModel) {
        this.orderDetailModel = orderDetailModel;
    }

}
