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
public class OfferModel extends SuperModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer offer_Id;
    private String offer_Name;
    private String start_date;
    private String end_date;
    private Double offer_value;

    @OneToMany(targetEntity = ItemModel.class, cascade = CascadeType.ALL, mappedBy = "offerModel")
    private List<ItemModel> itemModel = new ArrayList<ItemModel>();

    public Integer getOffer_Id() {
        return offer_Id;
    }

    public void setOffer_Id(Integer offer_Id) {
        this.offer_Id = offer_Id;
    }

    public String getOffer_Name() {
        return offer_Name;
    }

    public void setOffer_Name(String offer_Name) {
        this.offer_Name = offer_Name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Double getOffer_value() {
        return offer_value;
    }

    public void setOffer_value(Double offer_value) {
        this.offer_value = offer_value;
    }

    public List<ItemModel> getItemModel() {
        return itemModel;
    }

    public void setItemModel(List<ItemModel> itemModel) {
        this.itemModel = itemModel;
    }

}
