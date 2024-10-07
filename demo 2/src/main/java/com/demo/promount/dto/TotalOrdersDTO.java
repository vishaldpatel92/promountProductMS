package com.demo.promount.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TotalOrdersDTO {

    private String continent;
    private String country;
    private String vendorName;
    private String productName;
    private Integer totalOrders;
}
