package com.university.university.repository;

import com.university.university.model.entity.Employee;
import com.university.university.model.entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepo extends JpaRepository<Mission, Integer> {
}

