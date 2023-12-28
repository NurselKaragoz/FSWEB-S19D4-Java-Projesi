package com.workintech.main.services;

import com.workintech.main.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findByEmail(String email);
    List<Employee> findBySalaryGreaterThanOrderBySalaryDesc(Double salary);
    List<Employee> findByOrderByLastNameAsc();
}
