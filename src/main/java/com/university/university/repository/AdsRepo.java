package com.university.university.repository;

import com.university.university.model.entity.Address;
import com.university.university.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepo extends JpaRepository<Address, Integer> {
}

