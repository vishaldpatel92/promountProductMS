package com.demo.promount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItems {
    @ManyToOne
    @Column
    private Integer orderId;

    @ManyToOne
    @Column
    private Integer productId;

    @Column
    private Integer quantity;

    @Column
    private Double price;

    @Column
    private Double gst;

    private Integer getOrderId(){
        return orderId;
    }
    private void setOrderId(Integer orderId){
        orderId=orderId;
    }

    private Integer getProductId(){
        return productId;
    }
    private void setProductId(String productId){
        productId=productId;
    }

    private Integer getQuantity(){
        return quantity;
    }
    private void setQuantity(Integer quantity){
        quantity=quantity;
    }

    private Double getPrice(){
        return price;
    }
    private void setPrice(Double price){
        price=price;
    }

    private Double getGst(){
        return gst;
    }
    private void setGst(Double gst){
        gst=gst;
    }
}
