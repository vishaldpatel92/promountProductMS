package com.demo.promount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Calendar;

@Entity
public class Products {
    @Id
    private Integer Id;

    @Column
    private String name;

    @ManyToOne
    @Column
    private Integer vendorId;

    @Column
    private Integer price;

    @Column
    private String status;

    @Column
    private Calendar createdAt;

    @Column
    private String productImage;

    public Integer getId(){
        return Id;
    }
    public void setId(Integer id){
        Id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        name=name;
    }

    public Integer getVendorId(){
        return vendorId;
    }
    public void setVendorId(Integer vendorId){
        vendorId=vendorId;
    }

    public Integer getPrice(){
        return price;
    }
    public void setPrice(Integer price){
        price=price;
    }

    public Calendar getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(Calendar createdAt){
        createdAt=createdAt;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        status=status;
    }

    public String getProductImage(){
        return productImage;
    }
    public void setProductImage(String productImage){
        productImage=productImage;
    }
}
