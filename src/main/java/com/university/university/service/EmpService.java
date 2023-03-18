package com.university.university.service;
import com.university.university.model.dto.EmployeeDTO;
import com.university.university.model.entity.Address;
import com.university.university.model.entity.Employee;
import com.university.university.repository.AdsRepo;
import com.university.university.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service
public class EmpService {
    @Autowired
    private EmployeeRepo employeeRepo ;
    @Autowired
    private AdsRepo adsRepo ;

    public EmployeeDTO getEmployeeById(Integer id ){
        Optional<Employee> emp = employeeRepo.findById(id);
        if (emp.isPresent())
            return EmployeeDTO.toDto(emp.get());
        else
        return null;
    }

    public  Employee addEmployee(Employee employee){
      Integer idAddress = employee.getAddress().getId();
     Address address = adsRepo.findById(idAddress).orElse(null);
     if (address != null) {
         employee.setAddress(address);
       //  employee.setAddressid(idAddress);
         Employee added = employeeRepo.save(employee);
         return added;
        }
        System.out.println("any address find with this id");
        return null;
    }

    public  Employee updateEmployee(Employee employee, Integer idAdress){
        Address  address = adsRepo.findById(idAdress).orElse(null);
        employee.setAddress(address);
        Employee updated = employeeRepo.save(employee);
        return updated;
    }


    public  Collection<EmployeeDTO> getAllEmployee(){
         Collection<Employee> employees = employeeRepo.findAll();
        List<EmployeeDTO> dtos = new ArrayList<>();
        for (Employee employee : employees) {
            EmployeeDTO dto = new EmployeeDTO();
            dto.setId(employee.getId());
            dto.setFirstname(employee.getFirstname());
            dto.setSalary(employee.getSalary());

//          dto.setAddressid(employee.getAddress().getId());
            dtos.add(dto);
        }
       return dtos;
    }




    public  void deleteEmployee(Integer id){
         this.employeeRepo.deleteById(id);

    }


}

