package com.example.employee.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;          // Unique identifier for the employee
    private String name;             // Full name of the employee
    private int age;                 // Age of the employee
    private String department;       // Department the employee works in
    private String position;         // Job title or position
    private double salary;
}
