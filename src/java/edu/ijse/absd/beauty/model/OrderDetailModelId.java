/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Ruchira
 */
@Embeddable
public class OrderDetailModelId implements Serializable {

    private Integer order_Id;
    private Integer item_Id;

    public OrderDetailModelId() {
    }

    public OrderDetailModelId(Integer order_Id, Integer item_Id) {
        this.order_Id = order_Id;
        this.item_Id = item_Id;
    }

    public Integer getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(Integer order_Id) {
        this.order_Id = order_Id;
    }

    public Integer getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(Integer item_Id) {
        this.item_Id = item_Id;
    }
}
