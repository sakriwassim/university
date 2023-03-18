package com.university.university.controller;
import com.university.university.model.entity.Department;
import com.university.university.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class DepartmentController {

    @Autowired
    private DepService depService ;


    @GetMapping("/Departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){
      return depService.getDepartmentById(id);
    }
    @PostMapping("/Departments")
    public Department addDepartment(@RequestBody Department Department, @RequestParam Integer idAdress){
        return depService.addDepartment(Department, idAdress);
    }
    @PutMapping ("/Departments")
    public Department updateDepartment(@RequestBody Department Department,@RequestBody Integer idAdress){
        return depService.updateDepartment(Department , idAdress);
    }

    @GetMapping("/Departments")
    public Collection<Department> getAllDepartments(){
        return depService.getAllDepartment();
    }

    @DeleteMapping("/Departments/{id}")
    public void deletedepartment(@PathVariable("id") Integer id){
        depService.deleteDepartment(id);
    }

}
