package com.university.university.controller;
import com.university.university.model.entity.Employee;
import com.university.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Employee addEmployee(@RequestBody Employee employee, @RequestParam Integer idAdress){
        return empService.addEmployee(employee, idAdress);
    }
    @PutMapping ("/Employees")
    public Employee updateEmployee(@RequestBody Employee employee,@RequestBody Integer idAdress){
        return empService.updateEmployee(employee , idAdress);
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
