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
public class SubCatagoryModel extends SuperModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer scat_Id;
    private String scat_name;
    
    @ManyToOne
    @JoinColumn(name = "cat_Id")
    private MainCatagoryModel mainCatagoryModel;
    
    @OneToMany(targetEntity = ItemModel.class,cascade = CascadeType.ALL,mappedBy = "subCatagoryModel")
    private List<ItemModel> itemModel = new ArrayList<ItemModel>();

    public Integer getScat_Id() {
        return scat_Id;
    }

    public void setScat_Id(Integer scat_Id) {
        this.scat_Id = scat_Id;
    }

    public String getScat_name() {
        return scat_name;
    }

    public void setScat_name(String scat_name) {
        this.scat_name = scat_name;
    }

    public MainCatagoryModel getMainCatagoryModel() {
        return mainCatagoryModel;
    }

    public void setMainCatagoryModel(MainCatagoryModel mainCatagoryModel) {
        this.mainCatagoryModel = mainCatagoryModel;
    }

    public List<ItemModel> getItemModel() {
        return itemModel;
    }

    public void setItemModel(List<ItemModel> itemModel) {
        this.itemModel = itemModel;
    }

    public boolean addscat(SubCatagoryModel subCatagoryModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
