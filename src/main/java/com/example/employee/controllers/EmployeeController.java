package com.example.employee.controllers;


import com.example.employee.models.Employee;
import com.example.employee.service.SelfEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class EmployeeController
{
    private SelfEmployeeService employeeService;
    private EmployeeController(SelfEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
            return new ResponseEntity<>("Service is up and running!", HttpStatus.OK);
    }


    @GetMapping("employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id)
    {
        Employee emp=employeeService.getEmployeeById(id);
        ResponseEntity<Employee> res= new ResponseEntity<>(emp, HttpStatus.OK);
        return res;
    }
    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployeeDetails()
    {
        List<Employee> emp=employeeService.getAllEmployeeDetails();
        ResponseEntity<List<Employee>> res= new ResponseEntity<>(emp, HttpStatus.OK);
        return res;
    }
    @PostMapping("/employee")
    public  ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        Employee emp=employeeService.addEmployee(employee);
        ResponseEntity<Employee> res= new ResponseEntity<>(emp, HttpStatus.OK);
        return res;
    }
}
