/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Ruchira
 */
@Entity
public class PaymentModel extends SuperModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer payment_Id;

    @OneToOne
    @JoinColumn(name = "order_Id")
    private OrderModel orderModel;

    private String date;
    private double amount;

    public Integer getPayment_Id() {
        return payment_Id;
    }

    public void setPayment_Id(Integer payment_Id) {
        this.payment_Id = payment_Id;
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

    public OrderModel getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(OrderModel orderModel) {
        this.orderModel = orderModel;
    }

}
