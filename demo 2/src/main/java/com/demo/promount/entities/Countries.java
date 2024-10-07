package com.demo.promount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Countries {

    @OneToMany()
    private Integer code;

    @Column
    private String name;

    @Column
    private String continentName;

    private Integer getCode(){
        return code;
    }
    private void setId(Integer code){
        code=code;
    }

    private String getName(){
        return name;
    }
    private void setName(String name){
        name=name;
    }

    private String getContinentName(){
        return continentName;
    }
    private void setContinentName(String continentName){
        continentName=continentName;
    }
}
