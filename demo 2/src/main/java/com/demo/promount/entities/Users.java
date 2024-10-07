package com.demo.promount.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Calendar;

@Entity
public class Users {
    @Id
    private Integer Id;

    @Column
    private String fullName;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String emailAddress;

    @Column
    private Calendar createdAt;

    @ManyToOne
    @Column
    private Integer countryCode;

    private Integer getId(){
        return Id;
    }
    private void setId(Integer id){
        Id=id;
    }

    private String getFullName(){
        return fullName;
    }
    private void setFullName(String fullName){
        fullName=fullName;
    }

    private String getPassword(){
        return password;
    }
    private void setPassword(String password){
        password=password;
    }

    private String getEmailAddress(){
        return emailAddress;
    }
    private void setEmailAddress(String emailAddress){
        emailAddress=emailAddress;
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
