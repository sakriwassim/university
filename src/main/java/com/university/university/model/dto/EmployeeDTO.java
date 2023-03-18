package com.university.university.model.dto;


import com.university.university.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
    public  class EmployeeDTO {

    private Integer id;
    private String firstname;
    private String lastname;
    private Double salary;
    private Integer addressid;

    public  static EmployeeDTO toDto(Employee entity){
        return EmployeeDTO.builder()
                .id(entity.getId())
                .firstname(entity.getFirstname())
                .lastname(entity.getLastname())
                .salary(entity.getSalary())
                .addressid(entity.getAddress().getId())
                .build();

    }
}
