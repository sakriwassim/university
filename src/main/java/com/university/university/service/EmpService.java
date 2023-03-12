package com.university.university.service;
import com.university.university.model.dto.EmployeeDto;
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

    public EmployeeDto getEmployeeById(Integer id ){
        Optional<Employee> emp = empRepo.findById(id);
        if (emp.isPresent())return EmployeeDto.toDto(emp.get());
        return null;

    }

    public  EmployeeDto addEmployee(EmployeeDto employee){

        return EmployeeDto.toDto(empRepo.save(Employee.ToEntity(employee)));
    }
    public  EmployeeDto updateEmployee(EmployeeDto employee){
        EmployeeDto updated = EmployeeDto.toDto(empRepo.save(Employee.ToEntity(employee)));
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

