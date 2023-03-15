package com.university.university.service;
import com.university.university.model.entity.Address;
import com.university.university.model.entity.Employee;
import com.university.university.repository.AdsRepo;
import com.university.university.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;
@Service
public class EmpService {
    @Autowired
    private EmployeeRepo employeeRepo ;
    @Autowired
    private AdsRepo adsRepo ;

    public  Employee getEmployeeById(Integer id ){
        Optional<Employee> emp = employeeRepo.findById(id);
        return emp.orElse(null);
    }

    public  Employee addEmployee(Employee employee, Integer idAddress){
        Address address = adsRepo.findById(idAddress).orElse(null);
        employee.setAddress(address);
        Employee added = employeeRepo.save(employee);
        return added;
    }

    public  Employee updateEmployee(Employee employee, Integer idAdress){
        Address  address = adsRepo.findById(idAdress).orElse(null);
        employee.setAddress(address);
        Employee updated = employeeRepo.save(employee);
        return updated;
    }


    public  Collection<Employee> getAllEmployee(){
         Collection<Employee> list = employeeRepo.findAll();
       return list;
    }

    public  void deleteEmployee(Integer id){
         this.employeeRepo.deleteById(id);


    }










}

