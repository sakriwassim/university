package com.university.university.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "addresses")
@NoArgsConstructor
@AllArgsConstructor
public class Address    {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id ;
    private String streetName;
    private String houseNumber;
    private String zipCode;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
