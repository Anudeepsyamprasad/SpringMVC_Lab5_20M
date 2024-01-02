package com.asplab.employeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asplab.employeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
