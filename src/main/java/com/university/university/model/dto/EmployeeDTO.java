package com.university.university.model.dto;


import com.university.university.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Integer id;
    private String firstname;
    private String lastname;
    private Double salary;
    private Integer addressid;

    public static EmployeeDTO toDto(Employee entity) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(entity.getId());
        employeeDTO.setFirstname(entity.getFirstname());
        employeeDTO.setLastname(entity.getLastname());
        employeeDTO.setSalary(entity.getSalary());
        return employeeDTO;
    }


    public static Employee toEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setFirstname(employeeDTO.getFirstname());
        employee.setLastname(employeeDTO.getLastname());
        return employee;
    }


}
