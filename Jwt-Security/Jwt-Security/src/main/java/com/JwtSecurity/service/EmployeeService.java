package com.JwtSecurity.service;

import com.JwtSecurity.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private List<Employee> empList = new ArrayList<>();

    public EmployeeService()
    {
        empList.add(new Employee(UUID.randomUUID().toString(),"jainendra","techec92@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(),"sandeep","sand92@gmail.com"));
    }
    public List<Employee> getEmployeeList()
    {
        return empList;
    }
}
