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

/**
 *
 * @author Ruchira
 */
@Entity
public class ItemModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer item_Id;

    private String item_Name;
    private double item_Price;

    @ManyToOne
    @JoinColumn(name = "scat_Id")
    private SubCatagoryModel subCatagoryModel;

    @ManyToOne
    @JoinColumn(name = "offer_Id")
    private OfferModel offerModel;

    @ManyToOne
    @JoinColumn(name = "brand_Id")
    private BrandModel brandModel;

    @OneToMany(targetEntity = OrderDetailsModel.class, cascade = CascadeType.ALL, mappedBy = "itemModel")
    private List<OrderDetailsModel> orderDetailmodel = new ArrayList<OrderDetailsModel>();

    public ItemModel() {
    }

    public ItemModel(Integer item_Id, String item_Name, double item_Price, SubCatagoryModel subCatagoryModel, OfferModel offerModel, BrandModel brandModel) {
        this.item_Id = item_Id;
        this.item_Name = item_Name;
        this.item_Price = item_Price;
        this.subCatagoryModel = subCatagoryModel;
        this.offerModel = offerModel;
        this.brandModel = brandModel;
    }

    public Integer getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(Integer item_Id) {
        this.item_Id = item_Id;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public double getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(double item_Price) {
        this.item_Price = item_Price;
    }

    public SubCatagoryModel getSubCatagoryModel() {
        return subCatagoryModel;
    }

    public void setSubCatagoryModel(SubCatagoryModel subCatagoryModel) {
        this.subCatagoryModel = subCatagoryModel;
    }

    public OfferModel getOfferModel() {
        return offerModel;
    }

    public void setOfferModel(OfferModel offerModel) {
        this.offerModel = offerModel;
    }

    public BrandModel getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(BrandModel brandModel) {
        this.brandModel = brandModel;
    }

    public List<OrderDetailsModel> getOrderDetailmodel() {
        return orderDetailmodel;
    }

    public void setOrderDetailmodel(ArrayList<OrderDetailsModel> orderDetailmodel) {
        this.orderDetailmodel = orderDetailmodel;
    }

}
