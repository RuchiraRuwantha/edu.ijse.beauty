/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ruchira
 */
@Entity
public class OrderDetailsModel extends SuperModel implements Serializable{

    @EmbeddedId
    private OrderDetailModelId detailModelId;

    private Double unit_price;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "order_Id", referencedColumnName = "order_Id", insertable = false, updatable = false)
    private OrderModel orderModel;

    @ManyToOne
    @JoinColumn(name = "item_Id", referencedColumnName = "item_Id", insertable = false, updatable = false)
    private ItemModel itemModel;

    public OrderDetailModelId getDetailModelId() {
        return detailModelId;
    }

    public void setDetailModelId(OrderDetailModelId detailModelId) {
        this.detailModelId = detailModelId;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OrderModel getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(OrderModel orderModel) {
        this.orderModel = orderModel;
    }

    public ItemModel getItemModel() {
        return itemModel;
    }

    public void setItemModel(ItemModel itemModel) {
        this.itemModel = itemModel;
    }

}
