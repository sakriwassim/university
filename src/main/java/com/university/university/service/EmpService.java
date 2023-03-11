package com.university.university.service;
import com.university.university.model.entity.Employee;
import com.university.university.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;
@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo ;

    public Employee getEmployeeById(Integer id ){
        Optional<Employee> emp = empRepo.findById(id);
        return emp.orElse(null);
    }

    public  Employee addEmployee(Employee employee){
        Employee emp = empRepo.save(employee);
        return emp;
    }
    public  Employee updateEmployee(Employee employee){
        Employee updated = empRepo.save(employee);
        return updated;
    }


    public  Collection<Employee> getAllEmployee(){
         Collection<Employee> list = empRepo.findAll();
       return list;
    }

    public  void deleteEmployee(Integer id){
         this.empRepo.deleteById(id);


    }










}

