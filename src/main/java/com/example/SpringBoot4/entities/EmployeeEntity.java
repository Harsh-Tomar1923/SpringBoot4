package com.example.SpringBoot4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {

    String name;
    Long salary;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, Long salary) {
        this.name = name;
        this.salary = salary;

        this.id = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public Long getId() {
        return id;
    }


}