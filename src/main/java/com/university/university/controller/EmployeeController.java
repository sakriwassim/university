package com.university.university.controller;


import com.university.university.model.entity.Employee;
import com.university.university.repository.EmpRepo;
import com.university.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmpService empService ;


    @GetMapping("/get-emp")
    public Employee getUser(@RequestParam Integer id ){
      return empService.getUser(1);
    }
    @GetMapping("/get-all")
    public Employee getAll(@RequestParam Integer id ){
        return empService.getUser(1);
    }




}
