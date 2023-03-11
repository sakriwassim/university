package com.university.university.service;

import com.university.university.model.entity.Employee;
import com.university.university.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo ;

    public Employee getUser(Integer id ){
        Optional<Employee> emp = this.empRepo.findById(id);
        return emp.orElse(null);
//        if (emp.isPresent())
//            return emp.get();
//        return null;
    }


}
