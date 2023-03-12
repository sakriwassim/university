package com.university.university.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;


    @OneToMany(mappedBy = "department")
    private List<Employee> employees;


}
