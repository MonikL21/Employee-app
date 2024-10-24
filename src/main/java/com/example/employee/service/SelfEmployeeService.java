package com.example.employee.service;

import com.example.employee.models.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("EmployeeService")
public class SelfEmployeeService implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public SelfEmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> getAllEmployeeDetails() {
        return employeeRepository.findAll();

    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        Optional<Employee> emp= employeeRepository.findById(employeeId);
        if(emp.isPresent())
            return emp.get();
        return null;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee emp=new Employee();
        emp.setEmployeeId(employee.getEmployeeId());
        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        emp.setAge(employee.getAge());
        emp.setDepartment(employee.getDepartment());
        emp.setPosition(employee.getPosition());
        return employeeRepository.save(emp);

    }
}
