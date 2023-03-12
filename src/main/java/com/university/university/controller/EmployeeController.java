package com.university.university.controller;
import com.university.university.model.entity.Employee;
import com.university.university.repository.EmpRepo;
import com.university.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmpService empService ;


    @GetMapping("/Employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
      return empService.getEmployeeById(id);
    }
    @PostMapping("/Employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return empService.addEmployee(employee);
    }
    @PutMapping ("/Employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return empService.updateEmployee(employee);
    }

    @GetMapping("/Employees")
    public Collection<Employee> getAllEmployees(){
        return empService.getAllEmployee();
    }

    @DeleteMapping("/Employees/{id}")
    public void deleteEmployee(@PathVariable("id") Integer id){
         empService.deleteEmployee(id);
    }

}
