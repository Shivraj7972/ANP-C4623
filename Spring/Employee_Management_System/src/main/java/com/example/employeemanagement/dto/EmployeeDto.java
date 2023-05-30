package com.example.employeemanagement.dto;

import lombok.Data;

@Data
public class EmployeeDto 
{
    private Long id;
    private String firstName;
    private String lastName;
    private DepartmentDto department;
}
