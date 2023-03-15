package com.university.university.model.dto;


import com.university.university.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
    public  class EmployeeDto {

    private Integer id;
    private String firstname;
    private String lastname;
    private Double salary;
    private Integer addressid;

    public  static EmployeeDto toDto(Employee entity){
        return EmployeeDto.builder()
                .id(entity.getId())
                .firstname(entity.getFirstname())
                .lastname(entity.getLastname())
                .salary(entity.getSalary())
                .addressid(entity.getAddress().getId())
                .build();

    }
}
