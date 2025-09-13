package com.example.education.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.education.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String>
{

}
