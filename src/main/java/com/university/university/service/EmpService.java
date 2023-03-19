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

    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeDTO.toEntity(employeeDTO);
        Employee saverEmployee =  employeeRepo.save(employee);
        return  EmployeeDTO.toDto(saverEmployee);
    }



    public  EmployeeDTO updateEmployee(EmployeeDTO employeeDTO){
        //Address  address = adsRepo.findById(idAdress).orElse(null);
        Employee employee = EmployeeDTO.toEntity(employeeDTO);
        Employee updated = employeeRepo.save(employee);
        return EmployeeDTO.toDto(updated);
    }


    public  Collection<EmployeeDTO> getAllEmployee(){
         Collection<Employee> employees = employeeRepo.findAll();
        List<EmployeeDTO> dtos = new ArrayList<>();
        for (Employee employee : employees) {
            EmployeeDTO dto = new EmployeeDTO();
            dto.setId(employee.getId());
            dto.setFirstname(employee.getFirstname());
            dto.setLastname(employee.getLastname());
            dto.setSalary(employee.getSalary());

            if (employee.getAddress() != null){
                dto.setAddressid(employee.getAddress().getId());
            }else {
                dto.setAddressid(null);
            }
            dtos.add(dto);
        }
       return dtos;
    }




    public  void deleteEmployee(Integer id){
         this.employeeRepo.deleteById(id);

    }


}

