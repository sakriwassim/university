package com.university.university.service;

import com.university.university.model.entity.Department;
import com.university.university.repository.DepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class DepService {
    @Autowired
    private DepRepo depRepo ;


    public  Department getDepartmentById(Integer id ){
        Optional<Department> dep = depRepo.findById(id);
        return dep.orElse(null);
    }

    public  Department addDepartment(Department Department, Integer idAddress){
       // Address address = adsRepo.findById(idAddress).orElse(null);
       // Department.setAddress(address);
        Department added = depRepo.save(Department);
        return added;
    }

    public  Department updateDepartment(Department Department, Integer idAdress){
//        Address  address = adsRepo.findById(idAdress).orElse(null);
//        Department.setAddress(address);
        Department updated = depRepo.save(Department);
        return updated;
    }


    public  Collection<Department> getAllDepartment(){
         Collection<Department> list = depRepo.findAll();
       return list;
    }

    public  void deleteDepartment(Integer id){
         this.depRepo.deleteById(id);


    }


}

