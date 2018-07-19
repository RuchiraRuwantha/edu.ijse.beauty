/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
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
public class MainCatagoryModel extends SuperModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cat_Id;
    private String cat_Name;

    @OneToMany(targetEntity = SubCatagoryModel.class, cascade = CascadeType.ALL, mappedBy = "mainCatagoryModel")
    private List<SubCatagoryModel> subCatagoryModel = new ArrayList<SubCatagoryModel>();

    public MainCatagoryModel() {
    }

    public MainCatagoryModel(Integer cat_Id, String cat_Name) {
        this.cat_Id = cat_Id;
        this.cat_Name = cat_Name;
    }

    public MainCatagoryModel(Integer cat_Id, String cat_Name, List<SubCatagoryModel> subCatagoryModel) {

        this.subCatagoryModel = subCatagoryModel;
        this.cat_Id = cat_Id;
        this.cat_Name = cat_Name;
    }

    public Integer getCat_Id() {
        return cat_Id;
    }

    public void setCat_Id(Integer cat_Id) {
        this.cat_Id = cat_Id;
    }

    public String getCat_Name() {
        return cat_Name;
    }

    public void setCat_Name(String cat_Name) {
        this.cat_Name = cat_Name;
    }

    public List<SubCatagoryModel> getSubCatagoryModel() {
        return subCatagoryModel;
    }

    public void setSubCatagoryModel(List<SubCatagoryModel> subCatagoryModel) {
        this.subCatagoryModel = subCatagoryModel;
    }

}
