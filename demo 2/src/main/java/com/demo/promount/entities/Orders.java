package com.demo.promount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Calendar;

@Entity
public class Orders {
    @Id
    private Integer Id;

    @ManyToOne
    @Column
    private Integer userId;

    @Column
    private String status;

    @Column
    private Double totalAmount;

    @Column
    private Calendar createdAt;

    private Integer getId(){
        return Id;
    }
    private void setId(Integer id){
        Id=id;
    }

    private Integer getUserId(){
        return userId;
    }
    private void setUserId(String userId){
        userId=userId;
    }

    private String getStatus(){
        return status;
    }
    private void setStatus(String status){
        status=status;
    }

    private Double getTotalAmount(){
        return totalAmount;
    }
    private void setTotalAmount(String totalAmount){
        totalAmount=totalAmount;
    }

    private Calendar getCreatedAt(){
        return createdAt;
    }
    private void setCreatedAt(Calendar createdAt){
        createdAt=createdAt;
    }
}
