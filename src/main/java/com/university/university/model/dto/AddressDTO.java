package com.university.university.model.dto;

import com.university.university.model.entity.Address;
import lombok.Builder;

@Builder
public class AddressDTO {

    private  Integer id ;
    private String streetName;
    private String houseNumber;
    private String zipCode;
    public static AddressDTO toDto(Address entity){
        return AddressDTO.builder()
                .id(entity.getId())
                .streetName(entity.getStreetName())
                .houseNumber(entity.getHouseNumber())
                .zipCode(entity.getZipCode())
                .build();

    }




}
