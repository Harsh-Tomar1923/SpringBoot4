package com.example.SpringBoot4.repositories;

import com.example.SpringBoot4.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}