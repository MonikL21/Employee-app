package com.example.employee.service;

import com.example.employee.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployeeDetails();
    Employee getEmployeeById(Long id);
    Employee addEmployee(Employee employee);
}
