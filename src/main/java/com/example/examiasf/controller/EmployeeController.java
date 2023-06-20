package com.example.examiasf.controller;

import com.example.examiasf.dto.EmployeeDTO;
import com.example.examiasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<EmployeeDTO> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
