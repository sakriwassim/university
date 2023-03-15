package com.university.university.repository;

import com.university.university.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepRepo extends JpaRepository<Department, Integer> {
}

