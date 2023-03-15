package com.university.university.service;

import com.university.university.model.entity.Address;
import com.university.university.repository.AdsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AdsService {
    @Autowired
    private AdsRepo adsRepo ;

    public Address getAddressById(Integer id ){
        Optional<Address> ads = adsRepo.findById(id);
        return ads.orElse(null);
    }

    public  Address addAddress(Address address){
        return adsRepo.save(address);
    }
    public  Address updateAddress(Address address){
        Address updated = adsRepo.save(address);
        return updated;
    }


    public  Collection<Address> getAllAddress(){
         Collection<Address> list = adsRepo.findAll();
       return list;
    }

    public  void deleteAddress(Integer id){
         this.adsRepo.deleteById(id);


    }










}

