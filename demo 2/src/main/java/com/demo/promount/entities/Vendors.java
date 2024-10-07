package com.demo.promount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Calendar;

@Entity
public class Vendors {
    @Id
    private Integer Id;

    @ManyToOne
    @Column
    private Integer countryCode;

    @Column
    private String vendorName;

    @ManyToOne
    @Column
    private Integer adminId;

    @Column
    private Calendar createdAt;

    private Integer getId(){
        return Id;
    }
    private void setId(Integer id){
        Id=id;
    }

    private String getVendorName(){
        return vendorName;
    }
    private void setVendorName(String vendorName){
        vendorName=vendorName;
    }

    private Calendar getCreatedAt(){
        return createdAt;
    }
    private void setCreatedAt(Calendar createdAt){
        createdAt=createdAt;
    }

    private Integer getCountryCode(){
        return countryCode;
    }
    private void setCountryCode(Integer countryCode){
        countryCode=countryCode;
    }
}
