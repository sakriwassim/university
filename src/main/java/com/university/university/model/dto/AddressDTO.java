package com.university.university.model.dto;

import com.university.university.model.entity.Address;
import com.university.university.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    private  Integer id ;
    private String streetName;
    private String houseNumber;
    private String zipCode;



    public static AddressDTO toDto(Address entity) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(entity.getId());
        addressDTO.setStreetName(entity.getStreetName());
        addressDTO.setHouseNumber(entity.getHouseNumber());
        addressDTO.setZipCode(entity.getZipCode());
        return addressDTO;
    }


    public static Address toEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setStreetName(addressDTO.getStreetName());
        address.setHouseNumber(addressDTO.getHouseNumber());
        address.setZipCode(addressDTO.getZipCode());
        return address;
    }




}
