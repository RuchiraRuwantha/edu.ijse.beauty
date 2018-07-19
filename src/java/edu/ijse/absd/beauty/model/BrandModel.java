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
public class BrandModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer brand_Id;
    private String brand_Name;
    private String img_Path;

    @OneToMany(targetEntity = ItemModel.class, cascade = CascadeType.ALL, mappedBy = "brandModel")
    private List<ItemModel> itemModel = new ArrayList<ItemModel>();

    public BrandModel() {
    }

    public BrandModel(Integer brand_Id, String brand_Name, String img_Path) {
        this.brand_Id = brand_Id;
        this.brand_Name = brand_Name;
        this.img_Path = img_Path;
    }

    public BrandModel(Integer brand_Id, List<ItemModel> itemModel, String brand_Name, String img_Path) {
        this.brand_Id = brand_Id;
        this.itemModel = itemModel;
        this.brand_Name = brand_Name;
        this.img_Path = img_Path;
    }

    public Integer getBrand_Id() {
        return brand_Id;
    }

    public void setBrand_Id(Integer brand_Id) {
        this.brand_Id = brand_Id;
    }

    public String getBrand_Name() {
        return brand_Name;
    }

    public void setBrand_Name(String brand_Name) {
        this.brand_Name = brand_Name;
    }

    public String getImg_Path() {
        return img_Path;
    }

    public void setImg_Path(String img_Path) {
        this.img_Path = img_Path;
    }

    public List<ItemModel> getItemModel() {
        return itemModel;
    }

    public void setItemModel(List<ItemModel> itemModel) {
        this.itemModel = itemModel;
    }

}
