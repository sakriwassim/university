package com.university.university.controller;
import com.university.university.model.entity.Address;
import com.university.university.model.entity.Employee;
import com.university.university.service.AdsService;
import com.university.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class AddressController {

    @Autowired
    private AdsService adsService ;


    @GetMapping("/Addresses/{id}")
    public Address getaddessById(@PathVariable("id") Integer id){
      return adsService.getAddressById(id);
    }
    @PostMapping("/Addresses")
    public Address addaddess(@RequestBody Address address){
        return adsService.addAddress(address);
    }
    @PutMapping ("/Addresses")
    public Address updateAddess(@RequestBody Address address){
        return adsService.updateAddress(address);
    }

    @GetMapping("/Addresses")
    public Collection<Address> getAllAddesses(){
        return adsService.getAllAddress();
    }

    @DeleteMapping("/Addresses/{id}")
    public void deleteAddress(@PathVariable("id") Integer id){
         adsService.deleteAddress(id);
    }

}
