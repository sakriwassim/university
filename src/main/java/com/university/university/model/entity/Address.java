package com.university.university.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address    {
    @Id
    @GeneratedValue
    private  Integer id ;
    private String streetName;
    private String houseNumber;
    private String zipCode;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
