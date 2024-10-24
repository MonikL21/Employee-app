package com.example.employee.repository;

import com.example.employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findById(Long employeeId);
    List<Employee> findAll();
    Employee save(Employee employee);
}
