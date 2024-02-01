package com.JwtSecurity.controller;

import com.JwtSecurity.models.Employee;
import com.JwtSecurity.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
@AllArgsConstructor
@Slf4j
public class HomeController {


    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployeeList()
    {
        log.info("Get Employee List ");
        // http://localhost:8080/welcome/employee
        return  employeeService.getEmployeeList();

    }



}

