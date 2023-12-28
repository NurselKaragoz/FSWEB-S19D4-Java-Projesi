package com.workintech.main.services;

import com.workintech.main.dao.EmployeeRepository;
import com.workintech.main.entity.Employee;
import com.workintech.main.exceptions.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    @Override
    public List<Employee> findByEmail(String email) {
        Optional<Employee> employeeOptional = employeeRepository.findByEmail(email);
        if (employeeOptional.isPresent()) {
            return Collections.singletonList(employeeOptional.get());
        }
        throw new EmployeeException("Employee with given email is not found: " ,  HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Employee> findBySalaryGreaterThanOrderBySalaryDesc(Double salary) {

        return null;
    }

    @Override
    public List<Employee> findByOrderByLastNameAsc() {
        return null;
    }
}
