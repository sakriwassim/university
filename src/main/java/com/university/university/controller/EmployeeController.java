package com.university.university.controller;
import com.university.university.model.dto.EmployeeDto;
import com.university.university.model.entity.Employee;
import com.university.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmpService empService ;


    @GetMapping("/Employees/{id}")
    public EmployeeDto getEmployeeById(@PathVariable("id") Integer id){
      return empService.getEmployeeById(id);
    }
    @PostMapping("/Employees")
    public Employee addEmployee(@RequestBody Employee employee){

        return empService.addEmployee(employee);
    }
    @PutMapping ("/Employees")
    public Employee updateEmployee(@RequestBody Employee employee,@RequestBody Integer idAdress){
        return empService.updateEmployee(employee , idAdress);
    }

    @GetMapping("/Employees")
    public Collection<EmployeeDto> getAllEmployees(){
        return empService.getAllEmployee();
    }

    @DeleteMapping("/Employees/{id}")
    public void deleteEmployee(@PathVariable("id") Integer id){
         empService.deleteEmployee(id);
    }

}
