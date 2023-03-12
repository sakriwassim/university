package com.university.university.model.entity;


import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Mission {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int duration;
    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees;
}
